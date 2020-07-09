package cold.listenner;

/**
 * Description: 事件
 *              在监听器上通过事件把事件源传递进去,告诉监听器这个事件发生的来源是谁
 * Created by ys on 2020/7/9 15:23
 */
public class Event {
    private Person person;

    public Event(Person person){
        this.person=person;
    }

    //获取这个事件的来源 告诉监听器这个事件发生了之后 要对这个事件来源做什么处理
    public Person getEventResource(){
        return person;
    }
}
