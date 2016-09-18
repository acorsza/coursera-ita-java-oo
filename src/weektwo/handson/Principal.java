package weektwo.handson;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static double calcularSalario (Funcionario f){
	 double semImposto = f.salarioBruto()*(1-f.aliquotaImposto());
	 return semImposto + f.bonus();
	}

}
