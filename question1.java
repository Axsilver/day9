package training;

import java.io.*;

public class question1{

	public static void main(String[] args) {
		
		FileInputStream target = null;
		try {
			try {
				target = new FileInputStream("C:\\Users\\Sterling\\eclipse-workspace\\training\\src\\main\\java\\training\\test.txt");
				int temp = 0;
				while((temp = target.read()) != -1)
				{
					System.out.println(temp);
					
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
