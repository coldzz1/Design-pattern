package cold.sf.sort.sortTest;

/**
 * Description:
 * Created by kele on 2020/8/7 9:19
 */
public class demo2 {



    /*

     */

    public void sort(int[]array,int start,int end){
        if(start>=end) return;
        int  position = partion(array,start,end);
        sort(array,start,position);
        sort(array, position+1,end);
    }


    private int partion(int[] array, int start, int end) {
        int temp = array[0];
        int l = start;
        int r = end ;

        int i = 0 ;
        //先从后往前遍历 找到比temp小的元素,将此元素替换掉i上的元素 i也变成次时这个元素的index
        //回到前 往后遍历 找到比temp大的元素,将此元素替换掉i上的元素,此时的index替换掉i
        //直到两者相遇,把temp放在相遇的index上,返回此index


        for (int j = 0; j < end-start+1; j++) {


        }
        while(l<=r){
            
            
            
        }
        
        
        if(array[r]<temp){
            array[i]=array[r];
            i=r;
        }





        return 0;
    }
}
