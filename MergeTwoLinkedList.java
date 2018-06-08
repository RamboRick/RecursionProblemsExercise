package basic08;
//recursive merge two LinkedList.
//time complexity: O(n)
//space complexity:O(n)
public class MergeTwoLinkedList {
    public ListNode merge(ListNode one, ListNode two){
        if(one == null) return two;
        if(two == null) return one;
        if(one.value < two.value){
            one.next = merge(one.next, two);
            return one;
        }else{
            two.next = merge(one,two.next);
            return two;
        }
    }
}
