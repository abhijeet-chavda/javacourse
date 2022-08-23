/*
1) Local Variable
A variable declared inside the body of the method is called local variable. 
You can use this variable only within that method and the other methods in 
the class aren't even aware that the variable exists.

A local variable cannot be defined with "static" keyword.

2) Instance Variable
A variable declared inside the class but outside the body of the method, 
is called an instance variable. It is not declared as static.

It is called an instance variable because its value is instance-specific
and is not shared among instances.

3) Static variable
A variable that is declared as static is called a static variable. 
It cannot be local. You can create a single copy of the static 
variable and share it among all the instances of the class. 
Memory allocation for static variables happens only once when 
the class is loaded in the memory.


-->String - stores text, such as "Hello". String values are surrounded by 
double quotes

-->int - stores integers (whole numbers), without decimals, such as 123 or -123

-->float - stores floating point numbers, with decimals, such as 19.99 or -19.99

-->char - stores single characters, such as 'a' or 'B'. Char values are surrounded
 by single quotes
 
-->boolean - stores values with two states: true or false
*/
public class variable {
  public static void main(String[] args) {
	  int mynum = 5;
	  System.out.println(mynum);
	  float myFloatnum = 5.99f;
	  System.out.println(myFloatnum);
	  char myLetter = 'A';
	  System.out.println(myLetter);
	  boolean myBool = true;
	  System.out.println(myBool);
	  String myText = "Hello";
	  System.out.println(myText);
	  
  }
}
