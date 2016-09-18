package weekfive.test;

import static org.junit.Assert.*;

import org.junit.Test;

import weekfive.assignment.Autoridade;
import weekfive.assignment.ComTitulo;
import weekfive.assignment.Informal;
import weekfive.assignment.Respeitoso;
import weekfive.assignment.Genero;

public class TestAutoridade {
	
	@Test
	public void testComTitulo_AutoridadeComTitulo_Excelentissimo() {
		Autoridade autoridade = new Autoridade("João", "dos Santos", new ComTitulo("Excelentíssimo"));
		assertEquals("Excelentíssimo João dos Santos", autoridade.getTratamento());
	}
	
	@Test
	public void testComTitulo_AutoridadeComTitulo_Padre() {
		Autoridade autoridade = new Autoridade("Marcelo", "Rossi", new ComTitulo("Padre"));
		assertEquals("Padre Marcelo Rossi", autoridade.getTratamento());
	}
	
	@Test
	public void testInformal_AutoridadeInformal() {
		Autoridade autoridade = new Autoridade("João", "dos Santos", new Informal());
		assertEquals("João", autoridade.getTratamento());
	}
	
	@Test
	public void testRespeitoso_AutoridadeRespeitoso_Masculino() {
		Autoridade autoridade = new Autoridade("Aderlei", "Filho", new Respeitoso(Genero.MASCULINO));
		assertEquals("Sr. Filho", autoridade.getTratamento());
	}
	
	@Test
	public void testRespeitoso_AutoridadeRespeitoso_Feminino() {
		Autoridade autoridade = new Autoridade("Sara", "Coraini", new Respeitoso(Genero.FEMININO));
		assertEquals("Sra. Coraini", autoridade.getTratamento());
	}
	
	@Test
	public void testRespeitoso_AutoridadeRespeitoso_Invalido() {
		Autoridade autoridade = new Autoridade("Rafael", "Souza", new Respeitoso(null));
		assertEquals("Souza", autoridade.getTratamento());
	}

}
