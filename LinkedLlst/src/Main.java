
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList ll= new LinkedList();
		
		ll.insert(1);
		ll.insert(5);
		
		System.out.println("by insert at last");
		ll.display();
		

		System.out.println("\n \nby insert at posn");
		ll.insert(2,45);
		ll.insert(4,23);
		ll.insert(2,56);
		
		ll.displayRec();
		
		
		System.out.println("\n \ndisplay in rev");
		ll.displayRev();
		System.out.println("og");
		ll.display();
		
		System.out.println("\n \ndelete by value");
		ll.delete(5);
		ll.display();
		
		System.out.println("\n \ndelete by pos");
		ll.deleteByposition(2);
		ll.display();
		
		System.out.println("\n \nNumber of nodes");
		ll.countRec();
		
		System.out.println("\n \nreverse");
		ll.reverse();
		ll.display();

	}

}
