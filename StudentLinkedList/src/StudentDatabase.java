

public class StudentDatabase {
	
	Node head;
	
	public StudentDatabase() {
		// TODO Auto-generated constructor stub
		head=null;
	}
	
	public void insertAtFirst(Student data) {
		
		Node newNode= new Node(data);
		
		if(head==null) {
			System.out.println("empty");
			head=newNode;
			return ;
		}
		
		newNode.next=head;
		head=newNode;
		
		return ;
	}
	
	public void display() {
		Node curr=head;
		while(curr!=null) {
			System.out.println(curr.data+"-->");
			curr=curr.next;
		}
		System.out.println("End");
	}
	
	public void insertAtLast(Student data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=newNode;
		
		System.out.println("inserted");
		
		
	}
	
	public void insertAtposition(Student data,int position) {
		Node newNode= new Node(data);
		if(position<1 && head==null) {
			return;
		}
		
		if(position==1) {
			insertAtFirst(data);
			return;
		}
		
		Node curr=head;
//		int count=1;
		for(int i=1;i<position-1;i++) {
			curr=curr.next;
		}
//		while(position!=count && curr.next!=null) {
//			curr=curr.next;
//		}
//		curr.next=newNode;
//		newNode.next=curr;
		newNode.next=curr.next;
		curr.next=newNode;
		return;
	}
	
	public void deleteAtFirst() {
		if(head==null) {
			return;
		}
		
		head=head.next;
	}
	
	
	public void deleteAtLast() {
		Node curr=head;
		Node prev=null;
		while(curr.next!=null) {
			prev=curr;
			curr=curr.next;
		}
		
		prev.next=null;
	}
	
	public void deleteAtPos(int posn) {
		if(posn<1 || head==null) {
			return;
		}
		
		if(posn==0) {
			deleteAtFirst();
			return;
		}
		
		Node curr=head;
		for(int i=1;i<posn-1;i++) {
			curr=curr.next;
		}
		
		curr.next=curr.next.next;
	}
}
