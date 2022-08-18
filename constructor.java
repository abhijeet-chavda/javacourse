package javafullcourse;

public class constructor {
int a; String name;
	constructor(){//its a special member function whose name same as class name/memory allocate/invokes at object declare
		
		System.out.println(a+" "+name);
	}
	void show() {
		//System.out.println(a+" "+name);
	}
	
	public static void main(String[] args) {
          constructor obj=new constructor();
          

	}

}
//Default constructor --> automatically initialize base value of variables (exm;int a default value 0 and string name is null.
