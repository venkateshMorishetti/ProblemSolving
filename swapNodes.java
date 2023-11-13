/**
Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

Example 1:

Input: head = [1,2,3,4]
Output: [2,1,4,3]
Example 2:

Input: head = []
Output: []
Example 3:

Input: head = [1]
Output: [1]

**/
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        ListNode eventListHead = null, oddListHead = null, eventListTail = null, oddListTail = null, temp = head;
        int count = 0;
        while(temp!=null){
            if(count%2 == 0){
                if(eventListHead == null){
                    eventListHead = temp;
                    eventListTail = temp;
                }else{
                    eventListTail.next = temp;
                    eventListTail = eventListTail.next;
                }
            }else{
                if(oddListHead == null){
                    oddListHead = temp;
                    oddListTail = temp;
                }else{
                    oddListTail.next = temp;
                    oddListTail = oddListTail.next;
                }
            }
            temp = temp.next;
            count++;
        }
        if(oddListHead == null){
            return head;
        }
        ListNode result = null, resultTail = null;;
        ListNode k = eventListHead;
        while(eventListHead!=null && oddListHead!= null){
            if(result == null && resultTail == null){
                result = oddListHead;
                resultTail = oddListHead;
                oddListHead = oddListHead.next;
            }else{
                resultTail.next = oddListHead;
                oddListHead = oddListHead.next;
                resultTail = resultTail.next;
                resultTail.next = null;
            }
            resultTail.next = eventListHead;
            eventListHead = eventListHead.next;
            resultTail = resultTail.next;
            resultTail.next = null;
        }
        if(eventListHead!=null){
            resultTail.next = eventListHead;
            resultTail.next = null;
        }
        return result; 
    }
}

