package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter com um numer inteiro para a multiplicação");
		int numero = sc.nextInt();
		int contador = 1;
		while (contador < 11) {
			System.out.println(numero + " X " + contador++ + " = " + contador * numero);
		}
		sc.close();
	}

}
