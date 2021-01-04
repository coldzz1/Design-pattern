package cold.duoxiancheng;

import java.util.concurrent.atomic.AtomicInteger;

//create by fjf on 20201211 20.30
public class ThreadTest {

    private  volatile AtomicInteger i = new AtomicInteger(10) ;
    private Object object = new Object();



    /**
     *  sleep 方法是让当前线程让出cpu执行权,并且睡眠时间到了不一定会执行当前线程方法，因为当前时间cpu可能在执行其他的事情。
     *  所以调用sleep方法相当于让当前线程出于  阻塞状态
     *  注意sleep方法不会释放当前所持有的锁(如果有的情况下的话)
     */
    /**
     * 而yield方法跟sleep方法相同的是也会让当前线程让出cpu执行权
     * 同样也不会释放当前所持有的锁
     * 区别在于其不能控制其睡眠时间 并且让出其cpu执行权后仍有可能再次被选中
     *
     */
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        MyThread myThread = threadTest.new MyThread();
        MyThread myThread1 = threadTest.new MyThread();
        myThread.start();
        myThread1.start();
    }

    class MyThread extends Thread{


        @Override
        public void run() {
                i.incrementAndGet();
                System.out.println("i:"+i);
                try {
                    System.out.println("线程"+getName()+"进入睡眠状态");
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程"+getName()+"睡眠结束");
                System.out.println("i:"+ i.incrementAndGet());
        }
    }



}
