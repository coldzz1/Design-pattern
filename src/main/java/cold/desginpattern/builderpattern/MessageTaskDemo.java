package cold.desginpattern.builderpattern;

/**
 * Description: 建造者模式
 * <p>
 *     定义一个内部静态类,写上要创建对象的所有属性,
 *     在内部类中定义这个方法的setter方法,返回值是内部类本身对象(this)
 *     写一个参数为内部类的构造函数,通过参数的属性去给类赋值
 *     最后在内部类写一个builder方法 通过要创建的外部类对象的构造函数以自身为引用创建对象。
 * Created by ys on 2020/7/16 10:55
 */
public class MessageTaskDemo {

    private String taskId;

    private String messageId;

    private String message ;

    private String content ;


    public MessageTaskDemo(Builder builder){
        this.taskId=builder.taskId;
        this.messageId=builder.messageId;
        this.message=builder.message;
        this.content=builder.content;
    }

    public static class Builder{
        private String taskId;

        private String messageId;

        private String message ;

        private String content ;

        public Builder taskId(String taskId){
            this.taskId=taskId;
            return this;
        }

        public Builder messageId(String messageId){
            this.messageId=messageId;
            return this;
        }

        public Builder content(String content){
            this.content=content;
            return this;
        }

        public Builder message (String message){
            this.message=message;
            return this;
        }

        public MessageTaskDemo build(){
            return new MessageTaskDemo(this);
        }
    }
}
