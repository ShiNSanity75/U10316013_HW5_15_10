class MyStack implements Cloneable {
	private ArrayList<Object> list = new ArrayList<Object>();

	//is the stack empty?
	public boolean isEmpty() {
		return list.isEmpty();
	}

	//get the number of the elements 
	public int getSize() {
		return list.size();
	}

	//return the top element in the stack
	public Object peek() {
		return list.get(getSize() - 1);
	}

	//return and remove the top element in the stack
	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	//add a new element to the top of the stack
	public void push(Object o) {
		list.add(o);
	}

	/** Override the toString in the Object class */
	public String toString() {
		return "stack: " + list.toString();
	}

	public Object clone() {
		try {
			//Perform a shallow copy
			MyStack stack = (MyStack) super.clone();
			//Deep copy on list
			stack.list = (ArrayList<Object>) this.list.clone();//Deep copy on list
			return stack;
		} catch (CloneNotSupportedException ex) {
			return null;
		}
	}
}

