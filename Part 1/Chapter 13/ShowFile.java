import java.io.*;

class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        // confirm that a filename has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if(i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("IO Error: " + e);
        } finally {
            // close the file in all cases
            try {
                if(fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}