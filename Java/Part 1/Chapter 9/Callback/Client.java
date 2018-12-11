interface Callback {
    void callback(int param);
}

class Client implements Callback {
    // implement callback's interface
    public void callback(int p) { // notice callback is public
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " + 
            "may also define other memebers too.");
    }
}