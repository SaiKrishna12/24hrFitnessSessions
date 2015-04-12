package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteonTextFiles {

	
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\sai\\Desktop\\sample.txt");
		f.createNewFile();
		//Write Operations
		FileWriter w=new FileWriter("C:\\Users\\sai\\Desktop\\sample.txt");
		BufferedWriter out=new BufferedWriter(w);
		out.write("Hello how r u");
		out.newLine();
		out.write("Hi");
		out.flush();
		//Read Operation
		FileReader r=new FileReader("C:\\Users\\sai\\Desktop\\sample.txt");
		BufferedReader bfr=new BufferedReader(r);
		System.out.println(bfr.readLine());
		System.out.println(bfr.readLine());
		
		
		

	}

}
