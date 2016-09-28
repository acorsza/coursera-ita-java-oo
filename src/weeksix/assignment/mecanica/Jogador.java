package weeksix.assignment.mecanica;

public class Jogador {
	
	private String nome;
	private int pontos;
	private int tentativas;

	public Jogador(String nome) {
		this.nome = nome;
	}
	
	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	public int getTentativas() {
		return tentativas;
	}

	public void setTentativas(int tentativas) {
		this.tentativas = tentativas;
	}
}
