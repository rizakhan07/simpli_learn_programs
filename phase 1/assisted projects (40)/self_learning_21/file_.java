package self_learning_21;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.util.Scanner;

public class file_ {
	public static void main (String[] args) throws IOException
		{
			
			@SuppressWarnings("unused")
			
			FileWriter file = new FileWriter("C:\\Users\\Muhammad Riza\\eclipse-workspace\\assesment questions\\src\\self_learning_21\\php.txt",true );
			BufferedWriter Bw= new BufferedWriter(file);
			Bw.write("zoya is my fiance");
			@SuppressWarnings("resource")
			BufferedReader Br = new BufferedReader(new FileReader ("C:\\Users\\Muhammad Riza\\eclipse-workspace\\assesment questions\\src\\self_learning_21\\php.txt"));
			Bw.newLine();
			Bw.close();
			Br.read();
			System.out.println("statement is printed ");
			file.close();
	
		}

	}


