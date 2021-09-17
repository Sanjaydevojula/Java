package javapgms;

import java.io.File;

public class Files {
	public static void main(String[] args) {
		try 
		{
File f = new File( "new3.txt");
				if(f.createNewFile()) {
					System.out.println("file created \n"  +f.getName());
	}
				else {
					System.out.println(" file not created");
				}
				
}
		catch(Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
}
}