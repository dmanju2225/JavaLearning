import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class appendTextToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter("C:\\Users\\satya\\Desktop\\Java\\sample.txt",true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			pw.println();
			pw.println("writing program to append text to a file");
			pw.println("to learn flie handling in java");
			System.out.println("open the file to check output");
			pw.flush();// without flush it wont write to the file
		} catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				fw.close();
				bw.close();
				pw.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
