package cold.desginpattern;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ErrorAlertHandler {
    public void testWait(){







    }



    Lock lock = new ReentrantLock();
    public void test(){
        /*lock.lock();
        lock.tryLock();
        lock.lockInterruptibly();
        lock.unlock();
        Condition condition = lock.newCondition();*/


        //当一个线程调用一个共享变量的wait()方法 该调用线程会被阻塞挂起
        //直到
        synchronized (lock){
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"线程即将被阻塞挂起");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"线程被唤醒");
        }).start();
            }

    }

    public static void main(String[] args) {
        //如果调用wait()方法的线程没有事先获取该对象的监视器锁 则调用wait()方法时
        //调用该wait 方法的线程会抛出异常
        new ErrorAlertHandler().test();
    }
}


