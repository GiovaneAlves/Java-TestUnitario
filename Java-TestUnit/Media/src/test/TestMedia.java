package QA.Media;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMedia {

	@Test
	public void testCalculoMediaInteiro() {
		CalculoMedia media = new CalculoMedia ();
		
		double resultado = media.media(30 , 20);
		double resulTest = 25;
		
		assertEquals (resulTest, resultado,0);
		
	}
	
	@Test
	public void testCalculoMediaDecimal() {
		CalculoMedia media = new CalculoMedia ();
		
		double resultado = media.media(30.25 , 20.25);
		double resulTest = 25.25;
		
		assertEquals (resulTest, resultado,0.01);
		
	}
	
	@Test
	public void testCalculoMediaNegativo() {
		CalculoMedia media = new CalculoMedia ();
		
		double resultado = media.media(-10 , -20);
		double resulTest = -15;
		
		assertEquals (resulTest, resultado,0);
		
	}
	
	@Test
	public void testResultado() {
		CalculoMedia media = new CalculoMedia ();
		
		media.setResul(25);
		double resulTest = 25;
		
		assertEquals (resulTest, media.getResul(),0);
		
	}
	
	@Test
	public void testNumeroUm() {
		CalculoMedia media = new CalculoMedia ();
		
		media.setNum1(-17);
		double resulTest = -17;
		
		assertEquals (resulTest, media.getNum1(),0);
		
	}
	
	@Test
	public void testNumeroDois() {
		CalculoMedia media = new CalculoMedia ();
		
		media.setNum2(.017);
		double resulTest = 0.017;
		
		assertEquals (resulTest, media.getNum2(),0.01);
		
	}
	
    @Test
    public void testConstrutor() {
        double num1 = 4.0;
        double num2 = 6.0;
        double resultadoEsperado = 5.0;
        CalculoMedia calculoMedia = new CalculoMedia(num1, num2);
        assertEquals(num1, calculoMedia.getNum1(), 0.001);
        assertEquals(num2, calculoMedia.getNum2(), 0.001);
        assertEquals(resultadoEsperado, calculoMedia.getResul(), 0.001);
    }
}
