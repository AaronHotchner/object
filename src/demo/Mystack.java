package demo;

import java.util.ArrayList;

public class Mystack {
	private ArrayList<Object> stack = new ArrayList<>();
	
	public String toString () {
		return "stack" + stack.toString();
	}
	
	public void push(Object o) {
		stack.add(o);
	}
}
