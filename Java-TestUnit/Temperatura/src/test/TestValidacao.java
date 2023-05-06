package QA.DadosCadastrais;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestValidacao {

	@Test
	public void testValidarNome() {
		   // Teste com nome vazio
        assertThrows(RuntimeException.class, () -> Validacao.validarNome(""));
        
          // Teste com nome com número ou caracter especial
        assertThrows(RuntimeException.class, () -> Validacao.validarNome("123654"));
        
          // Teste com nome não vazio
        Validacao.validarNome("João");
    }
	
	@Test
	public void testValidarCpf() {
			// Teste com CPF válido
		Validacao.validarCpf("12345678911");
		
			//Teste com CPF inválido
		assertThrows(RuntimeException.class, ()-> Validacao.validarCpf("12345"));
	}
	
	@Test
	public void testValidarIdade() {
	    // Teste com idade dentro do intervalo válido
        Validacao.validarIdade(30);
        
        // Teste com idade negativa
        assertThrows(RuntimeException.class, () -> Validacao.validarIdade(-1));
        
        // Teste com idade acima do limite máximo
        assertThrows(RuntimeException.class, () -> Validacao.validarIdade(121));
    }
	
	@Test
	public void testFormatarCPF() {
	    // Teste com CPF sem formatação
        assertEquals("123.456.789-01", Validacao.formatarCPF("12345678901"));
        
        // Teste com CPF já formatado
        assertEquals("123.456.789-01", Validacao.formatarCPF("123.456.789-01"));
    }

	@Test 
	public void testsetNome() {
		
		Validacao nome = new Validacao ();
		nome.setNome("João");
		
		assertEquals ("João",nome.getNome());
		
	}
	
	@Test 
	public void testsetCpf() {
		
		Validacao cpf = new Validacao ();
		cpf.setCpf("12345678912");
		
		assertEquals ("123.456.789-12",cpf.getCpf());
		
	}
	
	@Test 
	public void testsetIdade() {
		
		Validacao idade = new Validacao ();
		idade.setIdade (12);
		
		assertEquals (12,idade.getIdade());
		
	}
	
    @Test
    public void testToString() {
        Validacao text = new Validacao("João da Silva", "12345678901", 30);
        String esperada = "Dados Cadastrais:  Nome:João da Silva\t CPF:123.456.789-01\t Idade:30";
        assertEquals(esperada, text.toString());
    }
}
