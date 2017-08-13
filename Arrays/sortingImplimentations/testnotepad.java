import java.io.IOException;

public class testnotepad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        try
		        {
		            Runtime.getRuntime().exec("notepad.exe");
		        }
		        catch (IOException e)
		        {
		            e.printStackTrace();
		        }
		    }
		}



