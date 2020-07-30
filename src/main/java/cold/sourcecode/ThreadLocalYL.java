package cold.sourcecode;

import cold.listenner.Event;
import cold.listenner.Person;
import cold.listenner.PersonListener;
import org.junit.Test;
import org.springframework.security.core.parameters.P;

import java.lang.ref.WeakReference;

/**
 * Description: design-pattern-demo
 * <p>
 * Created by ys on 2020/7/30 16:49
 */
public class ThreadLocalYL {


    @Test
    public void test(){
        /**
         * ThreadLocal的使用很简单,首先创建一个泛型化的ThreadLocal对象,
         * 之后再remove之前去get都能获得之前set的值 (注意:这里是remove之前)
         */
        ThreadLocal<String> threadLocal =new ThreadLocal<>();
        threadLocal.set("方方");
        threadLocal.get();
        threadLocal.remove();
    }

    @Test
    public void test2(){
        //创建一个弱引用指向person对象
        Person person=new Person();
        person.registerPersonListener(new PersonListener() {
            @Override
            public void doEat(Event event) {
                System.out.println("eat");
            }

            @Override
            public void doSleep(Event event) {
                System.out.println("sleep");
            }
        });
        WeakReference<Person> weakReference=new WeakReference(person);
        Person p1 = weakReference.get();
        //如果person = null; Peron对象在GC时就会被回收
        p1.eat();
        System.gc();
    }

    //

}

/**模拟创建Thread类中的ThreadLocal.threadLocalMaps 引用指向的对象类**/
 class Person1 extends WeakReference<Person>{

    //这里的key (Person对象引用是一个弱引用指向创建Person1 对象时的key)
     Object value ;

     public Person1(Person p,Object value) {
         super(p);
     }
 }