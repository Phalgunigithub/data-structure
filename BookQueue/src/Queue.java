
public class Queue {
	
	
	private int end;
	private int size;
	private Book[] arr;
	public Queue(int size) {
		super();
		this.end = -1;
		this.size = size;
		this.arr = new Book[size];
	}
	
	public boolean isEmpty() {
		if(end==-1)return true;
		return false;
	}
	
	public boolean isFull() {
		if(end==size -1)return true;
		return false;
	}
	
	public void enqueue(Book value) {
		if(!isFull()) {
			arr[++end]=value;
			
		}
	}
	
	public Book dequeue() { //store->shift->decremet->return
		//store front value
		//shift index to left(to remove front) and update(decrement) last index value
		if(!isEmpty()) {
			Book fvalue=arr[0];
			for(int i=1;i<=end;i++) {
			arr[i-1]=arr[i];
			}
			end--;
			return fvalue;
			
			
			
		}
		return null;
	}
	
	public Book front() {
		if(!isEmpty()) {
			return arr[0];
		}
		return null;
	}
	
	public void display()
	{
		for(int i=0;i<=end;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public Book search(String title) {
		for(int i=0;i<=end;i++) {
			if(arr[i].getTitle().equals(title)) {
				return arr[i];
			}
		}
		return null;
		
	}
	
	public Book update(String title,Book ibook) {
		for(int i=0;i<=end;i++) {
			if(arr[i].getTitle().equals(title)) {
				arr[i]= ibook;
			}
		}
		return null;
		
	}
	
	public void sort()
	{
		for(int i=0;i<=end;i++) {
			for(int j=0;j<=end-i;i++) {
				if(arr[j].comapareTo(arr[j+1])>0){
					Book temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
}
