// a subclass must come before a superclass in catch
// statement order, will result in ct error

class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Generic exception catch");
        /*
            This catch is never reached because
            ArthmeticException is a subclass of Exception 
        */
        } // delete when uncommenting below
        /* 
            } catch (ArthmeticException e) { // Error - unreachable
                System.out.println("This is never reached");
            }
        */
    }
}