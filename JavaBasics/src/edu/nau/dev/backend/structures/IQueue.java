package edu.nau.dev.backend.structures;

public interface IQueue {
	
	public void enqueue(BasicRecord rec);
	public void dequeue(BasicRecord rec);
	public String printQueue();

}
