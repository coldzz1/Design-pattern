package cold.desginpattern.builderpattern;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Description: design-pattern-demo
 * <p>
 * Created by ys on 2020/7/16 10:35
 */
public class CreateTest {

    public static void main(String[] args) {

        //  调用各种setter方法
        MessageTask messageTask = new MessageTask();

        messageTask.setContent("关注 Java可乐 吧 >>>");

        messageTask.setMessageId(String.valueOf(ThreadLocalRandom.current().nextLong()));

        messageTask.setTaskId("kele");

        messageTask.setTaskName("一起来多人运动");

        System.out.println(messageTask.toString());


        //构造器传入属性值

        MessageTask task = new MessageTask("kele", "关注 Java可乐 吧 >>>", String.valueOf(ThreadLocalRandom.current().nextLong()), "一起来多人运动吧");


        //建造者模式创建对象
        MessageTask build = MessageTask.builder()
                .content("关注 Java可乐吧")
                .messageId(String.valueOf(ThreadLocalRandom.current().nextLong()))
                .taskId("kele")
                .taskName("一起来多人运动吧")
                .build();

        //通过自己写的类用建造者模式创建对象
        MessageTaskDemo.Builder builder = new MessageTaskDemo.Builder();
        MessageTaskDemo messageTaskDemo = builder.content("关注Java可乐吧")
                .messageId(String.valueOf(ThreadLocalRandom.current().nextLong()))
                .taskId("kele")
                .message("一起来多人运动吧")
                .build();



    }
}
