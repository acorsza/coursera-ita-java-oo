package com.aderleifilho.itajavaoo.weekfour;

import java.util.HashMap;
import java.util.Map.Entry;

public class CarrinhoDeCompras {
	
	private HashMap<Produto, Integer> produtos = new HashMap<>();
	
	public void adicionaProduto(Produto produto, Integer quantidade) {
		
		if(produtos.containsKey(produto)) {
			produtos.put(produto, produtos.get(produto)+quantidade);
		} else {
			produtos.put(produto, quantidade);
		}
	}
	
	public void removeProduto(Produto produto, Integer quantidade) {
		if(produtos.containsKey(produto)) {
			produtos.put(produto, produtos.get(produto)-quantidade);
		}
	}
	
	public double calculaValorTotal() {
		
		double valorTotal = 0;
		
		for(Entry<Produto, Integer> entry : produtos.entrySet()) {
		    Produto produto = entry.getKey();
		    Integer quantidade = entry.getValue();
		    valorTotal += produto.getPreco() * quantidade;
		}
		
		return valorTotal;
	}
	
	/*
	 * Getters and Setters
	 */
	
	public HashMap<Produto, Integer> getProdutos() {
		return produtos;
	}

	public void setProdutos(HashMap<Produto, Integer> produtos) {
		this.produtos = produtos;
	}

}
