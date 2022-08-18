package javafullcourse;
import java.util.Scanner;

class logical{
	public static void main(String args[]) {
		int a=50;
		int b=100;
		if(a==50 && b==100) {
			System.out.println("Hellow Server");
		}else if(a==50 || b==100) {
			System.out.println("Hellow World");
		}else
			System.out.println("Looks Like Something Went Wrong");
	}
}