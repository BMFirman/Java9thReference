// The target of a loop can be empty
class NoBody {
    public static void main(String[] args) {
        int i, j;

        i = 100;
        j = 200;

        // Find the midpoint between i and j
        while(++i < --j); // There is no body in this loop

        System.out.println("The midpoint is " + i);
    }
}
