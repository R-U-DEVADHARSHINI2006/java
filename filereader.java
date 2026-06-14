package itjava.example;
import java.io.FileReader;
import java.io.IOException;
public class filereader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Devadharshini R U\\eclipse-workspace\\itjava\\src\\itjava\\example\\stud.txt");
 int ch;
while ((ch = fr.read()) != -1) {
System.out.print((char) ch);
 }
fr.close();
}
}
