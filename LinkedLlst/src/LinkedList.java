
//no need to take head here  public void insert(Node head) {  but data
/*remenber to return here if(head==null) {
			head=newNode;
			return;
		}*/

//in display not data  but curr.data in sop
// in display i/P curr not empty

// in insertat posn no i<=pos but i<pos or else 
//here 		while(curr!=null && curr.data!=idata) { not== but !=


//in rev only display not actulally reverse

/*in if(position<1 || head==null) {
 * 
 * 
			return;
		}
		not && but ||
		
		
	remember return here
		if(position ==1) {
			head=curr.next;
			return;
		}
		
		
		
		
		*/

// If you want to process all nodes, including the last one, use while (curr != null). If you want to stop processing one node before the last node, use while (curr.next != null).


/*in reverse not this //reverse i.e put prev value in curr.next
			prev=next;
			
			but c.n=p*/

/*After reversing a linked list, remember to update the head to point to 
 * the new starting node (prev). If you don't, the head will still point 
 * to the old starting node, and you'll get incorrect results when working
 *  with the reversed list*/


/*not this but 	public void reverse() {*/
public class LinkedList {
	
	Node head;
	
	public void insert(int data) {
		
		
		Node newNode= new Node(data);
		
		if(head==null) {
			head=newNode;
			return;
		}
		
		Node curr= head;
		
		while(curr.next!=null) {
			curr=curr.next;
			
		}
		
		curr.next=newNode;
	}
	
	
	
	
	
	public void display() {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+"--->");
			curr=curr.next;
		}
	}
	
	
	public void displayRecursive(Node curr) {
		
		if(curr==null) {
			return;
		}
		
		System.out.print(curr.data+"-->");
		
		displayRecursive(curr.next);
	}
	
	public void displayRec() {
		displayRecursive(head);
	}
	
	
	
	
	public void displayReverse(Node curr) {
		if(curr==null)
			return;
		
		displayReverse(curr.next);
		System.out.print(curr.data+"-->");
	}
	
	public void displayRev() {
		displayReverse(head);
	}
	
	
	public void insert (int position ,int data) {
		
		Node newNode= new Node(data);
		
		if( position<1) {
			System.out.println("invalid position");
			return;
		}
		
		if(position==1) {
			newNode.next=head;
			head=newNode;
			return;
		}
		
		Node curr=head;
		for(int i=1;i<position-1;i++) {
			curr=curr.next;
			
			if(curr==null) {
				System.out.println("invalid position");
				return;
			}
		}
		
		newNode.next=curr.next;
		curr.next=newNode;
		
		
	}
	
	
	public void delete(int idata) {
		 
		Node curr=head;  //to itearate get a var and initialize to head
		Node prev = null;//also get a var as cant go back in sll and set it to null as initaiily nothing if cuu is head
		
		if(curr!=null && curr.data==idata) { //if data found at head update head
			head=curr.next;
			return;
		}
		
		
		while(curr!=null && curr.data!=idata) {
			prev=curr; //also update prev
			curr=curr.next;
		}
		
		if(curr==null) {
		System.out.println("reach end of list but data not found");
		return;
		}
		
		prev.next=curr.next;
		
		
	}
	
	
	public void deleteByposition(int position) {
		
		if(position<1 || head==null) {
			return;
		}
		Node curr=head;
		if(position ==1) {
			head=curr.next;
			return;
		}
		
		for(int i=1;i<position-1;i++) {
			curr=curr.next;
		}
		
		if(curr.next==null) {
			return;
		}
		
		Node nextNode=curr.next.next;
		curr.next=nextNode;
	}
	
	
	public int count(Node curr) {
		//Node curr=head;
		
		if(curr==null) {
			return 0;
		}
		return 1+count(curr.next);
	}
	
	public void countRec() {
		System.out.println(count(head));
	}
	
	
	
	
	
	
	
	public void reverse( ) {
		//take 3 pointers
		Node curr=head;
		Node prev=null;
		Node next;
		
		while(curr!=null) {
			//initailze next
			next=curr.next;
			
			//reverse i.e put prev value in curr.next
			curr.next=prev;
			
			//forward curr in prev,next in curr and next =curr.next we did before
			prev=curr;
			curr=next;
			
			
		}
		
		head=prev;
	}
	

}
