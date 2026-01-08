
import java.util.List;
import java.util.ListIterator;

public class LinkedList {

	public static void main(String[] args) {
		
		List<Integer> list = new java.util.LinkedList<Integer>();
		list.add(10);
		list.add(15);
		list.add(3);
		list.add(0);
		list.add(9);
		list.add(7);
		
		System.out.println(list);
		ListIterator<Integer> itr= list.listIterator();
		while (itr.hasNext()) {
			Integer curr= itr.next();
			
			Integer next=null;
			if (itr.hasNext()) {
				next=itr.next();
				itr.previous();
			}
			try {
				if (next>curr) {
					itr.remove();
				}
			}catch (NullPointerException e) {
				System.out.println("Not further comparable");
			}
			
			System.out.println(list);
		}	
	}
}
