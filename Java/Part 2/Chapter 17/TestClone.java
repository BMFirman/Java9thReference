// demonstrate the clone() method

class TestClone implements Cloneable {
    int a;
    double b;

    // this method calls objects clone()
    TestClone coneTest() {
        try {
            // call clone in Object
            return (TestClone) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not allowed");
            return this;
        }
    }
}

class CloneDemo {
    public static void main(String[] args) {
        TestClone x1 = new TestClone();
        TestClone x2;

        x1.a = 10;
        x1.b = 20.98;

        x2 = x1.cloneTest(); // clone x1

        System.out.pritnln("x1: " + x1.a + " " + x1.b);
        System.out.pritnln("x2: " + x2.a + " " + x2.b);
    }
}