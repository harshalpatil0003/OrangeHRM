package LinkedList;

public class LinkedList {
	int size;
	Node head;
	Node god;
	Node ref;
	public LinkedList() {
		// TODO Auto-generated constructor stub
	}
	public boolean addNode(Object val){
		
		if (head==null) {
			head=new Node(val);
			god=head;
			size++;
			return true;
		}
		else {
			Node temp= new Node(val);
			god.nextRef=temp;
			temp.prevRef=god;
			size++;
			god=temp;
		}
		
		return true;
	}
	public Node iterator() {
		return head;
	}
	public int getsize() {
		return size;
	}
	public boolean contains(Object val) {
		return isPresent(val)!=null;
	}
	private Node isPresent(Object val) {
		Node head=iterator();
		while (head!=null) {
			//if (((Integer)val).equals((Integer)head.val)) {
			if(head.val.equals(val)) {
				return head;
			}
			head=head.next();
		}
		return null;
	}
	public boolean removeNode(Object val) {
		Node ref=isPresent(val);
		//System.out.println(ref.-evRef.val);
			if (ref.prevRef==null) {
				head=ref.nextRef;
				if (head!=null) {
					head.prevRef=null;
				}
				size--;
				return true;
			}
			else if (ref.nextRef==null) {
				god=ref.prevRef;
				god.nextRef=null;
				size--;
				return true;
			}
		
			else if (ref!=null) {
				
				ref.prevRef.nextRef=ref.nextRef;
				ref.nextRef.prevRef=ref.prevRef;
				size--;
				return true;
			}
		
		return false;
	}
	public String toString() {
		if (head!= null) {
			Node head=iterator();
			StringBuilder s= new StringBuilder();
			s=s.append("[");
			do {
				s=s.append(" "+head.val).append(",");
				head=head.next();
				
			} while (head!=null);
			s=s.deleteCharAt(s.length()-1);
			s=s.append("]");
			return new String(s);
		}
		return "[]";
	}
	public boolean addFirst(Object val) {
		if (head!=null) {
			Node ref=new Node(val);
			head.prevRef=ref;
			ref.nextRef=head;
			head=ref;
			return true;
		}
		else {
			return addNode(val);
		}
		
	}
	public boolean addLast(Object val) {
		return addNode(val);
	}
	
	public boolean addAll(LinkedList l2) {
		Node head=l2.iterator();
		while (head!=null) {
			addNode(head.val);
			head=head.next();
			size++;
		}
		return head==null;
	}
	
	public void clear() {
		head=null;
		god=null;
		
	}
	public boolean removeAll(LinkedList l2) {
		
		Node head=l2.iterator();
		while(head!=null) {
			removeNode(head.val);
			head=head.next();
			size--;
		}
		return head==null;
	}
	public LinkedList reatainAll(LinkedList l2) {
		
		LinkedList temp= new LinkedList();
		Node head=l2.iterator();
		while (head!=null) {
			Node ref=isPresent(head.val);
			if (ref!=null) {
				temp.addNode(head.val);	
			}
			head=head.next();
		}
		
		this.head=temp.head;
		this.god=temp.god;
		return temp;
	}
	public boolean containsAll(LinkedList l2) {
		
		Node head= l2.iterator();
		
		while (head!=null) {
			if (contains(head.val)==false) {
				return false;
			}
			head=head.next();
		}
		return true;
	}
	
	public boolean removeFirt() {
		
		try {
		if (head!=null) {
			if (head.prevRef==null) {
				head.nextRef.prevRef=null;
				head=head.nextRef;
				size--;
				return true;
			}
		}
		
		}
		catch (NullPointerException e) {
			System.out.println("Empty list!");
		}
		return false;
	}
	
	public boolean removeLast() {
		
		try {
			if (god!=null) {
					god=god.prevRef;
					god.nextRef=null;
					
					size--;
					return true;
			}
			
		} catch (NullPointerException e) {
			System.out.println("Empty list!");
			
		}
		return false;
	}
	
	public Node reverseIterator() {
		return god;
	}
	
	public String reverseIterate() {
		if (god!=null) {
			Node god=reverseIterator();
			
			StringBuilder s= new StringBuilder();
			s=s.append("[");
			while(god!=null) {
				s=s.append(" "+god.val+",");
				god=god.prev();
			}
			s=s.append("]");
			s=s.deleteCharAt(s.length()-2);
			return new String(s);
			
		}
		return "[]";
	}
	
}
