package br.com.honda.Classes;

public class ThreadsDemoIsAlive extends Thread {
	public static int amount = 0;

	public static void main(String[] args) {

		ThreadsDemoIsAlive thread = new ThreadsDemoIsAlive();
		thread.start();

		// wait for the thread to finish
		while (thread.isAlive()) {
			System.out.println("waiting...");
		}

		// update amount and print its value
		System.out.println("Main: " + amount);
		amount++;
		System.out.println("Main: " + amount);

	}

	@Override
	public void run() {
		amount++;
	}

}
