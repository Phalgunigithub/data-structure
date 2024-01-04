package queue;

public class TestQueue {

	public static void main(String[] args) {
		QueueClass q = new QueueClass(5);
		
		q.deQueue();
		q.enQueue(2);
		q.enQueue(5);
		q.enQueue(10);
		q.display();
		q.deQueue();
		q.display();
		q.front();
		q.deQueue();
		q.display();

	}

}
