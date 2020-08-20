package cold.apilearn.jdk8;

import cold.common.ManageAccount;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Description:
 * <p>
 * Created by kele on 2020/8/14 17:05
 */
public class StreamCollect {
    //下面是Stream.collect的一些方法
    /**首先需要明确的是 Comparator.comparing()方法默认是 (o1,o2)->o1.compareTo(o2)的比较方式**/
    // Comparator.comparing(Function<? super T, ? extends U> keyExtractor)
    //                                   其中T是返回的Comparator对象的比较类型,U是比较的时候将元素转化的类型
    //比如  Comparator.comparing((String o)->Integer.valeOf(o)); 这里T是String  U为Integer
    //   其实是 返回一个可序列化的Compartor对象,其中比较的时候是对比较的元素先apply 将元素转为Integer在对Integer的元素进行compareTo
    //           return (Comparator<T> & Serializable)
    //             (c1, c2) -> keyExtractor.apply(c1).compareTo(keyExtractor.apply(c2));

    /**其次是(o1,o2)->o1.compareTo(o2) 这种方式可以是 o1.compareTo(o2) 取小的值在前 也可以是o2.compareTo(o1) 取大的值在前**/

    public static void main(String[] args) {

        Comparator<ManageAccount> comparatorForManageAcco = Comparator.comparing(ManageAccount::getId);
        List<ManageAccount> arrayList = new ArrayList<>(Arrays.asList(new ManageAccount(2), new ManageAccount(3), new ManageAccount(1), new ManageAccount(5), new ManageAccount(9)));
        List<ManageAccount> collect1 = arrayList.stream().sorted(comparatorForManageAcco).collect(Collectors.toList());
        for (ManageAccount a:collect1
             ) {
            System.out.print(a.getId());
        }
        System.out.println();
        Comparator<String> comparator = Comparator.comparing(((String O) -> Integer.valueOf(O)),(o1,o2)->o2.compareTo(o1));
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("1", "5", "3", "7", "3"));
        strings.sort(comparator);
        for (String s:strings
             ) {
            System.out.print(s);
        }
        System.out.println();

        //1.Collectors.minby() 有三种形式
        Optional<String> collect = Stream.of("1", "2", "3").collect(Collectors.minBy(Comparator.comparing(o -> Integer.valueOf(o))));
        String s = collect.get();
        System.out.println(s);

        //Collectors.minBy(Comparator<? super T>) 这里如果是 o1,o2-> o2.compareTo(o1) 则是取最大值
        Optional<String> a = Stream.of("2", "3", "1").collect(Collectors.minBy((o2, o1) -> o1.compareTo(o2)));
        System.out.println(a.get());


        Comparator<String> comparing = Comparator.comparing((String o) -> Integer.valueOf(o));
        Optional<String> min = Stream.of("1", "2", "3").min((o1, o2) -> o2.compareTo(o1));
        System.out.println(min.get());

        Optional.ofNullable(arrayList).orElse(new ArrayList<>()).stream().collect(Collectors.toMap(ManageAccount::getId,o->o));

    }
}
