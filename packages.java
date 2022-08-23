/*
 * package--> package is collection of classes , interface , and sub-package in a 
 * same type into particular group
 * 
 * package has 2 types->pre-defined and user-defined
 * 
 * user defined package syntax ->package packagename;
 * rules-package keyword must be start with statement
 * 
 * exm->folder where we store data of same type
 * 
 * we must write "javac -d .packages.java" for execute program..
 * 
 * 
 * --> Advantages Of Package
 * 
 *     ->1) Reusability ->same package can be used in diffrent projects
 *     ->2) Security -> package provide security with access specifier(private/default)
 *     ->3) Fast Searching ->before package we have to search from whole library of java 
 *          its takes lots of times
 *     ->4) Naming Conflecting ->we can make same class on diffrent package
 *     ->5) Hiding ->we can able to hide source code  
 *     
 *   
 * --> Disadvantages Of Package
 * 
 *     ->1) we can't pass parameter to the package exm-packagename(wecan't)
 */
//--------------------------->User-Defined Package<---------------------------------
package abhi;
class packages {
void show() {
	System.out.println("Abhijeet Chavda");
}
public static void main(STring args[]) {
	packages obj=new packages();
	obj.show();
}
}
