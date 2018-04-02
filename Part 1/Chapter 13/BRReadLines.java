// read a string from console using a buffered reader
import java.io.*;

class BRReadLines {
    public static void main(String[] args) {
        // create the BufferedReader
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("type 'stop' to end.");
        try {
            do {
                str = br.readLine();
                System.out.println(str);
            } while (!str.equals("stop"));
        } catch (IOException e) {
            System.out.println("Something went wrong " + e);
        }
    }
}