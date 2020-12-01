import java.util.*;
public class ReverseLinkedList {


    public ListNode ReverseList(ListNode head){
        if (head == null){
            return null;
        }
        ListNode frontNode = head;
        ListNode removeNode = head.next;
        while (removeNode != null){
            ListNode tempNode = removeNode.next;
            removeNode.next =frontNode;
            frontNode =removeNode;
            removeNode = tempNode;
        }
        head.next = null;
        return frontNode;
    }


}
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}