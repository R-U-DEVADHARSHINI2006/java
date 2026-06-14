package itjava.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ioexcep {

    public static void main(String[] args) {
        try {
            m1();
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void m1() throws FileNotFoundException, IOException {
        FileReader f = new FileReader(
            "C:\\Users\\Devadharshini R U\\eclipse-workspace\\itjava\\src\\student.txt"
        );

        f.close();
    }
}
