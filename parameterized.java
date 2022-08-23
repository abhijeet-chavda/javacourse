

public class parameterized {
int x,y;
	parameterized(int a,int b)
	{
		x=a;y=b;
	}
	void show() {
		System.out.println("The Sum Of Two Numbers Is : "+(x+y));
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		parameterized obj=new parameterized(500,500);
		obj.show();

	}

}
