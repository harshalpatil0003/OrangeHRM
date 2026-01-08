

public class CircularLinkedList {

	public static void main(String[] args) {
		linkedlist list = new linkedlist();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		
		System.out.println(list.size);
		for (int i = 0; i < list.size; i++) {
			System.out.println(list);
		}
	}
}

class Node {
	Object val;
	Node next;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}
	
	public Node(Object val){
		this.val=val;
		next= null;
	}
}

class linkedlist{
	int size;
	Node head;
	Node curr;
	public linkedlist() {
	}
	
	public void addNode(Object val) {
		if (head==null) {
			head=new Node(val);
			curr=head;
			size++;
		}else {
			Node temp=new Node(val);
			curr.next=temp;
			size++;
			curr=temp;
		}
	}
	
	public String toString() {
		StringBuilder s=new StringBuilder("[");
		while (head!=null) {
			s.append(head.val);
			if (head.next != null) s.append(", ");
            head = head.next;
		}
		return s;
	}
}
