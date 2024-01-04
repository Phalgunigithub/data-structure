import java.util.Scanner;



public class main2 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
//		StudentDatabase sd1=new StudentDatabase();
//		
//		Student s1=new Student(sc.nextInt(),sc.next());
//		sd1.insertAtLast(s1);
//		sd1.display();
		
		StudentDatabase ll = new StudentDatabase();
		
		ll.insertAtFirst(new Student(5, "flaldkj"));
		ll.insertAtFirst(new Student(8, "dsklfj"));
		ll.insertAtFirst(new Student(9, "kdkfdj"));
		ll.insertAtFirst(new Student(10, "amir"));
		
		ll.display();
		
//		ll.insertAtLast(new Student(78,"wjdfh"));
//		
//		ll.display();
//		
//		ll.deleteAtFirst();
//		System.out.println();
//		ll.display();
//		
//		ll.deleteAtLast();
//		System.out.println();
//		ll.display();
//		
//		ll.deleteAtPos(2);
//		System.out.println();
//		ll.display();
		
		System.out.println("Menu");
		System.out.println("Enter 1 for insert at first");
		System.out.println("Enter 2 for insert at last");
		System.out.println("Enter 3 for insert by position");
		System.out.println("Enter 4 for delete from first");
		System.out.println("Enter 5 for delete from last");
		System.out.println("Enter 6 for delete by position");
		System.out.println("Enter 7 for display");
		System.out.println("Enter 8 for search student details by name");
		System.out.println("-----------");
		
		int ch;
		
		do {
			System.out.print("Enter choice:");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter age name");
				ll.insertAtFirst(new Student(sc.nextInt(), sc.next()));
				break;
			case 2:
				System.out.println("Enter age name");
				ll.insertAtLast(new Student(sc.nextInt(), sc.next()));
				break;
			case 3:
				System.out.println("Enter pos :");
				int pos = sc.nextInt();
				System.out.println("Enter age name");
				ll.insertAtposition(new Student(sc.nextInt(), sc.next()),pos);
				ll.display();
				break;
			
			case 7:
				ll.display();
				break;

			case 9:
				System.out.println("Exit");
				break;
			default:
				break;
			}
		} while(ch!=9);
	}

}
