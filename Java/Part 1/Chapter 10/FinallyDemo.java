// page 226 lists all the built in exceptions
class FinallyDemo {
    // throw an exception out of the method
    static void procA() {
        try {
            System.out.println("Inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA's finally");
        }
    }

    // return from within try block
    static void procB() {
        try {
            System.out.println("Inside procB");
            return;
        } finally {
            System.out.println("procB's finally");
        }
    }

    // execute a try block normaly
    static void procC() {
        try {
            System.out.println("inside procC");
        } finally {
            System.out.println("procC's finally");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (RuntimeException e) {
            System.out.println("Exception caught" + e);
        }
        procB();
        procC();
    }
}