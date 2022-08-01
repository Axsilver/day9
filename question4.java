package training;

import java.io.*;

public class question4{

	public static void main(String[] args) {
		FileWriter target = null;
		try {
			try {
				target = new FileWriter("C:\\Users\\Sterling\\eclipse-workspace\\training\\src\\main\\java\\training\\testt.txt");
				for (int i = 0 ; i < 100 ; i++)
				{
					target.write(i);
					
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
