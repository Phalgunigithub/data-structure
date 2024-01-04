package queue;

public class QueueClass {
	public int end;
	public int maxSize;
	public int queueArr[];

	public QueueClass(int size) {
		super();
		this.end = -1;
		this.maxSize = size;
		this.queueArr = new int[size];
	}

	public void enQueue(int n) {
		if (end == maxSize - 1) {
			System.out.println("Queue full....");
			return;
		}

		end++;
		queueArr[end] = n;
	}

	public int deQueue() {
		if (end == -1) {
			System.out.println("Queue empty...");
			return -1;
		}

		int n = queueArr[0];
		for (int i = 1; i <= end; i++) {
			queueArr[i - 1] = queueArr[i];
		}
		end--;
		return n;
	}

	public void front() {
		if (end == -1) {
			System.out.println("Queue empty...");
			return;
		}
		System.out.println("front " + queueArr[0]);
	}

	public void display() {
		if (end == -1) {
			System.out.println("Queue empty...");
			return;
		}
		for (int i = 0; i <= end; i++)
			System.out.print(queueArr[i] + "->");
		System.out.println();
	}

}
