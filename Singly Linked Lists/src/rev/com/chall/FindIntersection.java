package rev.com.chall;

import java.util.HashSet;
import java.util.Set;

public class FindIntersection {
	
	public Node findIntersectingNode(Node headA, Node headB) {

		Set<Node> visited = new HashSet<>();

		while (headA != null) {

			visited.add(headA);

			headA = headA.next;

		}

		while (headB != null) {

			if (visited.contains(headB)) {
				return headB;

			}

			headB = headB.next;

		}

		return null;

	}

}
