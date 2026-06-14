package itjava.example;
import java.io.FileWriter;
import java.io.IOException;
public class filewritter {

	public static void main(String[] args) throws IOException{
		FileWriter write = new FileWriter("C:\\Users\\Devadharshini R U\\eclipse-workspace\\itjava\\src\\itjava\\example\\stud.txt",true);
write.write("hello world\n");
write.write("first java class\n");
	write.close();

}
}
