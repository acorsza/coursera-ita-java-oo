package weeksix.assignment.mecanica;

public interface MecanicaDoJogo {
		
	public void novoJogo(String nome);
	public int terminarJogo();
	public String adivinharPalavra();
	public String validarResposta(String palavra);
	public int tentativasDisponiveis();
}
