package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;


import Business.Pessoa;
import Business.Simplificada;
import Business.Completa;

public class teste {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSimplificado() {
		Pessoa pessoa = new Pessoa("Vitor", "1234567890", 19, 0, 20000, 90000);
		double resultado = Simplificada.calcular(pessoa);
		assertEquals(23787.5, resultado, 0.1);
	}
	
	@Test
	public void testCompleta() {
		Pessoa pessoa = new Pessoa("Ana", "1234567890", 66, 3, 50000, 150000);
		double resultado = Completa.calcular(pessoa);
		assertEquals(41250.0, resultado, 0.1);
	}

}
