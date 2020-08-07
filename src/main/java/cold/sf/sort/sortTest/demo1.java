package cold.sf.sort.sortTest;

import org.junit.Test;

/**
 * Description:
 * 冒泡排序最终版本
 * 1.根据冒泡排序的原理,对相邻的元素进行比较,把大的元素向上移动,直到遇到第一个比其大的元素停止移动,在对下一个元素进行比较移动,直到一次冒泡操作结束,进行下一次冒泡操作,
 * 如果一次冒泡排序的最后一次被交换的元素不是要排序的数组的最后一个Index，则表示其后的元素已经有序,可以优化下一次冒泡操作要进行比较的长度
 * 2.如果一次冒泡操作没有进行交换操作 表示这个数组是有序的,则可以提前退出排序
 * Created by kele on 2020/8/6 16:53
 */
public class demo1 {


    @Test
    public void test(){
        int[] needSort=new int[]{4,5,1,2,9};
        sort(needSort);
        for (int i = 0; i < needSort.length; i++) {
            System.out.println(needSort[i]);
        }
    }

    public void sort(int array[]){
        if(array==null) return;
        optimizeBubbleSort(array);
    }


    public void optimizeBubbleSort(int array[]){
        int length = array.length;
        if(length==1) return;


        int limitBubble = length-1;
        for (int i = 0; i < length ; i++) {
            boolean flag = false;
            int tempLimit =limitBubble;
            for (int j = 0; j < tempLimit; j++) {
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    //表示这次有交换 排序未结束还需要继续冒泡
                    flag=true;
                    //如果此时被交换的元素不是最后一个,说明此后的元素已经有序且大于这之前的元素
                    limitBubble=j;
                }
            }
            //提前结束冒泡
            if(!flag) break;
        }
    }
}
