import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class text {

	
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\sai\\Desktop\\new.txt");
		f.createNewFile();
		FileWriter w=new FileWriter("C:\\Users\\sai\\Desktop\\new.txt");
		BufferedWriter out=new BufferedWriter(w);
		out.write("Hello");
		out.newLine();
		out.flush();
		FileReader r=new FileReader("C:\\Users\\sai\\Desktop\\new.txt");
		BufferedReader bf=new BufferedReader(r);
		System.out.println(bf.readLine());
	}

}
