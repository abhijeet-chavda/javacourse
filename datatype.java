/*
 * a variable in Java must be a specified data type:
 * Data types are divided into two groups:

Primitive data types -> includes byte, short, int, long, float, double, boolean and char
Non-primitive data types -> such as String, Arrays and Classes (you will learn more about
these in a later chapter)

Note : Primitive types are predefined (already defined) in Java. Non-primitive
 types are created by the programmer and is not defined by Java 
 (except for String).
 */


public class Main {
  public static void main(String[] args) {
    int myNum = 5;               // integer (whole number)
    float myFloatNum = 5.99f;    // floating point number
    char myLetter = 'D';         // character
    boolean myBool = true;       // boolean
    String myText = "Hello";     // String    
    System.out.println(myNum);
    System.out.println(myFloatNum);
    System.out.println(myLetter);
    System.out.println(myBool);
    System.out.println(myText);
  }
}
