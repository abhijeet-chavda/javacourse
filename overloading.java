class hello{
	void show()
	{
		System.out.println("Hello Server!");
	}
}
class hey extends hello{
	void show(int a,int b) {
		int c;
		c=a+b;
		System.out.println("Sum Is : "+c);
	}
}
class fine extends hey{
	void show (int a,double d)
	{
		double z;
		z=a+d;
		
	}
	
}
public class overloading{
	public static void main(String args[]) {
		fine obj=new fine();
		obj.show();obj.show(10,40);obj.show(50,49);
	}
}