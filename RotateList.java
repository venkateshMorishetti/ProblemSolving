
/**

Given the head of a linked list, rotate the list to the right by k places.


Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

Input: head = [0,1,2], k = 4
Output: [2,0,1]

**/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }

        int size = getCount(head);
        if(k> size){
            k = k%size;
            if(k == 0){
                return head;
            }
        }
        int t = size-k;
        if(t == 0){
            return head;
            //return the list as it is.  
        }
        ListNode test = head;
        while(t>1){
            test= test.next;
            t--;
        }

        ListNode list2 = test.next;
        test.next = null;
        //new head
        ListNode new_head = list2;
        while(list2.next!=null){
            list2 = list2.next;
        }
        list2.next= head;

        return new_head;
        
    }

    public int getCount(ListNode test){
        int c = 0;
        while(test!=null){
            c++;
            System.out.println(test.val);
            test = test.next;
        }

        return c;
    }
}


