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
public class Paciente {

	/*
	 * Variáveis utilizadas para calcular o IMC Observação: Embora não esteja
	 * especificado na requisição do exercício, optei por considerar que nenhuma
	 * das variáveis abaixo pode ser menos que 0, já que altura e peso não podem
	 * ser negativos
	 */
	private double peso;
	private double altura;

	/**
	 * Construtor que recebe o peso e a altura do paciente
	 * 
	 * @param peso
	 * @param altura
	 */
	public Paciente(double peso, double altura) {
		setPeso(peso);
		setAltura(altura);
	}

	/*
	 * Como os atributos são privados, a modificação dos valores das variáveis
	 * de instância deve ser feita através dos acessores
	 */

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso > 0) {
			this.peso = peso;
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		}
	}

	/**
	 * Método que utiliza o peso e a altura da classe (Paciente) para calcular e
	 * retornar o IMC do Paciente
	 */
	public double calcularIMC() {
		
		double resultado = (this.peso / (Math.pow(this.altura, 2)));
		
		return resultado;
	}

	/**
	 * Método que calcula o IMC e retornar a faixa de risco que o Paciente está
	 * no formato String
	 */
	public String diagnostico() {

		double imc = calcularIMC();

		String resultado = null;

		if (imc > 0 && imc < 16) {
			resultado = "Baixo peso muito grave";
		} else if (imc >= 16 && imc < 17) {
			resultado = "Baixo peso grave";
		} else if (imc >= 17 && imc < 18.5) {
			resultado = "Baixo peso";
		} else if (imc >= 18.5 && imc < 25) {
			resultado = "Peso normal";
		} else if (imc >= 25 && imc < 30) {
			resultado = "Sobrepeso";
		} else if (imc >= 30 && imc < 35) {
			resultado = "Obesidade grau I";
		} else if (imc >= 35 && imc < 40) {
			resultado = "Obesidade grau II";
		} else if (imc >= 40) {
			resultado = "Obesidade grau III (obesidade mórbida)";
		} else {
			/*
			 * Como o exercício não especifíca quais seriam as exceções, por
			 * exemplo, altura ou peso negativos ou valores absurdos de IMC,
			 * considerei que peso e altura não podem ser negativos, portanto,
			 * no caso de um desses valores serem inseridos de forma incorreta,
			 * este será o resultado.
			 */
			resultado = "Peso ou Altura inválidos, por favor, verifique os valores inseridos.";
		}
		return resultado;
	}
}
