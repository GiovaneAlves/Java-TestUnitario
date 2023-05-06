package QA.Media;
import java.util.Scanner;

public class MediaAritmetica {
	
	public static void main (String[]Args) {
		Scanner input = new Scanner (System.in);
		double primeiroNumero, segundoNumero;
		
		System.out.println("=====Média Aritmética=====");
		System.out.println("Digite o primeiro número: ");
		primeiroNumero = input.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		segundoNumero = input.nextDouble();
		
		CalculoMedia media = new CalculoMedia (primeiroNumero, segundoNumero);
		System.out.printf("A média aritmética de %.2f e %.2f é igual:\t %.2f",media.getNum1(), media.getNum2(), media.getResul());
		
		input.close ();
	}
}
