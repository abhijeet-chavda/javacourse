/*import java.io.*;

public class createfile {

	public static void main(String[] args) {
		File f=new File("F:\\demo.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("File Successfully Created");
			}
			else {
				System.out.println("File Already Exists!");
			}
		}
		catch(IOException e) {
			System.out.println("Exception Handled..!!");
		}
		

	}

}*/

//If we want to bypass exception so it can be done using "Throw" keyword
//throws always written inside Main method
//So now,main method caller means(JVM)handles the Exception

import java.io.*;

public class createfile {

	public static void main(String[] args)throws Exception {
		File f=new File("F:\\demo.txt");
		
			if(f.createNewFile()) {
				System.out.println("File Successfully Created");
			}
			else {
				System.out.println("File Already Exists!");
			}
		}
		
		

	}



