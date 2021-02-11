package exceptions;

import java.io.IOException;

public class Demo1 {

    public static void main(String[] args) throws IOException {

       try {
           WriteFile.writeToFile("HelloWorld");
       }catch (IOException e) {
           e.printStackTrace();
           throw new IOException("Error Writing to HelloWorld");
       }

        //bunch of code
        //bunch of code
        //bunch of code
        //bunch of code
        //bunch of code
        //bunch of code
        try {
            WriteFile.writeToFile("Good Bye World");
        }catch (IOException e) {
            e.printStackTrace();
            throw new IOException("Error Writing to Good Bye World");
        }

    }
}
