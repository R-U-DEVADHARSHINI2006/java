package itjava.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BufferReaderExample {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(
 new FileReader("C:\\Users\\Devadharshini R U\\eclipse-workspace\\itjava\\src\\itjava\\example\\stud.txt"));
 String line;
        while ((line = br.readLine()) != null) {
        	String[] words = line.split("\\s+");
            System.out.println(line);
            for (String word : words) {
                System.out.println(word);
            }
            
        }

        br.close();
    }
}
