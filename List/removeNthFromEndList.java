package List;
/*
 * 20150102 10:20
 */
public class removeNthFromEndList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode LN = new ListNode(-1);
		ListNode head = LN.creatListNode(3);
		LN.printList(removeNthFromEnd(head, 3));
		
	}
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode p , q, k;
		p = head;
		q = head;
		
		while(n-- != 0){
			if(p.next == null){
				if(n == 0){
					return head.next;
				}else{
					return head;	
				}				
			}
			p = p.next;
		}
		while(p.next != null){
			q = q.next;
			p = p.next;
		}
		k = q.next;
		q.next = k.next;
		
		return head;
	}
	
	public static ListNode removeNthFromEnd1(ListNode head, int n) {
		ListNode p , q, k;
		p = head;
		q = head;
		int count = 0;
		while(p != null){
			count++;
			p = p.next;
		}
		if(n > count || n <= 0){
			return head;
		}
		if(n == count){
			return head.next;
		}
		p = head;
		while(n-- != 0){
			p = p.next;
		}
		while(p.next != null){
			q = q.next;
			p = p.next;
		}
		k = q.next;
		q.next = k.next;
		
		return head;
	}
}
