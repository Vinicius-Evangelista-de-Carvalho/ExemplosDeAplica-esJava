package exercicios;

public class Exercicio02 {
	public class Main {
static void checkAge(int age) {
	
	if (age <18) {
		System.out.println("Acesso negado - Você não tem idade suficiente!");
	} else {
		System.out.println("Acesso concedido - Você tem idade suficiente!");
	}	
}

public static void main(String[] args) {
    checkAge(20); // Call the checkAge method and pass along an age of 20
  }
}
	
	}
	