package com.main;

public class LinkedListProb {
	
	public static void main(String[] args) {
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
	
		// Find the middle node
		  ListNode mid = middleOfList(node1);
		  //mid.next = null;
	      ListNode second = reverse(mid);
	      mergeList(node1,second);
	      printList(node1,second);
	      
	}
	
	public static void mergeList(ListNode head, ListNode l2) {
		
		
		ListNode l1 = head;
		while(l1!=null && l2.next!=null) {

			ListNode l1_next = l1.next;
			ListNode l2_next = l2.next;
			l1.next = l2;
			
			if(l1_next==null) break;
			
			l2.next = l1_next;
			l1 = l1_next;
			l2 = l2_next;
			
		}
	
	}
	
	private static ListNode reverse(ListNode head) {
		 ListNode next=null, prev=null;
	        while(head!=null)
	        {
	            next=head.next;
	            head.next=prev;
	            prev=head;
	            head=next;
	        }
	   
	        return prev;
	}
	
	private static ListNode middleOfList(ListNode head) {
        ListNode fp=head;
        ListNode sp=head;
        ListNode node= head;
            while(fp!=null && fp.next!=null)
            {
                fp=fp.next.next;
                sp=sp.next;
            }
        return sp;
    }

	private static void printList(ListNode node1,ListNode node2) {
		while(node1!=null ) {
			if(node1!=null) {
				System.out.println(node1.val);
				node1 = node1.next;
			}
		}
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
