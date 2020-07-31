package cold.sf.queue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Description:
 * 这是一个栈的数据模型,栈比较特殊 其本质是一种优先队列
 * 普通的队列很简单,先进先出,而堆这种特殊的队列则搞特殊,有优先级,谁优先级高谁先出
 * PriorityQueue 就是一个优先队列实现
 */
public class PriorityQueueDemo1 {

    /**
     * 默认是一个最小栈
     * 特点:
     * 1. 是一个完全二叉树
     * 2. 满足堆序性
     *    任何结点都优于它的所有孩子节点(子节点,曾子节点)
     *    如果是大于其孩子节点则是一个最大堆
     */
    /**
     *  当前节点的位置  n
     *  父节点的位置   n-1>>>2
     *  左子节点的位置 2n+1
     *  右子节点的位置 2n+1
     */
    public static void main(String[] args) {

        //这里用    public PriorityQueue(Collection<? extends E> c) {} 构造函数
        //会调用heapify() 堆化操作,使这个队列符合堆序性
        //具体来说就是找到最后一个非叶子节点,然后看其子节点是否符合堆序性,然后不断交换,使整个结构符合堆序性
        //时间复杂度是O(n)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Arrays.asList(1, 8, 4, 4, 5));
        PriorityQueue p =new PriorityQueue();

        //每次添加会去跟其父节点进行比较判断,
        p.add(5);
        p.offer(7);

       /* p.add(4);
        p.add(1);
        p.add(3);
        p.add(9);
        p.add(8);
        p.add(0);*/
        System.out.println(p);
        //peek()是查找数组第一个元素
        System.out.println(p.peek());
        System.out.println(p.peek());
        System.out.println(p);
        System.out.println(p.poll());
        System.out.println(p.poll());
        System.out.println(p);
    }
}
