// using trim() to process commands
import java.io.*;

class UseTrim {
    public static void main(String[] args) throws IOException {
        // created a BufferecReader using System.in
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Enter 'stop' to quit.");
        System.out.println("Enter state:");
        do {
            str = br.readLine();
            str = str.trim(); // remove whitespace

            if (str.equals("Illinois")) {
                System.out.println("Capital is springfield");
            } else if (str.equals("NZ")) {
                System.out.println("Wellington");
            }
            // ...
        } while (!str.equals("stop"));
    }
}