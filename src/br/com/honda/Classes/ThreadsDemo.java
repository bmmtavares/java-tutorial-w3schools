package br.com.honda.Classes;

public class ThreadsDemo extends Thread {
	
	
	public static void main(String[] args) {
		
		ThreadsDemo thread = new ThreadsDemo();
		thread.start();
		System.out.println("This code is outside of the thread");

	}
	public void run(){
		System.out.println("This code is running in a thread");
	}

}
