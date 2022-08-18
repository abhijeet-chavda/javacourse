package javafullcourse;

public class Var {
    int a=10;//instance variable//if we want to call then we must passed class's object
    static double b=20.5;//static variable
	private static char[] sc;
    
	public static void main(String[] args) {
		
               boolean c=true;//local variable
                Var sc=new Var();
              
              System.out.println(sc.a);
              System.out.println(b);
              System.out.println(c);
              
	}

}
