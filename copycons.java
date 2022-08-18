package javafullcourse;

public class copycons {

int a;String name;
	copycons(){
		a=100;name="Abhi";
		System.out.println(a+" "+name);
	}
	copycons(copycons ref){
	
	
		 a=ref.a;
		 name=ref.name;
		System.out.println(a+" "+name);
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	public static void main(String[] args) {
		copycons obj=new copycons();
	
		
		
		copycons obj2=new copycons(ref);
	
	}

}


