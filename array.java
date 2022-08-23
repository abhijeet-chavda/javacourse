/*package javafullcourse;

public class array {

	public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	
	for(int b : a) {
		System.out.println(b + " ");
	}

	}

}
*/
//2nd trick to define array in java
import java.util.Arrays;
import java.util.Scanner;

class array{
	public static void main(String args[]) {
		int a[]=new int[5];
		System.out.println("Enter Array Elements : ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			 a[i]=sc.nextInt();
		}
		 
		for(int b : a) {
			
			System.out.println("Entered Elements Are : "+b);
		}
	}
}
