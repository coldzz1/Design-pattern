package zookeeper;

import org.apache.zookeeper.*;

import java.io.IOException;
import java.util.List;

/**
 * Description:
 * <p>
 * Created by kele on 2020/8/12 9:55
 */
public class ClusterMonitor implements Runnable{
    private static String membershipRoot = "/Members";
    private final Watcher connectionWatcher;
    private final Watcher childrenWatcher;
    private ZooKeeper zk;
    boolean alive = true;

    public ClusterMonitor(String HostPort) throws IOException,InterruptedException, KeeperException {
        connectionWatcher = new Watcher(){
            @Override
            public void process(WatchedEvent event) {
                // TODO Auto-generated method stub
                if(event.getType() == Watcher.Event.EventType.None &&
                        event.getState() == Watcher.Event.KeeperState.SyncConnected){
                    System.out.println("\nconnectionWatcher Event Received:%s"+event.toString());
                }
            }
        };

        childrenWatcher = new Watcher(){
            @Override
            public void process(WatchedEvent event) {
                // TODO Auto-generated method stub
                System.out.println("\nchildrenWatcher Event Received:%s"+event.toString());
                if(event.getType()==Event.EventType.NodeChildrenChanged){
                    try{
                        //Get current list of child znode and reset the watch
                        List<String> children = zk.getChildren(membershipRoot, this);
                        System.out.println("Cluster Membership change,Members: "+children);
                    }catch(KeeperException ex){
                        throw new RuntimeException(ex);
                    }catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                        alive = false;
                        throw new RuntimeException(ex);
                    }
                }
            }
        };

        zk = new ZooKeeper(HostPort,2000,connectionWatcher);
        //Ensure the parent znode exists
        if(zk.exists(membershipRoot, false) == null){
            zk.create(membershipRoot, "ClusterMonitorRoot".getBytes(),
                    ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        }
        //Set a watch on the parent znode
        List<String> children = zk.getChildren(membershipRoot, childrenWatcher);
        System.err.println("Members:"+children);
    }

    public synchronized void close(){
        try{
            zk.close();
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try{
            synchronized(this){
                while(alive){
                    wait();
                }
            }
        }catch(InterruptedException ex){
            ex.printStackTrace();
            Thread.currentThread().interrupt();
        }finally{
            this.close();
        }
    }

    public static void main(String[] args) throws IOException,InterruptedException,KeeperException{

        new ClusterMonitor("2181").run();
    }

}