package cold.sf.sort.mergesort;

import java.util.Arrays;

/**
 * Description: 归并排序
 * Created by kele on 2020/7/31 11:19
 */
public class MergeSort {


    public static void main(String[] args) {
        int [] array ={0,1,2,4,3,29,8,7,6,5,4,3,2,1,0};
        merge_sort(array,array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
   public static void merge_sort(int[]A,int length){
       sort_c(A,0,length-1);
   }

    public static void sort_c(int arr[],int p ,int r){
        if(p==r){
            return;
        }
            int q = p + (r - p) / 2;
            sort_c(arr, p, q);
            sort_c(arr, q + 1, r);

            merge(arr, p, q, r);

    }


     //把a[p..q]和a[q+1..r]合并起来拷贝回a[p..q]
    public static  void merge(int[]origin,int p, int q, int r){
        int i = p ;
        int j = q + 1 ;
        int k = 0 ;
        int[]temp=new int[r-p+1];//申请一个大小和a[p...r]大小一样的临时数组
        while(i<=q&&j<=r){
            if(origin[i]>=origin[j]){
                temp[k++]=origin[i];
                i++;
            }else {
                temp[k++]=origin[j];
                j++;
            }
        }

        //判断哪个子数组中有剩余的数据
        int start = i;
        int end = q;

        if(i>q){
            start = j;
            end = r;
        }

        //将剩余的数据复制到临时数组后面
       while(start<=end){
           temp[k++]=origin[start++];
       }

       //把排好序的数组拷贝回原数组a[p...r]
        for (int l = 0; l < temp.length; l++) {
            origin[p+l]=temp[l];
        }

    }
}
