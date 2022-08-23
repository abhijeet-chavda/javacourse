/*
 * Exception --> it is unexpected/unwanted/abnormal situation that occured at
 * run time called as Exception
 * 
 * exm-->powercut while using computer / file not found exception
 * 
 * 
 * Exception Handling -->we should have an external optional source through we
 * can handle the exception called as exception handling
 * 
 * if we have power backup than we can handle powercut exception..
 */
//->we can't devide 10 by 0 so there is an exception occured..

public class exception{
	public static void main(String args[]) {
		int a=10,b=0,c;
		c=a/b;
		System.out.println(c);
	}
}

/*
 the object oriented mechanism has provided the following techniques to work with
 exception..
 
-->1) Try -->2) Catch -->3) Throw -->4) Throws -->5) Finally

-->Predefined Exception --> 1) Try   2) Catch
-->Userdefined Exception--> 1) Throw 2) Throws
-->Exception gone or not  -->Finally Keyword Executes
 */
