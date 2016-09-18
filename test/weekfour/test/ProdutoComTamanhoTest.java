package weekfour.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import weekfour.ProdutoComTamanho;

public class ProdutoComTamanhoTest {

	ProdutoComTamanho camisetaPoloPretaTamP;
	ProdutoComTamanho camisetaPoloAzulTamP;
	ProdutoComTamanho camisetaPoloPretaTamM;
	ProdutoComTamanho camisetaSimples;
	
	@Before
	public void before() {
		camisetaPoloPretaTamP = new ProdutoComTamanho("Camiseta Polo Preta P", 001, 39.00, "P");
		camisetaPoloAzulTamP = new ProdutoComTamanho("Camiseta Polo Azul P", 001, 39.00, "P");
		camisetaPoloPretaTamM = new ProdutoComTamanho("Camiseta Polo Preta M", 001, 39.00, "M");
		camisetaSimples = new ProdutoComTamanho("Camiseta Simples P", 002, 29.00, "P");
	}

	@Test
	public void testeMetodoEquals_CodigosTamanhosIguais() {
		assertEquals(true, camisetaPoloPretaTamP.equals(camisetaPoloAzulTamP));
	}
	
	@Test
	public void testeMetodoEquals_CodigosIguaisTamanhosDiferentes() {
		assertEquals(false, camisetaPoloPretaTamP.equals(camisetaPoloPretaTamM));
	}
	
	@Test
	public void testeMetodoEquals_CodigosTamanhosDiferentes() {
		assertEquals(false, camisetaPoloPretaTamM.equals(camisetaSimples));
	}
	
	@Test
	public void testeMetodoEquals_CodigosDiferentesTamanhosIgual() {
		assertEquals(false, camisetaPoloPretaTamP.equals(camisetaSimples));
	}
	
	@Test
	public void testeMetodoHashCode_CodigosDiferentes() {
		assertNotEquals(camisetaPoloPretaTamP.hashCode(), camisetaSimples.hashCode());
	}
	
	@Test
	public void testeMetodoHashCode_CodigosIguais() {
		assertEquals(camisetaPoloPretaTamP.hashCode(), camisetaPoloAzulTamP.hashCode());
	}

}
