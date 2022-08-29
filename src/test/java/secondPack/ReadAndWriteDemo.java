package secondPack;

import java.io.*;

public class ReadAndWriteDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("Ali.html");
        file.createNewFile();

        FileWriter w = new FileWriter(file);
        w.write("<html><body><h2>Ali Basel Bdaer</h2></body></html>");
        w.flush();
        w.close();

        BufferedReader read = new BufferedReader(new FileReader(file));
        String rr;

        while((rr = read.readLine()) != null){

            System.out.println(rr);

        }

        read.close();
    }
}
