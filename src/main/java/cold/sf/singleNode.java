package cold.sf;

/**
 * Description:
 * 单链表查找问题
 * Created by ys on 2020/7/17 9:07
 */
public class singleNode {

    /**
     * 获取单链表倒数第n个节点的元素
     *
     * @param node
     * @param n
     */
    public Object getNode(Node node, int n) {

        Node p1 = node;
        int l = 0;
        while (l < n && p1.next != null) {
            p1 = p1.next;
            l++;
        }
        if(p1.next==null && l<n-1){
            System.out.println("超出链表长度");
            return null;
        }

        Node p2 = node ;
        while(p1.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p2.val;

    }

}


class Node {
    Object val;
    Node next;
}