package QA.Temperatura;

public class CalculoConversao {
	private double tempCelsius;
	private double tempFahre;
	
	public CalculoConversao () {}
	
	public CalculoConversao (double tempFahre) {
		this.tempFahre = tempFahre;
		this.tempCelsius = (this.tempFahre - 32) / 1.8;
		
	}
	public double conversao (double temp) {
		this.tempFahre = temp;
		this.tempCelsius = (this.tempFahre - 32) / 1.8;
		return this.tempCelsius;
	}

	public double getTempCelsius() {
		return tempCelsius;
	}

	public void setTempCelsius(double tempCelsius) {
		this.tempCelsius = tempCelsius;
	}

	public double getTempFahre() {
		return tempFahre;
	}

	public void setTempFahre(double tempFahre) {
		this.tempFahre = tempFahre;
	}
	
}
