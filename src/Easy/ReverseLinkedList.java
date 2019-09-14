package Easy;

public class ReverseLinkedList {

	// Reverse LinkedList:
	// https://leetcode.com/problems/reverse-linked-list/submissions/

	public ListNode reverseList(ListNode head) {

		ListNode prev = null;
		ListNode curr = head;

		while (curr != null) {
			ListNode tempNext = curr.next;
			curr.next = prev;
			prev = curr;
			curr = tempNext;
		}
		return prev;
	}
	
	
	//Recursive:
	
	public ListNode reverseListRec(ListNode head) {
		if (head == null || head.next == null)
			return head;
		
		ListNode p = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		
		return p;
	}

	static public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}
