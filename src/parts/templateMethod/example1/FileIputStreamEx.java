package parts.templateMethod.example1;

import java.io.FileInputStream;
import java.io.IOException;

public class FileIputStreamEx {
	
	public static void main(String[] args){
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test.txt");
			fis.read();
	    } catch (IOException e) { 
	    	System.out.println("Exception" + e);
	    }
	}
	
}



