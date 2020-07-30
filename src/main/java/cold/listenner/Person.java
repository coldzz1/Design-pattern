package cold.listenner;

/**
 * Description: 事件源
 *              事件源要在事件发生方法上注册监听器(即在事件源上关联监听器)
 * Created by ys on 2020/7/9 15:14
 */
public class Person {

    private String nickName ="(潘晋达,叶城)";
    private String relation ="儿子们";

    private PersonListener personListener;
    //事件源中的关联方法-吃东西
    public void eat(){

        //当事件源调用了eat方法,应该会触发监听器的方法,调用监听器的方法并把事件对象传递进去
        personListener.doEat(new Event(this));
    }

    //事件源的关联方法-睡觉
    public void sleep(){

        //当事件源调用了sleep方法,应该会触发监听器的方法,调用监听器的方法,并把事件对象传递进去
        personListener.doSleep(new Event(this));
    }

    //注册监听器(将监听器关联事件)
    public void registerPersonListener(PersonListener personListener){
        this.personListener=personListener;
    }

    @Override
    public String toString() {
        return relation+nickName;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("被回收了");
        super.finalize();
    }
}
