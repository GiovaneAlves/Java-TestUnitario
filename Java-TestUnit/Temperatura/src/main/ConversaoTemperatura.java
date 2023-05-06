package QA.Temperatura;
import java.util.Scanner;
public class ConversaoTemperatura {

	public static void main (String[]Args) {
		Scanner input = new Scanner (System.in);
		double tempFahrenheit ;
		
		System.out.println("=====Conversão de Temperatura=====");
		System.out.println("Olá!! Digite a temperatura desejada:");
		tempFahrenheit = input.nextDouble ();
		
		CalculoConversao novaTemp = new CalculoConversao ();
		
		System.out.printf("\nA nova temperatura é:\t %.3f ºC" ,novaTemp.conversao(tempFahrenheit));
		
		input.close();
	}
}
