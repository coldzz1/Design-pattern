package cold.desginpattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;

@SpringBootTest
class DesignPatternDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public  void test(){
        BiFunction<Integer,Integer,Object> biFunction=(a , b)->{
            String s = String.valueOf(a + b);
            return s;
        };
        HashMap<Object, List> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("a", new ArrayList(Arrays.asList("cd","ad")));
        objectObjectHashMap.compute("a",(k,v)->v==null?new ArrayList<>():v).add("b");
        System.out.println(objectObjectHashMap.get("a").get(0));

    }

}
