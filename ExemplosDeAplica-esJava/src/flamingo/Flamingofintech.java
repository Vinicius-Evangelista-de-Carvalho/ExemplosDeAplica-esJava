//NÃO APAGA





package flamingo;
import java.util.Scanner;
public class Flamingofintech {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Flamingo Fintech");
	System.out.println();
	System.out.println();
	System.out.println("seja bem vindo Flamingo Fintech");
	System.out.println();
	System.out.println();
	System.out.println("Para acessar a  Flamingo Fintech, insira seu usuario");
	System.out.println();
	System.out.println();
	System.out.println("Digite o seu usuario ");
	String usuario=sc.next();
	System.out.println("Digite a sua senha");
	String senha=sc.next();
	
	if(usuario.equals("vinicius")&&(senha.equals("vinny321"))) {
		System.out.println("Sistema logado com Sucesso" );
		System.out.println("Seja bem vindo "+","+";" + usuario);
	}else {
		System.out.println();
	}
			sc.close();
}
}
