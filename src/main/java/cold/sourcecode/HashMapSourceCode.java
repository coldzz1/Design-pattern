package cold.sourcecode;

import java.util.HashMap;

/**
 * Description:
 * <p>
 * Created by kele on 2020/8/14 11:21
 */
public class HashMapSourceCode {
    public static void main(String[] args) {
        System.out.println(new HashMap<>().size());

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        //public HashMap(int initialCapacity, float loadFactor) {
        //        if (initialCapacity < 0)
        //            throw new IllegalArgumentException("Illegal initial capacity: " +
        //                                               initialCapacity);
        //        if (initialCapacity > MAXIMUM_CAPACITY)
        //            initialCapacity = MAXIMUM_CAPACITY;
        //        if (loadFactor <= 0 || Float.isNaN(loadFactor))
        //            throw new IllegalArgumentException("Illegal load factor: " +
        //                                               loadFactor);
        //        this.loadFactor = loadFactor;
        //        this.threshold = tableSizeFor(initialCapacity);
        //    }
        //
        //    /**
        //     * Constructs an empty <tt>HashMap</tt> with the specified initial
        //     * capacity and the default load factor (0.75).
        //     *
        //     * @param  initialCapacity the initial capacity.
        //     * @throws IllegalArgumentException if the initial capacity is negative.
        //     */
        //    public HashMap(int initialCapacity) {
        //        this(initialCapacity, DEFAULT_LOAD_FACTOR);
        //    }
        //
        //    /**
        //     * Constructs an empty <tt>HashMap</tt> with the default initial capacity
        //     * (16) and the default load factor (0.75).
        //     */
        //    public HashMap() {
        //        this.loadFactor = DEFAULT_LOAD_FACTOR; // all other fields defaulted
        //    }
        //
        //    /**
        //     * Constructs a new <tt>HashMap</tt> with the same mappings as the
        //     * specified <tt>Map</tt>.  The <tt>HashMap</tt> is created with
        //     * default load factor (0.75) and an initial capacity sufficient to
        //     * hold the mappings in the specified <tt>Map</tt>.
        //     *
        //     * @param   m the map whose mappings are to be placed in this map
        //     * @throws  NullPointerException if the specified map is null
        //     */
        //    public HashMap(Map<? extends K, ? extends V> m) {
        //        this.loadFactor = DEFAULT_LOAD_FACTOR;
        //        putMapEntries(m, false);
        //    }
    }
    /**
     *  final Node<K,V>[] resize() {
     *          获取当前的存储key-value的容器对象 transient Node<K,V>[] table;
     *         Node<K,V>[] oldTab = table;
     *         当前容器的容量
     *         int oldCap = (oldTab == null) ? 0 : oldTab.length;
     *         当前容器的扩容大小(容器长度到达这个大小就进行扩容)
     *         int oldThr = threshold;
     *         初始化容器的容量,和新的扩容大小为0
     *         int newCap, newThr = 0;
     *         当原本容器的容量大于
     *         if (oldCap > 0) {
     *              当原本容器的容量大于最大的容量 更新扩容数为Integer.MAX_VALUE 返回
     *             if (oldCap >= MAXIMUM_CAPACITY) {
     *                 threshold = Integer.MAX_VALUE;
     *                 return oldTab;
     *             }
     *             当原本的容器容量大于等于16 且原本容器的长度的两倍小于最大的容量
     *             新的扩容标准大小增长为原来的一倍
     *             else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&
     *                      oldCap >= DEFAULT_INITIAL_CAPACITY)
     *                 newThr = oldThr << 1; // double threshold
     *         }如果原本的容器的容量等于0  且原有的扩容限制大小也大于0 初始容量就等于限制大小
     *         else if (oldThr > 0) // initial capacity was placed in threshold
     *             newCap = oldThr;
     *         else {如果原本的容器的容量为0 且扩容限制大小也等于0 则初始容量为默认的16 扩容限制为 16*0.75=12               // zero initial threshold signifies using defaults
     *             newCap = DEFAULT_INITIAL_CAPACITY;
     *             newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY);
     *         }
     *         如果新的扩容限制大小等于0 则新的扩容限制大小为新的容量大小×0.75
     *         if (newThr == 0) {
     *             float ft = (float)newCap * loadFactor;
     *             newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
     *                       (int)ft : Integer.MAX_VALUE);
     *         }
     *         threshold = newThr;
     *         @SuppressWarnings({"rawtypes","unchecked"})
     *             Node<K, V>[] newTab = (Node<K,V>[])new Node[newCap];
     *         table = newTab;
     *         if (oldTab != null) {
     *             for (int j = 0; j < oldCap; ++j) {
     *                 Node<K,V> e;
     *                 if ((e = oldTab[j]) != null) {
     *                     oldTab[j] = null;
     *                     if (e.next == null)
     *                         newTab[e.hash & (newCap - 1)] = e;
     *                     else if (e instanceof TreeNode)
     *                         ((TreeNode<K,V>)e).split(this, newTab, j, oldCap);
     *                     else { // preserve order
     *                         Node<K,V> loHead = null, loTail = null;
     *                         Node<K,V> hiHead = null, hiTail = null;
     *                         Node<K,V> next;
     *                         do {
     *                             next = e.next;
     *                             if ((e.hash & oldCap) == 0) {
     *                                 if (loTail == null)
     *                                     loHead = e;
     *                                 else
     *                                     loTail.next = e;
     *                                 loTail = e;
     *                             }
     *                             else {
     *                                 if (hiTail == null)
     *                                     hiHead = e;
     *                                 else
     *                                     hiTail.next = e;
     *                                 hiTail = e;
     *                             }
     *                         } while ((e = next) != null);
     *                         if (loTail != null) {
     *                             loTail.next = null;
     *                             newTab[j] = loHead;
     *                         }
     *                         if (hiTail != null) {
     *                             hiTail.next = null;
     *                             newTab[j + oldCap] = hiHead;
     *                         }
     *                     }
     *                 }
     *             }
     *         }
     *         return newTab;
     *     }
     */
}
