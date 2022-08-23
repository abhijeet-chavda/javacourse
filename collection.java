import java.util.ArrayList;

/*
 * What is Collection ..?
 *  ->Java collection are set of pre-defined classes and interfaces that helps
 *    programmer to perform different kinds of data structures operations
 *    like-"searching,sorting,traversing,storing and processing data..
 */
public class collection {
public static void main(String[] args) {
	ArrayList<String> name=new ArrayList<String>();
	name.add("Abhi Chavda");//add is predefined method
	name.add("abhijeet chavda");
	name.add("pallavi chavda");
	System.out.println(name);
	name.add(2,"Monark Chavda");//to add name on third position
	System.out.println(name);
	
	name.remove(0);//we used remove method to remove name from arraylist..
	name.set(0,"Abhijeet Rajput");//it replace with current arraylist
	System.out.println(name);
    System.out.println(name.get(0));//if we want to display particular arraylist
    
    //if we want to clear all arraylist in one click
    name.clear();
    System.out.println(name);
    
   // note:in arraylist data store in array form and in linkedlist data store in linkedlist 
   //      form..
}
}
