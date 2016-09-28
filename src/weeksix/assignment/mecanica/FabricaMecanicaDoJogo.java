package weeksix.assignment.mecanica;

public class FabricaMecanicaDoJogo {
	
	public static MecanicaDoJogo getMecanicaFacil() {
		MecanicaDoJogo modoFacil = new ModoFacil();
		return modoFacil;
	}
	
	public static MecanicaDoJogo getMecanicaModerada() {
		MecanicaDoJogo modoModerado = new ModoModerado();
		return modoModerado;
	}
	
	public static MecanicaDoJogo getMecanicaDificil() {
		MecanicaDoJogo modoDificil = new ModoDificil();
		return modoDificil;
	}

}
