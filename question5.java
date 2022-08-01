package training;

import java.io.*;

public class question5{

	public static void main(String[] args) {
		
		BufferedReader source = null;
		BufferedWriter target = null;
		
		try {
			try {
				Reader src = new FileReader("C:\\Users\\Sterling\\eclipse-workspace\\training\\src\\main\\java\\training\\test.txt");
				source = new BufferedReader(src);
				String line = null;

				
				File tgt = new File("C:\\Users\\Sterling\\eclipse-workspace\\training\\src\\main\\java\\training\\testtt.txt");
				Writer write = new FileWriter(tgt);
				target = new BufferedWriter(write);
				
				
				while((line = source.readLine()) != null)
				{
					target.write(line);
					target.flush();
					
					
				}
				System.out.println("Success");
			}
			catch(Exception e)
			{
				
			}
		}
		catch(Exception e)
		{
			
		}
		
		
		
	}

}
