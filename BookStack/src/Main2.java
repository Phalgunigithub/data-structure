import java.util.Scanner;

public class Main2 {
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		Stack s=new Stack(5);
		
		while(true){
			System.out.println("Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. View Top Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.println("6. update");
            
            switch(sc.nextInt()) {
            	
            case 1 :
            	Book b1= new Book(sc.next(),sc.next());
            	s.push(b1);
            	break;
            
            
            case 2:
            	s.display();
            	break;
            	
            case 3:
            	System.out.println(s.peek());
            	break;
            	
            case 4:
            	System.out.println(s.pop());
            	break;
            	
            case 5:
            	System.out.println(s.search(sc.next())); 
            	
            case 6:
            	s.updated(sc.next(), new Book(sc.next(),sc.next()));
		  
            case 7:
            	s.sort();
            }
		
	}
	}
}
