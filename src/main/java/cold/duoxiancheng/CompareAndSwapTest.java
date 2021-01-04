package cold.duoxiancheng;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

//对一个缓存块加锁  或者 是在CPU访问内存的总线上加锁同时只让一个CPU去操作 实现CAS在汇编级别的原子性
//一个宏 : 实现就是 LOCK
//LOCK_IF_MP（LOCK_IF_MULTIPROCESSOR）
//JAVA层面CAS需要保证 CAS是一个院子操作 但实际上UNSAFE类的compareAndSwapInt也不是原子操作
//通过查询发现C++实现是一个 COPXCHG 查找手册发现也不是原子操作 所以通过加LOCK 实现

//乐观锁量大问题：1.ABA问题 2.比较并交换的原子性保证
//ABA问题需要通过布尔或者版本号来保证
//原子性通过LOCK  COMPXCHG
public class CompareAndSwapTest {

   AtomicInteger atomicInteger = new AtomicInteger(1);


    void m() {
        atomicInteger.incrementAndGet();
    }

  /*Integer i = 1;

  void m(){
      i++;
  }
*/
    public static void main(String[] args) {
        List<Thread> list = new ArrayList<>(100);
        CompareAndSwapTest c = new CompareAndSwapTest();
        for (int i = 0; i < 100; i++) {
            list.add(new Thread(c::m, "线程" + i));
        }

        list.stream().forEach(o->o.start());

        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //System.out.println(c.i);
        System.out.println(c.atomicInteger.get());


    }
}
