package cold.listenner;

/**
 * Description: 测试监听器
 *              注册监听器到事件来源的对象中,将事件的来源传递到监听器中去
 *              针对监听器中定义的不同的接口方法,定义不同的触发事件
 * Created by ys on 2020/7/9 15:22
 */
public class Test {

    public static void main(String[] args) {
        Person person=new Person();
        person.registerPersonListener(new PersonListener() {
            @Override
            public void doEat(Event event) {
                Person eventResource = event.getEventResource();
                System.out.println(eventResource+"正在看少妇");
                doEatInvoke();
            }

            @Override
            public void doSleep(Event event) {
                Person eventResource = event.getEventResource();
                System.out.println(eventResource+"正在睡觉");
            }
        });
        person.eat();
    }



    private static void doEatInvoke(){
        System.out.println("我:儿子们别那么庸俗");
    }
}
