package clases;


import java.util.List;

public class TorneosAdmin extends TorneoAdminAbstract{

	public TorneosAdmin() {
		super();
	}
	
	@Override
	public void agregar(EquipoTorneo equipoTorneo) {
		super.equipoTorneoList.add(equipoTorneo);
	}

	@Override
	public void ordenar() {
		equipoTorneoList.sort(null);
		
	}

	@Override
	public List<EquipoTorneo> tablaPosiciones(Torneo torneo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Torneo> todosLosTorneos(Equipo equipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EquipoTorneo masGoleador() {
		int goles = 0;
		int indice= 0;
		goles = equipoTorneoList.get(0).getGolesAFavor();
		for (int i = 0; i < equipoTorneoList.size(); i++) {
			if (goles < equipoTorneoList.get(i).getGolesAFavor()) {
				indice = i;
			}
			
		}
		return equipoTorneoList.get(indice);
	}

	@Override
	public EquipoTorneo vallaMenosVencida() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		String datos = null;
		
		for (int i = 0; i < equipoTorneoList.size(); i++) {
			datos += equipoTorneoList.get(i).getTorneo().toString() + " ";
		}
		
		return datos;
	}
	
	

}
