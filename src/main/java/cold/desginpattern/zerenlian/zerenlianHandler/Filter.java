package cold.desginpattern.zerenlian.zerenlianHandler;

/**
 * Description: 过滤方法接口
 * Created by ys on 2020/7/9 14:19
 */
public interface Filter {
    //过滤
    void doFilter(String data);
}

//所有过滤的具体实现逻辑方法都需要实现Filter接口
class FilterEgg implements Filter{

    @Override
    public void doFilter(String data) {
        //doSomething
    }
}

class FilterAoBing implements Filter{

    @Override
    public void doFilter(String data) {
        //doSomething
    }
}

class FilterBaiCai implements Filter{

    @Override
    public void doFilter(String data) {
        //doSomething
    }
}

class FilterJiTui implements Filter{

    @Override
    public void doFilter(String data) {
        //doSomething
    }
}

class FilterJiTou implements Filter{

    @Override
    public void doFilter(String data) {
        //doSomething
    }
}
