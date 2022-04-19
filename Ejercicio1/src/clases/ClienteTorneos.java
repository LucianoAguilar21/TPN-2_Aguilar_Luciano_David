package clases;

public class ClienteTorneos {

	public static void main(String[] args) {
		TorneosAdmin tor = new TorneosAdmin();
		
		Ciudad ciudad = new Ciudad("Concordia");
		Equipo equipo1 = new Equipo("Boquita",ciudad);
		Torneo torneo1 = new Torneo("Liga",2020);
		Equipo equipo2 = new Equipo("Riven",ciudad);
		
		EquipoTorneo eq1 = new EquipoTorneo(equipo1,torneo1,20,15,5,0,18,7);
		EquipoTorneo eq2 = new EquipoTorneo(equipo2,torneo1,20,10,8,2,10,8);
		
		tor.agregar(eq2);
		tor.agregar(eq1);
		
		tor.ordenar();
		
		System.out.println(tor.toString());
		
	
	}

}
