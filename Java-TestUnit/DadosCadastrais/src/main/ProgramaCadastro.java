package QA.DadosCadastrais;
import java.util.Scanner;


public class ProgramaCadastro {
	
	public static void main (String[]Args) {
		Scanner input = new Scanner (System.in);
		String cpf="", nome = "";
		int idade =0;
		
		
		try {
			System.out.println("Olá!! Digite seu nome:");
			nome = input.nextLine();
			nome = nome.trim().toUpperCase();
			Validacao.validarNome(nome);
			System.out.println("Olá, " + nome + "!");
		}
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
			System.exit (0);
		}
		
		try {
			System.out.println("Agora digite seu CPF:");
			cpf = input.nextLine();
			Validacao.validarCpf(cpf);
			System.out.println("Seja bem-vindo(a) "+nome+"!");
		}
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		
		}
		
		try {
			System.out.println("Agora digite sua idade:");
			idade = input.nextInt();
			Validacao.validarIdade(idade);
		}
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		Validacao valido = new Validacao (nome,cpf,idade);
		System.out.println(valido.toString());
		
		input.close ();
		
}
}	
	
	
