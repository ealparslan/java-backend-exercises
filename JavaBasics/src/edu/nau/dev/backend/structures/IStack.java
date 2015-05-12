package edu.nau.dev.backend.structures;

public interface IStack {
	
	public void push(BasicRecord rec);
	public void pull(BasicRecord rec);
	public String printStack();
	
}
