/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     ListNode A = headA, B = headB;
     int l1=0,l2=0;
     
    while(A!=null) {
        ++l1;
        A=A.next;
    }
    
    while(B!=null) {
        ++l2;
        B=B.next;
    }    

    int inc = 0;
    if(l1>l2) {
        inc = l1-l2;
        for(int i=0;i<inc;i++)
            headA=headA.next;
    } else if(l2>l1) {
        inc = l2-l1;
        for(int i=0;i<inc;i++)
            headB=headB.next;
    }
        
        while(headA!=null && headB!=null) {
            if(headA==headB) return headA;
            headA=headA.next;
            headB=headB.next;
        }
        
        return null;
    }
}
