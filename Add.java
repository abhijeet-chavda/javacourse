
package javafullcourse;
import java.util.Scanner;
class Add{
	public static void main(String args[]) {
		System.out.println("THE LORDS OF KINGS-Marksheet");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Name");
	     String name=sc.nextLine();
	     System.out.println("Enter Student Subject Marks");
	     System.out.println("Java Programing");
	     int java=sc.nextInt();
	     System.out.println("Enter Security Marks");
	     int sec=sc.nextInt();
	     System.out.println("Enter Asp.Net Marks");
	     int asp=sc.nextInt();
	     System.out.println("Enter Icn Marks");
	     int icn=sc.nextInt();
	     int total=java+sec+asp+icn;
	     float avg=total/4;
	     
	     
	     System.out.println("Student Name Is : "+name);
	     System.out.println("Obtained Java Marks Is : "+java);
	     System.out.println("Obtained Security Marks Is : "+sec);
	     System.out.println("Obtained Asp.Net Marks Is : "+asp);
	     System.out.println("Obtained Icn Marks is : "+icn);
	     System.out.println("The Total Marks Is : "+total);
	     System.out.println("The Total Percentage Is:"+avg);
	     
	     if(avg>90){
	    	 System.out.println("Congratulation!..");
	    	 
	     }else if(avg>75)
	     {
	    	 System.out.println("Impressive..,Stay Away From Girls And Make Focus On Code");
	     }else if(avg>50) {
	    	 System.out.println("Pretty Well,,Stay Away From Girls For High Life");
	    	
	     }else {
	    	 System.out.println("Its Okay,Now Forget everything and focus on code for best life");
	     }
	     
	}
}

//package javafullcourse;
//import java.util.Scanner;
//
//class Add{
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Value That You Want To Sum");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int sum=a+b;
//		System.out.println("The Sum Of The Two Numbers Is : "+sum);
//	}
//}