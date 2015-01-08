package List;

public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}

	public static ListNode creatListNode(int n) {
		ListNode head = new ListNode(n);
		ListNode p = head;
		while (--n != 0) {
			p.next = new ListNode(n);
			p = p.next;
		}
		return head;

	}

	public static void printList(ListNode head) {
		ListNode p = head;
		while (p != null) {
			System.out.println(p.val);
			p = p.next;
		}
	}
}