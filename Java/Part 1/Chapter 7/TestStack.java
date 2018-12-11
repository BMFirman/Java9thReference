class Stack {
	/*
		Both the stck and tos are private, they cannot be altered
		in a way that would be harmful to the stack.
	*/
	private int stck[] = new int[10];
	private int tos;

	// Initalize the top of the stack
	Stack() {
		tos = -1;
	}

	// Push an item onto the top of the stack
	void push(int item) {
		if(tos==9) {
			System.out.println("Stack is full.");
		} else {
			stck[++tos] = item;
		}
	}

	// Pop an item from the stack
	int pop() {
		if(tos<0) {
			System.out.println("Stack underflow.");
			return 0;
		} else {
			return stck[tos--];
		}
	}
}

class TestStack {
	public static void main(String[] args) {
		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();

		// Push some numbers onto the stacks
		for(int i=0; i<10; i++) {
			mystack1.push(i);
			mystack2.push(i*2);
		}

		// Pop the numbers off the first stack
		System.out.println("Stack in mystack1:");
		for(int i=0; i<10; i++) {
			System.out.println(mystack1.pop());
		}
		// Pop the numbers off the second stack
		System.out.println("Stack in mystack2:");
		for(int i=0; i<10; i++) {
			System.out.println(mystack2.pop());
		}

		// These are not legal statements
		// mystack1.tos = -2
		// mystack2.stck[3] = 100;
	}
}