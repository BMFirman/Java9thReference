class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);
        /*
            we have access to everything defined in the original
            however when c is assigned to ob, it can only use whatever
            is defined in ob and how ob implements what it has defined 
        */
        c = ob; // c now referes to AnotherClient object
        c.callback(42);
    }
}