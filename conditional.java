package javafullcourse;
import java.util.Scanner;
public class conditional {
     public static void main(String args[]) {
    	 int a=20;int b=40;int c=20;
            int r=(a>b)?(a>c?a:c):(b>c?b:c);
            System.out.println(r);
     }
}
