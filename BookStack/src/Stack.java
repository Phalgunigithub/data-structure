
public class Stack {
	
	
	private int size;
	private int top;
	private Book[] arr;
	public Stack(int size) {
		super();
		this.size = size;
		this.top = -1;
		this.arr = new Book[size];
	}
	
	
	public boolean isEmpty() {
		if(top==-1)
			return true;
		return false;
	}
	
	public boolean isFull() {
		if(top==size-1)
			return true;
		return false;
	}
	
	public boolean push(Book value) {
		if(!isFull()){
			arr[++top]=value;
			return true;
		}
		return false;
	}
	
	public Book pop() {
		if(!isFull()) {
			return  arr[top--];
			
		}
		return null;
	}
	
	public Book peek() {
		if(!isFull()) {
			
			return arr[top];
		}
		return null;
	}
	
	public void display() {
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public Book search(String title) {
		for(int i=0;i<=top;i++) {
			if(arr[i].getTitle().equals(title)){
				return arr[i];
			}
		}
		return null;
	}
	
	public void updated(String title,Book updatedBook) {
		for(int i=0;i<=top;i++) {
			if(arr[i].getTitle().equals(title)) {
				arr[i]=updatedBook;
			}
		}
	}
	
	public void sort() {
		for(int i=0;i<=top;i++) {
			for(int j=0;j<top-i;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					Book temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	
	
//	private int maxsize;
//	private int top;
//	private int[] arr;
//	
//	
//	public Stack(int maxsize) {
//		super();
//		this.maxsize = maxsize;
//		this.top = -1;					//initially empty
//		this.arr = new int[maxsize];
//	}
//	
//	
//	public boolean isFull() {
//		if(top==maxsize-1) {
//			return true;
//	}
//		return false;
//}
//	
//	public boolean isEmpty() {
//		
//		if(top==-1)
//			return true;
//		return false;
//	}
//	
//	public boolean push(int value) {
//		if(!isFull()) {
//			arr[++top]=value;    //increment index and store value
//			return true;
//		}
//		return false;
//	}
//	
//	public int pop() {
//		if(!isEmpty()) {
//			int temp=arr[top--];//stor evalue and dercement
//			return temp;
//		}
//		return -999;
//	}
//	
//	public void display() {
//		for(int v:arr) {
//			System.out.print(v +" ");
//		}
//	}
//	
//	public int peek() {
//		if(!isEmpty()) {
//			return arr[top];
//		}
//		return -999;
//	}
//	
	
}
