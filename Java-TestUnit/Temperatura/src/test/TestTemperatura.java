package QA.Temperatura;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTemperatura {

	@Test
	public void testCalculoConversao() {
		CalculoConversao conversor = new CalculoConversao(12);
		double tempCelsiusEsperado = -11.111;
		
		assertEquals(tempCelsiusEsperado ,conversor.getTempCelsius(), 0.001);
		
	}

	@Test
	public void testConversao() {
	    double tempFahre = 68.0;
	    double tempCelsiusEsperado = 20.0;
	    
	    CalculoConversao conversor = new CalculoConversao();
	    double tempCelsiusCalculado = conversor.conversao(tempFahre);
	    
	    assertEquals(tempCelsiusEsperado, tempCelsiusCalculado, 0.001);
	}

	@Test
	public void testTempCelsius() {
		CalculoConversao conversor = new CalculoConversao();
		
		conversor.setTempCelsius(39.12);
		double resul = 39.12;
		
		assertEquals(resul, conversor.getTempCelsius(), 0.001);
	}

	@Test
	public void testTempFahre() {
		CalculoConversao conversor = new CalculoConversao();
		
		conversor.setTempFahre(-64.02);
		double resul = -64.02;
		
		assertEquals(resul, conversor.getTempFahre(), 0.001);
	}

}
