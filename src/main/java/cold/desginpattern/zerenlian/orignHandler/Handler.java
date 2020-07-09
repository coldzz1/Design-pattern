package cold.desginpattern.zerenlian.orignHandler;

import cold.desginpattern.zerenlian.Request;

/**
 * Description: 处理接口请求
 * Created by ys on 2020/7/9 14:05
 *
 * 总结:根据请求的不同内容编写不同的逻辑方法,然后在if-else中调用符合该if条件下调用的逻辑方法
 * 这里每增加一种可能就需要多编写一个 if 和 处理该if条件的方法
 */
public class Handler {
    /**如果处理流程要改的话,每次我都需要去更改handlerRequest中的代码,增加/删除/一个if和一个处理方法*/
     public void handlerRequest(Request request){
        //得到请求的数据
        String data =request.getData();

        //这里是有可能都执行的情况,如果写成 if -else if ...-else 则只执行符合的一个逻辑方法
        if(data.contains("鸡蛋")) {
            filterEgg(data);
        }
        if (data.contains("傲丙工具")){
            filterAoBing(data);
        }
        //在某年某月产品过来告诉我，需要新增一种类型想要过滤的「白菜」
        //
        //在某年某月产品过来告诉我，需要新增一种类型想要过滤的「鸡腿」
        //
        //在某年某月产品过来告诉我，需要新增一种类型想要过滤的「鸡头」
        //
        //于是我们的Handler处理就可能「膨胀」起来了，可能是这样？
        if (data.contains("白菜")) {
            filterBaiCai(data);
        }
        if (data.contains("鸡头")) {
            filterJiTou(data);
        }
        if (data.contains("鸡腿")) {
            filterJiTui(data);
        }
        // 我到这里就能拿到米豆了。

    }

    private void filterAoBing(String data) {
        //doSomething
    }

    private void filterEgg(String data) {
        //doSomething
    }
    private void filterJiTou(String data) {
        //doSomething
    }

    private void filterJiTui(String data) {
        //doSomething
    }
    private void filterBaiCai(String data){
        //doSomething
    }

}
