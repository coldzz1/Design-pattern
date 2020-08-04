package cold.sf.sort.bubblesort;

import org.junit.Test;

/**
 * Description: 冒泡排序算法
 * 时间复杂度 最好的情况下是一次冒泡遍历操作时O(n)  最坏的情况下是数据刚好是倒序的,那需要n次冒泡排序操作 为O(n2)
 * 空间复杂度 只涉及相邻元素的比较与交换 是原地排序算法 只需要常量级的临时空间 为O(1)
 * 当响铃两个元素大小相同的时候 不做交换 所以是稳定的排序算法
 *
 * 可以通过一个标志 对冒泡进行优化,在一次冒泡操作没有进行任何交换的时候 就不在进行后续的冒泡了
 * Created by kele on 2020/8/3 11:37
 */
public class bubble1 {


    @Test
    public void test(){
        int[] i = {3, 2, 3, 5, 1, 0, 9, 8, 1, 3};
        sort(i);
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }
    }


    public static void sort(int array[]){
        if(array==null)return;
        bubbleSort(array,array.length);
    }
    /**
     *
     * @param array
     */
    public static void bubbleSort(int array[],int length){
        if(length<=1) return;

        for (int j = 0; j < array.length; j++) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i]>array[i+1]){
                    int temp =array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    flag=true;//表示一次遍历有数据交换
                }
            }
            if(!flag) break;//没有数据交换,提前退出
        }


    }
}
