package subtracao;

import java.util.Scanner;

public class SubtracaoNumero {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um número:");
		int numero = sc.nextInt();
		System.out.println("digite outro número:");
		int numero2 = sc.nextInt();
		int resultado = numero-numero2;
		System.out.println("a subtração dos valor é:"+resultado);
		sc.close();
	}
		
		
		
}
