import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class lineNwordsNcharCountInFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader=null;
		try {
			 reader=new BufferedReader(new FileReader("C:\\Users\\satya\\Desktop\\Java\\sample.txt"));//giving file path to read
			String currentLine=reader.readLine();//will read first line
			int lineCount=0;
			int wordCount=0;
			int charCount=0;
			while(currentLine!=null){//when it reads first line
				lineCount=lineCount+1;//line count increment by 1
				String[] words=currentLine.split("\\s");//to get word count splitting line by space
				wordCount=wordCount+words.length;//counting words in each line and adding
				for(String word:words){//going to each word in a line
					charCount=charCount+word.length();	//and counting characters in each word and adding
				}
				currentLine=reader.readLine();//after calculating in the above it is reading second line and go to loop again
			}
			System.out.println("no of lines in a file "+lineCount);
			System.out.println("no of words in a file "+wordCount);
			System.out.println("no of charcaters in a file "+charCount);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try{
				reader.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}

	}

}
