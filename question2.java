package training;

import java.io.*;

public class question2{

	public static void main(String[] args) {
		FileOutputStream target = null;
		try {
			try {
				target = new FileOutputStream("C:\\Users\\Sterling\\eclipse-workspace\\training\\src\\main\\java\\training\\test.txt");
				for (int i = 0 ; i < 100 ; i++)
				{
					target.write((byte) i);
					
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
