package Easy;

public class MergeSortedLists {

	// Merge Two Sorted Lists: https://leetcode.com/problems/merge-two-sorted-lists/

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}

	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		ListNode first = l1;
		ListNode second = l2;

		ListNode res = null;

		if (first.val < second.val) {
			res = new ListNode(first.val);
			first = first.next;
		} else {
			res = new ListNode(second.val);
			second = second.next;
		}

		ListNode curr = res;

		while (first != null && second != null) {

			if (first.val < second.val) {
				curr.next = new ListNode(first.val);
				curr = curr.next;
				first = first.next;

			} else {
				curr.next = new ListNode(second.val);
				curr = curr.next;
				second = second.next;
			}

		}

		if (first == null) {
			while (second != null) {
				curr.next = new ListNode(second.val);
				second = second.next;
				curr = curr.next;
			}
		}

		if (second == null) {
			while (first != null) {
				curr.next = new ListNode(first.val);
				first = first.next;
				curr = curr.next;
			}
		}

		return res;
	}

}
