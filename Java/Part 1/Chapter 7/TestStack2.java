// Improved Stack class that uses the length array member.
class Stack {
	private int stck[];
	private int tos;

	// Allocate and inialize the stack
	Stack(int size) {
		stck = new int[size];
		tos = - 1;
	}

	// Push an item onto the stack
	void push(int item) {
		if(tos==stck.length-1) { // Use the length number
			System.out.println("Stack is full.");
		} else {
			stck[++tos] = item;
		}
	}

	// Pop an item from the stack
	int pop() {
		if(tos < 0) {
			System.out.println("Stack underflow.");
			return 0;
		} else {
			return stck[tos--];
		}
	}
}

class TestStack2 {
	public static void main(String[] args) {
		Stack mystack1 = new Stack(5);
		Stack mystack2 = new Stack(5);

		// Push some numbers onto the stacks
		for(int i = 0; i < 5; i++) {
			mystack1.push(i);
			mystack2.push(i+5);	
		}

		// Pop those numbers off the stacks
		System.out.println("Stack in mystack1: ");
		for(int i= 0; i<5; i++) {
			System.out.println(mystack1.pop());
		}

		System.out.println("Stack in mystack2: ");
		for(int i= 0; i<5; i++) {
			System.out.println(mystack2.pop());
		}
	}
}