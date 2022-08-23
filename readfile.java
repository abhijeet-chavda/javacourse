import java.io.FileReader;

public class readfile {
public static void main(String args[]) {
	try {
		FileReader obj=new FileReader("F:\\add.txt");//"F:\add.txt"
	     
		try {
			int i;
			while((i=obj.read())!=-1) {
				System.out.println((char)i);
			}
		}
		finally {
			obj.close();
		}
	}
	
	
	
	catch(Exception e) {
		System.out.println(e);
	}
}
}
