package cold.desginpattern.zerenlian.zerenlianHandler;

import cold.desginpattern.zerenlian.zerenlianHandler.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: design-pattern-demo
 * <p>
 * Created by ys on 2020/7/9 14:18
 */
public class FilterChain {
    List<Filter> filterList=new ArrayList<>();

    //初始化逻辑链路
    public FilterChain(){
        filterList.add(new FilterAoBing());
        filterList.add(new FilterEgg());
        filterList.add(new FilterBaiCai());
        filterList.add(new FilterJiTou());
        filterList.add(new FilterJiTui());
    }

    //循环注册的过滤器 处理数据
    public void processData(String data){
        for (Filter filter:filterList
             ) {
            filter.doFilter(data);
        }
    }
}
