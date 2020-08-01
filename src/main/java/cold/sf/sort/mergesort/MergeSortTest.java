package cold.sf.sort.mergesort;

import org.junit.Test;

/**
 * Description: 复习昨天的归并排序
 * Created by kele on 2020/8/1 9:07
 */
public class MergeSortTest {

    @Test
    public void testMerge(){
        int[] originArray = {1,3,2,9,8,7,6,5,4,3,2,1};
        sort(originArray);
        for (int i = 0; i < originArray.length; i++) {
            System.out.print(originArray[i]);
        }
    }

    public void sort(int[]array){
        spiltSort(array,0,array.length-1);
    }


    public void spiltSort(int[]array,int start,int end){
        //递归结束标志
        if(start>=end){
            return;
        }

        int middle = start + (end-start)/2;
        spiltSort(array,start,middle);
        spiltSort(array,middle+1,end);

        mergeSort(array,start,middle,end);
    }


    public void mergeSort(int[]array,int p,int q ,int r){
        int a = p ;
        int b = q+1;
        int i = 0 ;

        //创建一个临时空间存储合并后的数组
        int[]temp=new int[r-p+1] ;
        //比较有序数组的标号开始的元素
        while(a<=q&&b<=r){
            //把小的放前面,保证是由小到大排序,取等号使相同时先取原数组左边的,保证排序的稳定性
            if(array[a]<=array[b]){
                temp[i++]=array[a++];
            }else {
                temp[i++]=array[b++];
            }
        }

        //判断哪个数组还有剩余元素 确定起始和结尾下标,把剩余元素拷贝到临时数组的末尾
        int start = a;
        int end = q ;
        if(b<=r){
            start=b;
            end=r;
        }

        //拷贝剩余元素到临时数组的末尾
        while(start<=end){
            temp[i++]=array[start++];
        }

        //把临时数组拷贝到原数组相应的位置上
        for (int j = 0; j < temp.length; j++) {
            array[p++]=temp[j];
        }

    }



}
