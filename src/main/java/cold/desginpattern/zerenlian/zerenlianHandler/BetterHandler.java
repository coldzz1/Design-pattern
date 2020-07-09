package cold.desginpattern.zerenlian.zerenlianHandler;

import cold.desginpattern.zerenlian.Request;

/**
 * Description: 责任链模式来处理多个if条件下都有可能执行的方法
 * <p>
 * Created by ys on 2020/7/9 14:17
 */
public class BetterHandler {

    public void handlerRequest(Request request){
        //得到要处理的数据
        String data = request.getData();
        FilterChain filterChain = new FilterChain();
        //通过责任链处理数据
        filterChain.processData(data);
    }
}
