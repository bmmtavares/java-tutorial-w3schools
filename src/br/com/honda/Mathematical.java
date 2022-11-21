package br.com.honda;

public class Mathematical {

	public static void main(String[] args) {
		
		System.out.println(Math.max(5, 10)); //retorna maior
		System.out.println(Math.min(5, 10)); //retorna menor
		System.out.println(Math.sqrt(64)); //raiz quadrada
		System.out.println(Math.abs(-4.7)); //retorna valor absoluto positivo
		System.out.println(Math.random()); //retorna numero aleatorio entre 0(inclusive) e 1(exclusive)
		//retornar nro entre 0 e 100
		int randomNum = (int)(Math.random() * 101);
		System.out.println(randomNum);
	}

}
