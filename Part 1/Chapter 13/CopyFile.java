import java.io.*;

class CopyFile {
    public static void main(String[] args) throws IOException {

        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // confirm both files have been specified
        if (args.length != 2) {
            System.out.println("You must speficy src and dst files");
            return;
        }

        // copy a file
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("IO Error: " + e);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e2) {
                System.out.println("Error closing the output file");
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException e2) {
                System.out.println("Error closing the output file");
            }
        }
    }
}