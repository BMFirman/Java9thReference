// an incorrect implementation of producer/consumer

class Qq {
    int n;

    Qq() {
        n = 0;
    }

    synchronized int get() {
        System.out.println("Got: " + n);
        return n;
    }

    synchronized void put(int n) {
        this.n = n;
        System.out.println("Put: " + n);
    }
}

class Producer implements Runnable {
    Qq q;

    Producer(Qq q) {
        this.q = q;
        // Thread(Runnable target, String name)
        // allocate thread object
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;

        while(true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Qq q;

    Consumer(Qq q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while(true) {
            q.get();
        }
    }
}

class PC {
    public static void main(String[] args) {
        Qq q = new Qq();
        new Producer(q);
        new Consumer(q);

        System.out.println("Press control-c to stop");
    }
}