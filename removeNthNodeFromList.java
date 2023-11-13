/**

Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]

**/

//brute force
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c = countOfNodes(head);
        n = c-n;
        if(n==0){
            return head.next;
        }
        ListNode t = head;
        if(n>0){
            while(n>1){
                t = t.next;
                n--;
            }
        }
        if(t.next!=null){
            t.next = t.next.next;
        }
        
        return head;
    }

    public int countOfNodes(ListNode h){
        int c = 0;
        while(h != null){
            h = h.next;
            c++;
        }

        return c;
    }
}


//efficient approach

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode first=head, second = head;

        for(int i = 0; i < n; i++){
            second = second.next;
        }
        while(second!=null && second.next!=null){
            first = first.next;
            second = second.next;
        }
        if(second==null){
            return head.next;
        }
        if(first.next!=null){
        first.next = first.next.next;
        }

        return head;
       
    }
}
