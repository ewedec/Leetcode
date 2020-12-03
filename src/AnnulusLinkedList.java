public class AnnulusLinkedList {
//    public boolean hasCycle(ListNode head) {
//        if (head == null) {
//            return false;
//        }
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast!=null&& fast.next !=null){
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast == slow){
//                return false;
//            }
//        }
//        return true;
//    }
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        while(p!=null){
            ListNode aft = p.next;
            if(aft==head) return true;
            p.next=head;
            p=aft;
        }
        return false;

    }
}