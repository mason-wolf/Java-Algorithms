package app;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<String> invoices = new Queue<>();
		invoices.enqueue("Invoice 1");
		invoices.enqueue("Invoice 2");
		invoices.enqueue("Invoice 3");
		
		System.out.println("Queue size: " + invoices.size());
		
		while (invoices.size() > 0)
		{
			String invoice = invoices.dequeue();
			System.out.println("Processing: " + invoice);
		}
	}

}
