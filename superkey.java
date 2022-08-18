package javafullcourse;

public class superkey {
	int a=10;
}
	class subkey extends superkey{
		int a=20;
		void show() {
			System.out.println(a);
		}
	}
	
	class Test{
	
	public static void main(String[] args) {
		subkey obj=new subkey();
		obj.show();

	}
	}
	
