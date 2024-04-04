package exercicios;

import java.util.Scanner;

//CalculadouraComMetodoPassagemDeParametro
public class exercicio11 {
	static int soma(int numero01, int numero02) {
		return numero01 + numero02;
	}

	static int subtracao(int numero01, int numero02) {
		return numero01 - numero02;
	}

	static int multiplicaçao(int numero01, int numero02) {
		return numero01 * numero02;
	}

	static int divissao(int numero01, int numero02) {
		return numero01 / numero02;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("selecione a opcao desejada");
		System.out.println("soma");
		System.out.println("subtracao");
		System.out.println("multiplicaçao");
		System.out.println("divissao");
		int opcao = sc.nextInt();
		
		System.out.println("digite o primeiro valor");
		int valor1 = sc.nextInt();
		System.out.println("digite o primeiro valor");
		int valor2 = sc.nextInt();
		
		
		
		switch (opcao) {
		case 1:
			System.out.println(valor1+valor2);
			break;
		case 2:
			System.out.println(valor1-valor2);
			break;
		case 3:
			System.out.println(valor1*valor2);
			break;
		case 4:
			System.out.println(valor1/valor2);
			break;
		default:
			System.out.println("erro");
			break;
		}
sc.close();
	}

}
