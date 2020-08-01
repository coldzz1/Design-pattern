package cold.sf.sort.quicksort;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Description:
 * Created by kele on 2020/8/1 14:11
 */
public class QuickSort {




    /*@Test
    public void testQuickSort(){
        int[] needSort = {3,5,1,9,5,6,4,6,7,1,11,0};
        quick_sort(needSort);
        for (int i = 0; i < needSort.length; i++) {
            System.out.println(needSort[i]);

        }

    }

    public void quick_sort(int array[]){
        quick_sort_c(array,0,array.length-1);
    }

    public void quick_sort_c(int array[],int p,int r){
        if(p>=r)
            return;

        //获取分区点
        int q =partition(array,p,r);
        quick_sort_c(array,p,q-1);
        quick_sort_c(array,q+1,r);
    }*/

    /*
   。
    partition(A, p, r) {
    pivot := A[r]
    i := p for j := p to r-1 do {
     if A[j] < pivot
     { swap A[i] with A[j] i := i+1
     }
     } swap A[i] with A[r] return i
     */

    //选择一个pivot 创建两个临时数组
    //把大于pivot的放在右边
    //把小于pivot的放在左边
   /* private int partition(int[] array, int p, int r) {
        int a = p ;
        int b = r ;
        int pivot = array[p];
        for (; b > a; b--) {
            if(array[b]<=pivot){
                for (; a <b ; a++) {
                    if(array[a]>pivot){
                        //交换
                        int temp=array[b];
                        array[b]=array[a];
                        array[a]=temp;
                    }
                }
            }
        }
        //把序号0的元素放在原来a的位置,把原本原本0到a位置的元素前移1位
        int i = p ;
        while(i<b){
            array[i]=array[++i];
        }
        array[b]=pivot;
        return b;
    }*/


    @Test
    public void test(){
        int[] a = {11,5,4,3,2,6,8,2,3,1,4,1,6};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public void sort(int[]array){
        sort_c(array,0,array.length-1);
    }

    public void sort_c(int[] array,int start,int end){
        if(start>=end)
            return;

        int i = adjustArray(array, start, end);
        sort_c(array,start,i);
        sort_c(array,i+1,end);

    }
    public int adjustArray(int[]array,int a ,int b){
        int pivot = array[a];

        //取右边的元素开始遍历 找到第一个小于pivot的元素,把该元素和pivot的替换掉；
        //在从左边开始遍历找到第一个大于pivot的元素 把之前的右边的元素给替换掉
        //重复上面的动作直到两个指针相遇

        int tempIndex =a;

        int p = a ;
        int r = b ;
        for(;p<=r;r--){
            if(array[r]<pivot){
                array[tempIndex]=array[r];
                tempIndex=r;
                for (;p<=r;p++){
                    if(array[p]>pivot){
                        array[tempIndex]=array[p];
                        tempIndex=p;
                    }
                }
            }
        }
        array[tempIndex]=pivot;
        return tempIndex;
    }
}
