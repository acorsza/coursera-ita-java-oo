package weekfive.assignment;

public class Respeitoso implements FormatadorNome {

	private String tratamento;

	/*
	 * Eu optei por utilizar um ENUM para receber o sexo e verificar qual
	 * tratamento deverá ser usado. Foi uma opção minha já que a instrução 
	 * não exige que o construtor deve receber uma String.
	 * 
	 * Respeitoso: deve receber em seu construtor a informação se é masculino ou
	 * feminino, e retornar "Sr." ou "Sra." seguido do sobrenome
	 */
	public Respeitoso(Genero sexo) {
		if (sexo != null) {
			if (sexo.equals(Genero.MASCULINO)) {
				this.tratamento = "Sr.";
			} else if (sexo.equals(Genero.FEMININO)) {
				this.tratamento = "Sra.";
			}
		}
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {

		/*
		 * Embora o exercício não fale da exceção de sexo inválido ou nulo, caso
		 * seja passado um sexo nulo, o tratamento será omitido e apenas o
		 * sobrenome será retornado.
		 */
		if (this.tratamento != null) {
			return String.join(" ", tratamento, sobrenome);
		}
		return sobrenome;
	}

}
