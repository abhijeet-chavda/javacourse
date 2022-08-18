package javafullcourse;
import java.util.Scanner;

public class arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculator");
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter Any Number");
	     int a=sc.nextInt();
	     int b=sc.nextInt();
	     int c;
	     System.out.println("1) -- Addition -- ");
	     System.out.println("2) -- Subtraction -- ");
	     System.out.println("3) -- Multiplicaton -- ");
	     System.out.println("4) -- Division -- ");
	     System.out.println("5) -- Reminder -- ");
	     
	     System.out.println("Enter Your Choice");
	     int ch=sc.nextInt();
	     
	     switch(ch) {
	     case 1:c=a+b;
	     System.out.println("Additon is : "+c);
	     break;
	     case 2:c=a-b;
	     System.out.println("Subtraction is : "+c);
	     break;
	     case 3:c=a*b;
	     System.out.println("Multiplication is : "+c);
	     break;
	     case 4:c=a/b;
	     System.out.println("Division is : "+c);
	     break;
	     case 5:c=a%b;
	     System.out.println("Reminder is : "+c);
	     break;
	     default:System.out.println("Please! Enter Valid Choice");
	     }

	}

}
