//-------------------------->Write On File---------------------------------------

import java.io.FileWriter;

class writefile{
	public static void main(String args[]) {
		try {
			FileWriter obj=new FileWriter("F:\\add.txt");
			try {
				obj.write("Java Programming Is Best And Trending Language");
			}
			finally {//security/file close related code written in finally
				 obj.close();
			}
			System.out.println("Successfully Data Written In File");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}