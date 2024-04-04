package exemplo;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		int numero;
		int calculo;
		String resposta="sim";
		Scanner sc=new Scanner(System.in);
		while(resposta.equals("sim")) {
			System.out.println("Digite um valor");
			 numero=sc.nextInt();
			calculo=numero*3;
			System.out.println("O valor da multipçicação é : "+calculo);
			System.out.println("deseja efetuar outro calculo ?");
			resposta =sc.next();
		}
		sc.close();
	}
	}