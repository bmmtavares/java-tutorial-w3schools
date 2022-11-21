package br.com.honda.Classes;

public class ThreadsDemoRunnable implements Runnable {

	public static void main(String[] args) {
		
		ThreadsDemoRunnable obj = new ThreadsDemoRunnable();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("This code is outside of thread");

	}
	public void run(){
		System.out.println("This code is running in a thread");
	}

}
