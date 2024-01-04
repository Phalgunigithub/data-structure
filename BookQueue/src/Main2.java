import java.util.Scanner;

public class Main2 {
	
public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		Queue q=new Queue(5);
		
		
		
		q.enqueue(new Book("kasjcb" ,"kjbx"));
		q.enqueue(new Book("gxg" ,"fdzh"));
		
		
		while(true) {
			 System.out.println("\nMenu:");
	            System.out.println("1. Enqueue a Book");
	            System.out.println("2. Dequeue a Book");
	            System.out.println("3. Front Book");
	            System.out.println("4. Display Books");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");
	            
	            switch(sc.nextInt()) {
	            case 1:
	            	Book b1= new Book(sc.next(),sc.next());
	            	q.enqueue(b1);
	            	break;
	            
	            
	            case 2:
	            	q.display();
	            	break;
	            	
	            case 3:
	            	System.out.println(q.dequeue());
	            	
	            case 4:
	            	System.out.println(q.front());
	            	
	            case 5:
	            	System.out.println(q.search(sc.next()));
	            	
	            case 6:
	            	System.out.println(q.update(sc.next(), new Book(sc.next(),sc.next())));
	            	
	            case 7:
	            	q.sort();
	            	
		}
		
}

}}
