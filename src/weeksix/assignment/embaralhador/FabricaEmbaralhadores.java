package weeksix.assignment.embaralhador;

public class FabricaEmbaralhadores {
	
	public static Embaralhador getRandomico() {
		Embaralhador randomico = new Randomico();
		return randomico;
	}
	
	public static Embaralhador getInverter() {
		Embaralhador inverter = new Inverter();
		return inverter;
	}
}
