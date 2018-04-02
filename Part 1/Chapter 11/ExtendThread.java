// implementing runnable
class NewThread extends Thread {
    Thread t;

    NewThread() {
        // create a new second thread
        super("Demo Thread");
        System.out.println("Child thread " + this);
        start();
    }

    // this is the entry point for the second thread
    public void run() {
        try {
            for(int i=0; i<6; i++) {
                System.out.println("Child thread: " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted");
        }
        System.out.println("Exiting the child thread");
    }
}

class ExtendThread {
    public static void main(String[] args) {
        new NewThread(); // create a new thread

        try {
            for(int i=0; i<6; i++) {
                System.out.println("Main thread:  " + i);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interuppted");
        }
        System.out.println("Exiting the main thread");
    }
}