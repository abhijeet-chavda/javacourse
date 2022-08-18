/*package javafullcourse;

import java.util.Scanner;

//1) If Statement
public class conditions {

	public static void main(String[] args) {
		
		System.out.println("Enter Password");
		Scanner obj=new Scanner(System.in);
		int pwd=obj.nextInt();
		if(pwd==99047041) {
			System.out.println("Welcome Abhi!!");
		}

	}*/
	
//2)Else If Statement

/*package javafullcourse;
import java.util.Scanner;
class conditions{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Password : ");
		int pwd=sc.nextInt();
		if(pwd==957546) {
			System.out.println("Welcome Back Abhi!!");
		}else 
			System.out.println("Wrong Password!..,Try Again");
		
	}
}
*/

/*3)Else If Statements

package javafullcourse;
import java.util.Scanner;

class conditions{
	public static void main(String arg[]) {
		System.out.println("Enter Your Marks");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks>90) {
			System.out.println("Congo!..,AA Grade");
			
		}else if(marks>60) {
			System.out.println("Impressive..,BB Grade");
			
		}else if(marks>40) {
			System.out.println("Well ..,CC grade");
		}else
			System.out.println("Better Luck Next Time!");
			
	}
	}
*/
//4)Nested If Statement
package javafullcourse;
import java.util.Scanner;
class conditions{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Age");
	int age=sc.nextInt();
	int wgt=sc.nextInt();
	if(age>18) {
 
	if(wgt>40) {
		System.out.println("Yupp!!..,You Are Now Eligible To Participate");
	}else
			System.out.println("Required Weight Doesn,t Meet Perfectly");
	}else
		System.out.println("Age Must Be Greater Than 18");
	}		
		
}







