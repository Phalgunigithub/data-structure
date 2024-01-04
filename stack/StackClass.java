package stack;

public class StackClass {
	public int maxSize;
	public int top;
	public int[] stackarr;

	public StackClass(int size) {

		this.maxSize = size;
		this.top = -1;
		this.stackarr = new int[size];
	}
	
	public boolean push(int n) {
		if(top==maxSize-1) {
			System.out.println("stack is full...");
			return false;
		}
		top++;
		stackarr[top]=n;
		return true; 
	}
	
	public int pop() {
		if(top==-1) {
			System.out.println("stack is empty!!");
			return -1;
		}
		int n = stackarr[top];
		top--;
		return n;
	}
	
	public void display() {
		if(top==-1) {
			System.out.println("stack empty...");
			return;
		}
		for(int i=0;i<=top;i++) {
			System.out.print(stackarr[i]+"->");
		}
		System.out.println("");
	}
	
	public void peek() {
		if(top!=-1)
			System.out.println("peek : "+stackarr[top]);
		else
			System.out.println("stack is empty...");
	}

}
