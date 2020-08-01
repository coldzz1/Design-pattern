package cold.sf.sort.quicksort;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Description:
 * <p>
 * Created by kele on 2020/8/1 15:38
 */
public class QuickSort1 {

    /**
     *  这里的处理有点类似选择排序。
     *     我们通过游标 i 把 A[p…r-1]分成两部分。
     *     A[p…i-1]的元素都是小于 pivot 的，
     *     我们暂且叫它“已处理区间”，
     *     A[i…r-1]是“未处理区间”。
     *     我们每次都从未处理的区间 A[i…r-1]中取一个元素 A[j]，与 pivot 对比，
     *     如果小于 pivot，则将其加入到已处理区间的尾部，也就是 A[i]的位置。
     *     数组的插入操作还记得吗？
     *     在数组某个位置插入元素，
     *     需要搬移数据，
     *     非常耗时。当时我们也讲了一种处理技巧，就是交换，
     *     在 O(1) 的时间复杂度内完成插入操作。
     *     这里我们也借助这个思想，只需要将 A[i]与 A[j]交换，
     *     就可以在 O(1) 时间复杂度内将 A[j]放到下标为 i 的位置
     */
    @Test
    public void quickSort(){
        int[] ints = {6,11,3,9,8};
        quickSort(ints,ints.length);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
    // 快速排序，a是数组，n表示数组的大小
    public static void quickSort(int[] a, int n) {
        quickSortInternally(a, 0, n-1);
    }

    // 快速排序递归函数，p,r为下标
    private static void quickSortInternally(int[] a, int p, int r) {
        if (p >= r) return;

        int q = partition(a, p, r); // 获取分区点
        quickSortInternally(a, p, q-1);
        quickSortInternally(a, q+1, r);
    }

    private static int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for(int j = p; j < r; ++j) {
            if (a[j] < pivot) {
                if (i == j) {
                    ++i;
                } else {
                    int tmp = a[i];
                    a[i++] = a[j];
                    a[j] = tmp;
                }
            }
        }

        int tmp = a[i];
        a[i] = a[r];
        a[r] = tmp;

        System.out.println("i=" + i);
        return i;
    }

}
