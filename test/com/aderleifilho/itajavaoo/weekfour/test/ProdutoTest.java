package com.aderleifilho.itajavaoo.weekfour.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import com.aderleifilho.itajavaoo.weekfour.Produto;

public class ProdutoTest {
	
	Produto tecladoSemFio;
	Produto tecladoComFio;
	Produto mouseSemFio;
	Produto mouseComFio;
	
	@Before
	public void before() {
		tecladoSemFio = new Produto("Teclado sem fio Apple", 001, 99.00);
		tecladoComFio = new Produto("Teclado com fio Apple", 001, 59.00);
		mouseSemFio = new Produto("Mouse sem fio Apple", 002, 39.00);
		mouseComFio = new Produto("Mouse com fio Apple", 002, 19.00);
	}

	@Test
	public void testeMetodoEquals_CodigosIguais() {
		assertEquals(true, tecladoSemFio.equals(tecladoComFio));
		assertEquals(true, mouseSemFio.equals(mouseComFio));
	}
	
	@Test
	public void testeMetodoEquals_CodigosDiferentes() {
		assertEquals(false, mouseSemFio.equals(tecladoSemFio));
		assertEquals(false, mouseComFio.equals(tecladoComFio));
	}
	
	@Test
	public void testeMetodoHashCode_CodigosIguais() {
		assertEquals(tecladoSemFio.hashCode(), tecladoComFio.hashCode());
		assertEquals(mouseSemFio.hashCode(), mouseComFio.hashCode());
	}
	
	@Test
	public void testeMetodoHashCode_CodigosDiferentes() {
		assertNotEquals(mouseComFio.hashCode(), tecladoComFio.hashCode());
		assertNotEquals(mouseSemFio.hashCode(), tecladoSemFio.hashCode());
	}
}
