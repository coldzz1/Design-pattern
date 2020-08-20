package cold.apilearn.jdk8;

import cold.common.ManageAccount;
import com.sun.org.apache.xalan.internal.xsltc.dom.SingleNodeCounter;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Description:
 * Created by kele on 2020/8/10 17:42
 */
public class CollectorsDemo {

    public static void main(String[] args) {
        List<? extends Serializable> collect2 = Stream.of("2", 1, 2).collect(Collectors.toList());
        System.out.println(collect2.size());
        List<ManageRolePermission> list =new ArrayList<>(
                Arrays.asList(
                        new ManageRolePermission(1,2,3),
                        new ManageRolePermission(2,3,4),
                        new ManageRolePermission(3,4,5)
                )
        );

        Long collect1 = list.stream().filter(o -> o.getDataType().equals(3)).collect(Collectors.counting());
        long count = list.stream().filter(o -> o.getDataType().equals(3)).count();
        System.out.println(count);
        System.out.println(collect1);


        //Collectors.toMap
        //将List转化为一个Map
        //public static <T, K, U, M extends Map<K, U>>
        //    Collector<T, ?, M> toMap(Function<? super T, ? extends K> keyMapper,
        //                                Function<? super T, ? extends U> valueMapper,
        //                                BinaryOperator<U> mergeFunction,
        //                                Supplier<M> mapSupplier)
        //T是输入参数的类型
        //K是Map的key的类型
        //U是Map的value的类型
        //BinaryOperator<U>  这里是当get(key)!=null时 如何处理,如果不指定的话,会报默认的异常
        //这个是返回的Map的类型

        ConcurrentHashMap<Integer, Integer> collect = list.stream().collect(Collectors.toMap(o -> o.getRoleId(), o -> o.getDataType(), (oldValue, newValue) -> newValue, ConcurrentHashMap::new));



        List<ManageAccount>userList=new ArrayList<>();
        //获取一个list的某一个属性作为key,某一个属性作为value的Map 当get(key)存在值时,如何处理旧的value和此时新的value,默认是报异常,放到一个指定的对象中;
        userList.stream().collect(Collectors.toMap(o->o.getId(),o->o.getZyId(),(oldValue,newValue)->newValue,HashMap::new));
        //获取一个list中的某一个字段对应的所有其他属性的集合
        Map<Integer,List<Integer>>map=new HashMap<>();
        userList.forEach(o->{
            map.compute(o.getRoleId(),(key,value)->(value!=null?value:new ArrayList<>())).add(o.getId());
        });
    }



    /**
     Objects.re
   quireNonNull(remappingFunction);
        Objects.requireNonNull(value);
    V oldValue = get(key);
    V newValue = (oldValue == null) ? value :
            remappingFunction.apply(oldValue, value);
        if(newValue == null) {
        remove(key);
    } else {
        put(key, newValue);
    }
        return newValue;
     **/
    //如果oldVal = get(key) 为null
    //则 newVal = 指定的value
    //如果原本get(key) 存在对应的value 则新的value 是 oldValue 和 value的 返回值
    //如果value为空


}
