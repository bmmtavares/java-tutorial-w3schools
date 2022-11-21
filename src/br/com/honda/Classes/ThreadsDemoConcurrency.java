package br.com.honda.Classes;

public class ThreadsDemoConcurrency extends Thread {
	public static int amount=0;
	
	public static void main(String[] args) {
		
		ThreadsDemoConcurrency thread = new ThreadsDemoConcurrency();
		thread.start();
		System.out.println(amount);
		amount++;
		System.out.println(amount);

	}
	
	@Override
	public void run(){
		amount++;
	}

}
