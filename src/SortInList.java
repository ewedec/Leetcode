/**
 * 给定一个无序单链表，实现单链表的排序(按升序排序)。
 */
public class SortInList {
    public ListNode sortInList (ListNode head) {
        // write code here
        ListNode dummy = new ListNode(Integer.MAX_VALUE);
        dummy.next = head;
        ListNode sorted = dummy;
        while (sorted.next !=null){
            ListNode pre = sorted;
            ListNode cur = sorted.next;
            ListNode pre_min = null;
            ListNode min = null;
            while (cur !=null){
                if (min == null ||cur.val<min.val){
                    min = cur;
                    pre_min = pre;
                }
                cur =cur.next;
                pre = pre.next;

            }
            pre_min.next = min.next;
            min.next =sorted.next;
            sorted.next=min;
        }
        return dummy.next;
    }
}
