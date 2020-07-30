package cold.sourcecode;

/**
 * Description: design-pattern-demo
 * <p>
 * Created by ys on 2020/7/30 19:35
 */
public class ThreadLocaMemoryXl {
    /**ThreadLocal会出现内存泄露:
     * 为了让ThreadLocal外部引用为空后,ThreadLocal对象能被GC,所以内部用了弱引用实现了存储key-value的key的引用；
     * (如果用强引用,会出现threadRef->Thread->threadLocalMap->ThreadLocalMap->entry->Entry->threadLocalRef->ThreadLocal对象)
     * 这样会使得如果线程存在的情况下,始终指向ThreadLocal对象导致内存泄露。
     *
     * 但是正因为这个方式,会出现Entry中的key为null,而value不为空的情况,
     * 此时当线程一直存在下(线程池),会出现threadRef -> Thread -> threadLocalMap -> entry ->value ->Value对象
     * 导致Value对象一直被持有,无法被GC的情况
     * **/

}
