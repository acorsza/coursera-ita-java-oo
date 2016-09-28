/**
 * 
 */
package weeksix.assignment;

import java.util.Scanner;

import weeksix.assignment.mecanica.FabricaMecanicaDoJogo;
import weeksix.assignment.mecanica.MecanicaDoJogo;

/**
 * @author aderleifilho
 *
 */
public class Principal {

	private static MecanicaDoJogo mecanicaDoJogo;
	private static Scanner in = new Scanner(System.in);
	private static String nomeDoUsuario;

	public static void main(String[] args) {
		System.out.println("Bem-vindo ao Jogo das Palavras Embaralhadas");
		selecionarModo();
		cadastrarJogador();

		System.out.println("\nVocê pode errar até " + mecanicaDoJogo.tentativasDisponiveis() + " vezes.");

		System.out.println("Boa sorte " + nomeDoUsuario);
		jogar();
	}

	private static void jogar() {
		while (mecanicaDoJogo.tentativasDisponiveis() > 0) {
			String palavra = mecanicaDoJogo.adivinharPalavra();
			System.out.println("\n###########################################\n");
			System.out.println("A palavra para adivinhar é: ");
			System.out.println(palavra);
			System.out.println("Qual é a palavra acima?");
			String resultadoResposta = mecanicaDoJogo.validarResposta(in.nextLine());
			if (resultadoResposta.contains("Errada")) {
				System.out.println("Você possui " + mecanicaDoJogo.tentativasDisponiveis() + " tentativas");
				System.out.println(resultadoResposta);
			} else {
				System.out.println(resultadoResposta);
			}

		}
		System.out.println("\n###########################################\n");
		System.out.println("Fim de Jogo");
		System.out.println("\n###########################################\n");
		System.out.println("Resultado\n");
		System.out.println("Nome do jogador: " + nomeDoUsuario);
		System.out.println("Pontuacao: " + mecanicaDoJogo.terminarJogo() + " pontos");
		System.out.println("\n###########################################\n");

	}

	private static void cadastrarJogador() {
		System.out.println("Qual seu nome?");
		nomeDoUsuario = in.nextLine();
		mecanicaDoJogo.novoJogo(nomeDoUsuario);
	}

	private static void selecionarModo() {
		System.out.println("Digite a opção de jogo desejada:");
		System.out.println("1) Modo Facil");
		System.out.println("2) Modo Moderado");
		System.out.println("3) Modo Dificil");

		loop: while (true) {
			switch (in.nextLine()) {
			case "1":
				System.out.println("Modo Facil selecionado");
				mecanicaDoJogo = FabricaMecanicaDoJogo.getMecanicaFacil();
				break loop;
			case "2":
				System.out.println("Modo Moderado selecionado");
				mecanicaDoJogo = FabricaMecanicaDoJogo.getMecanicaModerada();
				break loop;
			case "3":
				System.out.println("Modo Dificil selecionado");
				mecanicaDoJogo = FabricaMecanicaDoJogo.getMecanicaDificil();
				break loop;
			default:
				System.out.println("Modo Invalido");
				break;
			}

		}
	}
}
