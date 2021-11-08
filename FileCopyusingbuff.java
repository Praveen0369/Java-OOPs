import java.io.*;
import java.io.IOException;
 
public class FileCopyusingbuff {
 
	public static void main(String[] args) {
 
		try {
			FileReader fin = new FileReader("input.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fout = new FileWriter("output.txt", true);
			String s;
 
			while ((s = br.readLine()) != null) { 
				fout.write(s);
				fout.flush();
			}
			br.close();
			fout.close();
                        System.out.println("file copied");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
