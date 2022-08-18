/*
 * package javafullcourse;
 * 
 * public class string {
 * 
 * public static void main(String[] args) { String str="Abhijeet"; int
 * len=str.length(); System.out.println(len); }
 * 
 * }
 */
/*package javafullcourse;
import java.util.Scanner;
public class string {

	public static void main(String[] args) {
		String str="Abhijeet";
		String str2=new String("Abhijeet");
        if(str==str2)//str.equals that compare value in string {
        	System.out.println("Both Are Same");
        } 
        else {
	
        }           	System.out.println("Both Are Diffrent");
	}
}
*/
//Why Strings Are Immutable In Java..
/*package javafullcourse;
import java.util.Scanner;

class string{
	public static void main(String args[]) {
		String str="Abhijeet";         //Immutable (Can't Change)
		str.concat("Chavda");
		System.out.println(str);
	}
}*/

//If We Want To Print Char From Both String Then..

package javafullcourse;
import java.util.Scanner;

class string{
	public static void main(String args[]) {
		String str="Abhijeet";         //Immutable (Can't Change)//But We Can Concate By Making Duplicate String Copy..
		String str2=str.concat(" Chavda");
		System.out.println(str2);
	}
}

//What Are Advantages Of Immutable(Can't Change) Strings In Java..

//1) it will not create memory space for same value string --> Saving Memory or Stop Memory Wastage

//2) Execution Fast Cuz There is same memory executed at run time


