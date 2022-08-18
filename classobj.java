package javafullcourse;

public class classobj {
	
	String str="Abhijeet";
	int age=18;
	String gender="Male";
	
	 void Get() {
		System.out.println("I am Living In Ahmedabad");
	}
	void Set() {
		System.out.println("Currently,Studying IT in Diploma");
	}
	void Put() {
		System.out.println("I Like English Songs");
	}
	

	public static void main(String[] args) {
		
		classobj object=new classobj();
		System.out.println(object.str);
		System.out.println(object.age);
		System.out.println(object.gender);
		object.Get();
		object.Set();
		object.Put();
		
		
	}

}
