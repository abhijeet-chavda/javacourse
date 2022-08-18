package javafullcourse;

public class defaultcon {
int a;String str;boolean c;
	/*defaultcon(){
		a=100;str="Abhi";c=true;
		System.out.println(a+" "+str+" "+c);
	}*/
	void show() {
		System.out.println(a+" "+str+" "+c);
	}
	
	public static void main(String[] args) {
	
           defaultcon obj=new defaultcon();
           obj.show();//bydefault i will take default value ea(0 null false)instead of 100 Abhi true..
	}

}
