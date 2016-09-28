package weeksix.assignment.mecanica;

import weeksix.assignment.BancoDePalavras;
import weeksix.assignment.embaralhador.Embaralhador;
import weeksix.assignment.embaralhador.FabricaEmbaralhadores;

public class ModoModerado implements MecanicaDoJogo {

	private Jogador jogador;
	private Embaralhador embaralhador = FabricaEmbaralhadores.getRandomico();
	private int pontos;
	private static final int TENTATIVAS_PERMITIDAS = 3;
	private static final int MULTIPLICADOR_PONTOS = 2;

	@Override
	public void novoJogo(String nome) {
		jogador = new Jogador(nome);
		jogador.setTentativas(TENTATIVAS_PERMITIDAS);
	}

	@Override
	public String adivinharPalavra() {
		return embaralhador.obterPalavraEmbaralhada(BancoDePalavras.obterPalavra());
	}

	@Override
	public String validarResposta(String palavra) {
		if (embaralhador.verificarPalavraEmbaralhada(palavra)) {
			pontos += 1 * MULTIPLICADOR_PONTOS;
			return "Resposta Correta";
		}
		jogador.setTentativas(jogador.getTentativas() - 1);
		return "Resposta Errada";
	}

	@Override
	public int terminarJogo() {
		jogador.setPontos(pontos);
		return jogador.getPontos();
	}

	@Override
	public int tentativasDisponiveis() {
		return jogador.getTentativas();
	}

}
