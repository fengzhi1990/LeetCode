package List;

public class RevList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		ListNode LN = new ListNode(n); 
		ListNode head = LN.creatListNode(n);
//		LN.printList(head);
		LN.printList(revList(head));
	}
	public static ListNode revList(ListNode head){
		
		if(head == null){
			return head;
		}
		ListNode p= head.next, q = head.next, k;
		ListNode headRel = head;
		if (p != null && p.next != null){
			q = p.next;
		}
		while(q != null){			
			if (q.next != null){
				k = q.next;
			}else{
				headRel.next = q;
				q.next = p;
				p.next = null;
				return headRel;				
			}
			headRel.next = q;
			q.next = p;
			p = q;
			q = k;
		}
		
		return headRel;
	}

}
