package cold.sf.sort.bubblesort;

import org.junit.Test;

/**
 * Description:
 * 冒泡排序排序效率比较低,只适用于数据比较少的排序
 * Created by kele on 2020/8/5 9:16
 */
//如果数据的最后一大部分都是有序的,只有前面一小段有序
//既发现第一次冒泡操作后,交换的位置不是最后一个,代表这之后的都是有序了,之后进行冒泡不需要只需要进行到这之前
public class optimizeBubbleSort {


    @Test
    public void testOptimizeBubbleSort(){
        int [] array=new int[]{2,5,1,2,1,9,0,2};
        long time =System.currentTimeMillis();
        System.out.println("需要的时间:"+(System.currentTimeMillis()-time));
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public void sort(int []array){
        if(array==null) return ;
        optimizeBubble(array);

    }

    public void optimizeBubble(int [] array){
        if(array.length<=1) return ;

        int limitBubble=array.length-1;

        //记录一次冒泡操作结束后交换的最后一个被交换的元素,此元素之后的元素都是有序的
        //下次只需要进行冒泡比较到次元素之前即可
        int tempLimit = limitBubble;

        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            limitBubble=tempLimit;
            for (int j = 0; j < limitBubble; j++) {
                if(array[j]>array[j+1]){
                    int temp =array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=true;
                    tempLimit=j+1;
                }
            }
            if(!flag){
                break;
            }
        }

    }
}
