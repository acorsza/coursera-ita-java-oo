package weeksix.test;

import static org.junit.Assert.*;

import org.junit.Test;

import weeksix.assignment.embaralhador.Embaralhador;
import weeksix.assignment.embaralhador.Inverter;
import weeksix.assignment.embaralhador.Randomico;

public class EmbaralhadorTest {

	@Test
	public void testeInverter() {
		Embaralhador inverter = new Inverter();
		String palavra = inverter.obterPalavraEmbaralhada("Cachorro");
		assertEquals(palavra, "orrohcaC");
	}
	
	@Test
	public void testeRandomico() {
		Embaralhador randomico = new Randomico();
		String palavra = randomico.obterPalavraEmbaralhada("Cachorro");
		assertNotEquals(palavra, "Cachorro");
		assertNotEquals(palavra, "orrohcaC");
	}

}
