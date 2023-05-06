package QA.Produto;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestProduto {


	@Test
	public void testAcrescimo() {
		CalculoAcrescimo acrescimo = new CalculoAcrescimo ();
		
		double novoValor = acrescimo.acrescimo(20);
		double testValor = 22;
		
		assertEquals(testValor, novoValor,0.001);
	}

	@Test
	public void testAcrescimoInvalido() {
		CalculoAcrescimo acrescimo = new CalculoAcrescimo ();
		
		assertThrows(RuntimeException.class, ()-> acrescimo.acrescimo(-12));
	}


	@Test
	public void testValorProduto() {
		CalculoAcrescimo produto = new CalculoAcrescimo ();
		
		produto.setValorProduto(25);
		double resulTest = 25;
		
		assertEquals (resulTest, produto.getValorProduto(),0);
	}

	@Test
	public void testProdutoAcrescido() {
		CalculoAcrescimo novoValor = new CalculoAcrescimo ();
		
		novoValor.setProdutoAcrescido(100);
		double resulTest = 100;
		
		assertEquals (resulTest, novoValor.getProdutoAcrescido(),0);
	}

	@Test
	public void testPorcentagem() {
		CalculoAcrescimo porcentagem = new CalculoAcrescimo ();
		
		porcentagem.setPorcentagem(.25);
		double resulTest = .25;
		
		assertEquals (resulTest, porcentagem.getPorcentagem(),0);
	}



}
