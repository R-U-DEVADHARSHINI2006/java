package itjava.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class IOexceptionclass {
public static void main(String[] args) {
	try {
		FileReader f =new FileReader("C:\\Users\\Devadharshini R U\\eclipse-workspace\\itjava\\src\\student");
		System.out.println("File Opened");
	} catch(FileNotFoundException e){
		System.out.println("File not Found");
	}
	
}
}
