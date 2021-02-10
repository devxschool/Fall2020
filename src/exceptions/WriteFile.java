package exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) throws IOException {
        writeToFile("set");
    }


    //throws keyword declares in the method signature: I want methods that will call writeToFile method to handle
    //the issue. I think they will better places to handle it.
    public static void writeToFile(String txt) throws IOException {
        FileWriter fileWriter = new FileWriter("12/32/test.txt",true);
        fileWriter.write(txt);
        fileWriter.close();
    }

    /**
     * Do not crash, but give a warning message
     * and continue the program.
     *
     * I dont want to make the users of writeToFile method
     * to handle it every time they have to call it everytime
     * @param txt
     * @param path
     */
    public static void writeToFile(String txt, String path) {
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            fileWriter.write(txt);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Catch in a method");
            System.out.println("Wrong path to a file");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
