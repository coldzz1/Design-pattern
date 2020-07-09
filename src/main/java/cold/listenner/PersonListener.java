package cold.listenner;

/**
 * Description: 事件监听器
 *              监听Person事件流的eat和sleep方法
 * Created by ys on 2020/7/9 15:12
 */
public interface PersonListener {

    //定义方法 传递事件
    void doEat(Event event);
    void doSleep(Event event);
}
