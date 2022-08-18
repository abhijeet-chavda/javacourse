package javafullcourse;
import java.util.Scanner;
public class whileloop {
	
          public static void main(String args[]) {
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter Any Number");
	      int num=sc.nextInt();
	      while(num>0) {
	    	  if(num%2==0) {
	    		  System.out.println("Even Number");
	    	  }else
	    		  System.out.println("Odd Number");
	      }
	      System.out.println("While Loop Terminated");
}
}
