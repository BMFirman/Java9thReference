// implementing runnable
class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String theThreadName) {
        name = theThreadName;
        // create a new second thread
        t = new Thread(this, name);
        System.out.println("New thread " + t);
        t.start(); // start the thread
    }

    public void run() {
        try {
            for(int i=0; i<6; i++) {
                System.out.println(name + ": " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " thread interrupted");
        }
        System.out.println(name + " exiting");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        new NewThread("One"); 
        new NewThread("Two"); 
        new NewThread("Three"); 

        try {
            // wait for the other threads to end
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interuppted");
        }
        System.out.println("Exiting the main thread");
    }
}