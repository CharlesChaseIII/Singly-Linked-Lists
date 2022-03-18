package rev.com.chall;

//import rev.com.chall.FindIntersection.Node;

public class IntersectingNodeApplication {
	
	/*public class Node {

		int num;

		Node next = null;

		Node(int x) {

			num = x;

			next = null;

		}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindIntersection fI = new FindIntersection();

		Node nodeA = new Node(0);

		nodeA.next = new Node(7);

		nodeA = nodeA.next;

		nodeA.next = new Node(8);

		nodeA = nodeA.next;

		nodeA.next = new Node(10);

		nodeA = nodeA.next;

		Node nodeB = new Node(0);

		nodeB.next = new Node(1);

		nodeB = nodeB.next;

		nodeB.next = new Node(8);

		nodeB = nodeB.next;

		nodeB.next = new Node(10);

		nodeB = nodeB.next;
		
		/*ListNode nodeA = new ListNode(3);

		nodeA.next = new ListNode(7);

		nodeA = nodeA.next;

		nodeA.next = new ListNode(8);

		nodeA = nodeA.next;

		nodeA.next = new ListNode(10);

		nodeA = nodeA.next;

		ListNode nodeB = new ListNode(99);

		nodeB.next = new ListNode(1);

		nodeB = nodeB.next;

		nodeB.next = new ListNode(8);

		nodeB = nodeB.next;

		nodeB.next = new ListNode(10);

		nodeB = nodeB.next;*/

		System.out.println(fI.findIntersectingNode(nodeA, nodeB));
	}

}
