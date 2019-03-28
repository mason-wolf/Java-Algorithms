package app;

import java.util.LinkedList;

public class Queue<E> {
	
	private LinkedList<E> list = new LinkedList<>();
	
	public void enqueue(E item)
	{
		list.addLast(item);
	}
	
	public E dequeue()
	{
		return list.removeFirst();
	}
	
	public int size()
	{
		return list.size();
	}

}
