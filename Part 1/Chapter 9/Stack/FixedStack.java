// an implementation of IntStack that uses fixed storage
class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    // allocate and initalize stack w a constructor
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // push an item onto the stack
    public void push(int item) {
        if(tos == stck.length-1){ 
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    // pop and item from the stack
    public int pop() {
        if(tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            // keep in mind the tos-- will reduce the position of tos 
            // no need to waste time properly resetting
            return stck[tos--];
        }
    }
}