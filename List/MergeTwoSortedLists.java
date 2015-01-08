package List;

public class MergeTwoSortedLists {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(10);
		l1.next = new ListNode(13);
		l1.next.next = new ListNode(14);
		ListNode l2 = new ListNode(11);
		ListNode.printList(mergeTwoLists(l1, l2));
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode L = null;
		ListNode p = null;
		ListNode q = null;
		if (l1 == null || l2 == null) {
			L = l1 == null ? l2 : l1;
			return L;
		}
		if (l1.val <= l2.val) {
			p = new ListNode(l1.val);
			L = p;
			l1 = l1.next;
		} else {
			p = new ListNode(l2.val);
			L = p;
			l2 = l2.next;
		}
		q = L;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				p = new ListNode(l1.val);
				q.next = p;
				q = q.next;
				l1 = l1.next;
			} else {
				p = new ListNode(l2.val);
				q.next = p;
				q = q.next;
				l2 = l2.next;
			}
		}
		if (l1 != null) {
			q.next = l1;
		}
		if (l2 != null) {
			q.next = l2;
		}
		return L;
	}
}
