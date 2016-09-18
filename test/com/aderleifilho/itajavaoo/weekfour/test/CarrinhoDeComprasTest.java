package com.aderleifilho.itajavaoo.weekfour.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.aderleifilho.itajavaoo.weekfour.ProdutoComTamanho;
import com.aderleifilho.itajavaoo.weekfour.CarrinhoDeCompras;

public class CarrinhoDeComprasTest {

	CarrinhoDeCompras carrinhoDeCompras;
	ProdutoComTamanho camisetaPoloPretaTamP;
	ProdutoComTamanho camisetaPoloPretaTamM;

	
	@Before
	public void before() {
		camisetaPoloPretaTamP = new ProdutoComTamanho("Camiseta Polo Preta P", 001, 20.00, "P");
		camisetaPoloPretaTamM = new ProdutoComTamanho("Camiseta Polo Preta P", 001, 20.00, "M");
		carrinhoDeCompras = new CarrinhoDeCompras();
	}

	@Test
	public void testeAdicionaProduto_AdicionaUmProduto() {
		carrinhoDeCompras.adicionaProduto(camisetaPoloPretaTamP, 5);
		assertEquals(100.00, carrinhoDeCompras.calculaValorTotal(),0);
	}
	
	@Test
	public void testeAdicionaProduto_AdicionaDoisProdutosIguais() {
		carrinhoDeCompras.adicionaProduto(camisetaPoloPretaTamP, 5);
		carrinhoDeCompras.adicionaProduto(camisetaPoloPretaTamP, 2);
		assertEquals(140.00, carrinhoDeCompras.calculaValorTotal(),0);
	}
	
	@Test
	public void testeAdicionaProduto_AdicionaDoisProdutosIguaisComTamanhosDiferentes() {
		carrinhoDeCompras.adicionaProduto(camisetaPoloPretaTamP, 5);
		carrinhoDeCompras.adicionaProduto(camisetaPoloPretaTamM, 2);
		assertEquals(5, carrinhoDeCompras.getProdutos().get(camisetaPoloPretaTamP),0);
		assertEquals(2, carrinhoDeCompras.getProdutos().get(camisetaPoloPretaTamM),0);
	}
	
	@Test
	public void testeRemoveProduto() {
		carrinhoDeCompras.adicionaProduto(camisetaPoloPretaTamP, 5);
		carrinhoDeCompras.removeProduto(camisetaPoloPretaTamP, 2);
		assertEquals(60.00, carrinhoDeCompras.calculaValorTotal(),0);
	}

}
