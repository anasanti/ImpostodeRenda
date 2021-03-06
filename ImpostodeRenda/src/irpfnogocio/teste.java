package irpfnogocio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class teste {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSimplificado() throws Exception{
		Pessoa pessoa = new Pessoa("Vitor", "1234567890", 19, 0, 20000, 90000);
		double resultado = Simplificada.calcular(pessoa);
		assertEquals(23787.5, resultado, 0.1);
	}

	@Test
	public void testSimplificado1() throws Exception{
		Pessoa pessoa = new Pessoa("Pedro", "1234567890", 19, 0, 40000, 90000);
		double resultado = Simplificada.calcular(pessoa);
		assertEquals(23787.5, resultado, 0.1);
	}

	@Test
	public void testCompleta() throws Exception {
		Pessoa pessoa = new Pessoa("Ana", "1234567890", 66, 3, 50000, 150000);
		double resultado = Completa.calcular(pessoa);
		assertEquals(41250.0, resultado, 0.1);
	}

	@Test
	public void testCompleta1() throws Exception{
		Pessoa pessoa = new Pessoa("Tha�s", "1234567890", 66, 3, 20000, 150000);
		double resultado = Completa.calcular(pessoa);
		assertEquals(41250.0, resultado, 0.1);
	}
}
