package List;

public class IntersectionOfTwoLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode headA = new ListNode(10);
		headA.next = new ListNode(11);
		headA.next.next = new ListNode(12);
		headA.next.next.next = new ListNode(13);

		ListNode headB = new ListNode(20);
		headB.next = new ListNode(21);
		headB.next.next = headA.next.next.next;
		System.out.println(getIntersectionNode(headA, headB).val);
	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		ListNode ha = headA;
		ListNode hb = headB;
		int counta = 1, countb = 1, countdiff;
		while (ha.next != null) {
			counta++;
			ha = ha.next;
		}
		while (hb.next != null) {
			countb++;
			hb = hb.next;
		}
		if (countb >= counta) {
			countdiff = countb - counta;
			while (countdiff-- > 0) {
				headB = headB.next;
			}
		} else {
			countdiff = counta - countb;
			while (countdiff-- > 0) {
				headA = headA.next;
			}
		}
		while (headA != headB && headA != null) {
			headA = headA.next;
			headB = headB.next;
		}
		if (headA != null) {
			return headA;
		} else {
			return null;
		}

	}

}
