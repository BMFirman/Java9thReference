// Demonstrate thread groups.
class NewThread extends Thread {
    boolean suspendFlag;

    NewThread(String threadname, ThreadGroup tgOb) {
        super(tgOb, threadname);
        System.out.println("New thread: " + this);
        suspendFlag = false;
        start(); // Start the thread
    }

    // This is the entry point for thread.
    public void run() {
    try {
        for(int i = 5; i > 0; i--) {
            System.out.println(getName() + ": " + i);
            Thread.sleep(1000);
            synchronized(this) {
                while(suspendFlag) {
                    wait();
                } 
            }
        }
    } catch (Exception e) {
        System.out.println("Exception in " + getName());
    }
        System.out.println(getName() + " exiting.");
    }
    
    synchronized void mysuspend() {
        suspendFlag = true;
    }
    
    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}

class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB= new ThreadGroup("Group B");

        NewThread ob1 = new NewThread("One", groupA);
        NewThread ob2 = new NewThread("Two", groupA);
        NewThread ob3 = new NewThread("Three", groupB);
        NewThread ob4 = new NewThread("Four", groupB);

        System.out.println("\nHere is output from list()");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("Suspending groupA");
        Thread tga[] = new Thread[groupA.activeCount()];
        groupA.enumerate(tga); // get threads in a group
        for(int i=0; i<tga.length; i++) {
            ((NewThread)tga[i]).mysuspend();
        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        for(int i=0; i<tga.length; i++) {
            ((NewThread)tga[i]).myresume();
        }

        // wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (Exception e) {
            System.out.println("Exception in main thread");
        }
        System.out.println("Main thread exiting.");
    }
}