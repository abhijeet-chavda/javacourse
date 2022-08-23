/*
 * What Is Thread ..?
 *  ->Thread is a pre-defined class which is available in  java.lang package
 *    Basically,thread is a basic unit of cpu and it is well known  for
 *    independent execution
 *    
 * How To Create Thread In Java ..?
 *  ->1)By extending thread class
 *  ->2)By implementing Runnable interface
 *  
 *  Multitasking has Dependency
 */


//------------------------->By Extending thread class<-------------------------------
class top extends Thread{//Thread is Pre-Defined Class
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Hello Server!");
				Thread.sleep(1000);//it will delay output by 1 sec .
			}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
	}
}
public class multithread {
	public static void main(String[] args) throws InterruptedException{
		top obj=new top();
		obj.start();//start is predefined method it will call void run() method.
		for(int i=0;i<5;i++) {
			System.out.println("Hello World!");
			Thread.sleep(1000);
		}
	}
}

/*
 * Here ,total two thread 1)void main 2)obj.run
 * 1)void main Thread -> it will execute all flow of program and also execute second 
 *   thread where,
 *   
 * 2)obj.run -> this thread only invokes run method..
 */
