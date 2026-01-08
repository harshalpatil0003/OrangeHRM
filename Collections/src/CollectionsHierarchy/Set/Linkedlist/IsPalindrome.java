package CollectionsHierarchy.Set.Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IsPalindrome {

	public static void main(String[] args) {
		List<Integer> list= new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(1);
		
		Iterator<Integer> itr1= list.iterator();
		ListIterator<Integer> itr2 = list.listIterator(list.size());
	
		boolean flag =false;
		while (itr1.hasNext() && itr2.hasPrevious()) {
			if (itr1.next().equals(itr2.previous())) {
				flag=true;
			}
			else {
				flag=false;
				break;
			}
			
		}
		if (flag) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
