package code1020;

public class Example01 {
	public static void main(String [] args){
		MyThread myThread=new MyThread();
		myThread.start();
		while(true){
			System.out.println("main()方法正在运行");
		}
	}
}
class MyThread extends Thread{
	public void run(){
		while(true){
			System.out.println("MyThread类的run()方法在运行");
		}
	}
}
