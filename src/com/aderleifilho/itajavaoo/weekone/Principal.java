/**
 * Coursera ITA Orientação a Objetos com Java
 * Semana 1
 * Practice Peer Graded Assignment: Classe para Cálculo do IMC
 * 
 */
package com.aderleifilho.itajavaoo.weekone;

/**
 * @author aderleifilho
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Criação de três instâncias da classe Paciente
		 */
		Paciente aderlei = new Paciente(76.4, 1.75);
		Paciente sara = new Paciente(53.3, 1.70);
		Paciente paulo = new Paciente(78.2, 1.72);

		/*
		 * Impressão do resultado dos métodos calcularIMC e diagnostico
		 * formatados em uma frase
		 */
		System.out.println("O paciente Aderlei está com o IMC em: " + aderlei.calcularIMC() + " e seu diagnóstico é: "
				+ aderlei.diagnostico());
		System.out.println("A paciente Sara está com o IMC em: " + sara.calcularIMC() + " e seu diagnóstico é: "
				+ sara.diagnostico());
		System.out.println("O paciente Paulo está com o IMC em: " + paulo.calcularIMC() + " e seu diagnóstico é: "
				+ paulo.diagnostico());

	}

}
