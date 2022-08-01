package training;

import java.io.*;




public class question6{

	public static void main(String[] args) {
		
		Rock myRock = new Rock(5);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("C:\\Users\\Sterling\\eclipse-workspace\\training\\src\\main\\java\\training\\myRock.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(myRock);
			System.out.println("done");
		}
		catch (Exception e)
		{
			
		}
		
		
		
		
	}

}


class Rock implements Serializable{
	private int size;
	
	public Rock(int size)
	{
		this.size = size;
	}
}