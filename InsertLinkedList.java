package basic08;
//Insert a node in a sorted LinkedList
import java.util.*;
//time complexity: O(n)
//spce complextity: O(n)
public class InsertLinkedList {
    public ListNode insert(ListNode head, int value){
        if(head == null || head.value >= value){
            ListNode newHead = new ListNode(value);
            newHead.next = head;
            return newHead;
        }
        head.next = insert(head.next, value);
        //ListNode subHead = insert(head.next, value);
        // head.next = subHead;
        return head;
    }
}
class ListNode{
    ListNode next;
    int value;
    public ListNode(int value){
        this.value =value;
    }
}
