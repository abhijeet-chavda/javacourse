package javafullcourse;

import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
	System.out.println("Enter Number That You Want To Know Table: ");
     Scanner sc=new Scanner(System.in);
     int no=sc.nextInt();
     int ans;
     int i;
     for(i=1;i<=10;i++) {
    	 ans=no*i;
    	 System.out.println(+no+"\t"+i+"\t"+ans);
     }
     

	}

}
