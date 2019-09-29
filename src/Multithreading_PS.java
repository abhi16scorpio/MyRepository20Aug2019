class Learning implements Runnable
{
	static Learning obj1;
	static Learning obj2;
	
	@Override
	public void run()
	{
			try {
				method1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	synchronized void method1() throws InterruptedException
	{
		System.out.println("thread1 has lock of obj1: "+Thread.currentThread().holdsLock(obj1));
		System.out.println("thread1 has lock of obj2: "+Thread.currentThread().holdsLock(obj2));
		
		System.out.println(Thread.currentThread().getName()+" entered method1()");
		Thread.sleep(2400);
		
		method2();
		
		System.out.println(Thread.currentThread().getName()+" leaving method1()");
	}
	
	static synchronized void method2() throws InterruptedException
	{
		System.out.println("thread2 has lock of obj2: "+Thread.currentThread().holdsLock(obj2));
		System.out.println("thread2 has lock of obj1: "+Thread.currentThread().holdsLock(obj1));
		
		System.out.println(Thread.currentThread().getName()+" entered method2()");
		Thread.sleep(2400);
		System.out.println(Thread.currentThread().getName()+" leaving method2()");
	}
}

public class Multithreading_PS
{
	public static void main(String[] args)
	{
		
		System.out.println("main() method started");
		
		Learning obj1 = new Learning();
		Learning obj2 = new Learning();
		
		Thread thread1 = new Thread(obj1);
		Thread thread2 = new Thread(obj2);
		
		thread1.setName("t1");
		thread2.setName("t2");
		
		thread1.start();
		thread2.start();
		
	}
}






