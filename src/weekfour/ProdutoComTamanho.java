package weekfour;

public class ProdutoComTamanho extends Produto {

	private String tamanho;

	public ProdutoComTamanho(String nome, int codigo, double preco, String tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}

	@Override
	public boolean equals(Object obj) {
		return ((obj instanceof ProdutoComTamanho) && ((Produto) obj).hashCode() == this.hashCode()
				&& ((ProdutoComTamanho) obj).getTamanho() == this.tamanho);
	};

	@Override
	public int hashCode() {
		return getCodigo();
	}
	
	/*
	 * Getters and Setters
	 */

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

}
