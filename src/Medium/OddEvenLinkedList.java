package Medium;

public class OddEvenLinkedList {

	// Odd Even Linked List: https://leetcode.com/problems/odd-even-linked-list/

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}

		public void print() {
			System.out.print(val + "-> ");
			if (next != null)
				next.print();
			else
				System.out.println("NULL");
		}
	}

	public ListNode oddEvenList(ListNode head) {

		if (head == null)
			return null;

		ListNode result = new ListNode(head.val);

		ListNode ptr = result;

		ListNode dummy = head.next.next;

		// odd "indexed" elements:

		while (dummy != null) {
			ptr.next = new ListNode(dummy.val);
			ptr = ptr.next;
			if (dummy.next != null)
				dummy = dummy.next.next;
			else
				break;
		}

		dummy = head.next;

		// even "indexed" elements:

		while (dummy != null) {
			ptr.next = new ListNode(dummy.val);
			ptr = ptr.next;
			if (dummy.next != null)
				dummy = dummy.next.next;
			else
				break;
		}

		return result;

	}

}
