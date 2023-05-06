package QA.Produto;
import java.util.Scanner;

public class Produto {

	public static void main (String[]Args) {
		Scanner input = new Scanner (System.in);
		double valorProduto;
		
		System.out.println("Olá!! Seja bem vindo!");
		System.out.println("Digite o valor do produto: ");
		valorProduto = input.nextDouble();
		
		CalculoAcrescimo produto = new CalculoAcrescimo ();
		
		try {
			System.out.printf("O novo valor do produto é: R$%.2f ", produto.acrescimo(valorProduto));
			
		}
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
			System.exit (0);
		}
		
		input.close ();
	}
}
