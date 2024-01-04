import java.util.Scanner;




public class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		StudentDatabase sd= new StudentDatabase();
		boolean exit=true;
		int ch;
		do {
			System.out.println("enter choice 1 insert at first");
			ch=sc.nextInt();
			switch(ch) {
			
			case 1 :
				System.out.println("Enter age and name");
				Student s1=new Student(sc.nextInt(),sc.next());
				sd.insertAtFirst(s1);
				break;
				
			case 2:
				sd.display();
				
			case 3:{
				System.out.println("enter age and name");
				Student s2=new Student(sc.nextInt(),sc.next());
				sd.insertAtLast(s2);
				break;
			}
			
			case 5 :{
				System.out.println("enter age and name");
				Student s3=new Student(sc.nextInt(),sc.next());
				sd.insertAtposition(s3,sc.nextInt());
			}
			
			case 4:
				exit=false;
				break;
			
		}
		}while(exit);

}}
