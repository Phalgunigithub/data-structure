package stack;

public class TestStack {

	public static void main(String[] args) {
		StackClass st = new StackClass(10);
		st.peek();
		st.pop();
		st.push(5);
		st.push(10);
		st.display();
		
		st.pop();
		st.display();
		st.pop();
		st.display();
		st.push(5);
		st.push(10);
		System.out.println("pop"+st.pop());
		st.display();
		st.peek();

	}

}
