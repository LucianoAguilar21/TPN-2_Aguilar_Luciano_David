package clases;



public class EquipoTorneo implements Comparable<EquipoTorneo> {
	private Equipo equipo;
	private Torneo torneo;
	private int partidosJugados;
	private int partidosGanados;
	private int partidosEmpatados;
	private int partidosPerdidos;
	private int golesAFavor;
	private int golesEnContra;

	public EquipoTorneo(Equipo equipo, Torneo torneo, int partidosJugados, int partidosGanados, int partidosEmpatados,
			int partidosPerdidos, int golesAFavor, int golesEnContras) {
		this.equipo = equipo;
		this.torneo = torneo;
		this.partidosJugados = partidosJugados;
		this.partidosGanados = partidosGanados;
		this.partidosEmpatados = partidosEmpatados;
		this.partidosPerdidos = partidosPerdidos;
		this.golesAFavor = golesAFavor;
		this.golesEnContra = golesEnContras;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		EquipoTorneo other = (EquipoTorneo) obj;
//		if (equipo == null) {
//			if (other.equipo != null)
//				return false;
//		} else if (!equipo.getNombre().equals(other.equipo.getNombre()))
//			return false;
//		if (torneo == null) {
//			if (other.torneo != null)
//				return false;
//		} else if (!torneo.getAnio().equals(other.torneo.getAnio()))
//			return false;
//				else if (!torneo.getNombre().equals(other.torneo.getNombre()))
//					return false;
//		return true;
//	}

	@Override
	public String toString() {
		return "EquipoTorneo equipo:" + equipo + ", torneo: " + torneo + ", partidos jugados:" + partidosJugados
				+ ", partidos ganados: " + partidosGanados + ", partidos empatados: " + partidosEmpatados
				+ ", partidos perdidos: " + partidosPerdidos + ", goles a favor: " + golesAFavor + ", goles en contra: "
				+ golesEnContra;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EquipoTorneo other = (EquipoTorneo) obj;
		if (equipo == null) {
			if (other.equipo != null)
				return false;
		} else if (!equipo.equals(other.equipo))
			return false;
		if (golesAFavor != other.golesAFavor)
			return false;
		if (golesEnContra != other.golesEnContra)
			return false;
		if (partidosEmpatados != other.partidosEmpatados)
			return false;
		if (partidosGanados != other.partidosGanados)
			return false;
		if (partidosJugados != other.partidosJugados)
			return false;
		if (partidosPerdidos != other.partidosPerdidos)
			return false;
		if (torneo == null) {
			if (other.torneo != null)
				return false;
		} else if (!torneo.equals(other.torneo))
			return false;
		return true;
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public Torneo getTorneo() {
		return this.torneo;
	}

	public int getPartidosJugados() {
		return partidosJugados;
	}

	public int getPartidosGanados() {
		return partidosGanados;
	}

	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}

	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}

	public int getGolesAFavor() {
		return golesAFavor;
	}

	public int getGolesEnContra() {
		return golesEnContra;
	}

	public int getPuntos() { // Puntos totales
		int puntos = 0;
		puntos = (getPartidosGanados() * 3) + (getPartidosEmpatados() * 1) + (getPartidosPerdidos() * 0);
		return puntos;
	}

	public int getDiferenciaGol() { // Diferencia de goles
		int diferencia = 0;
		diferencia = getGolesAFavor() - getGolesEnContra();
		return diferencia;
	}

	@Override
	public int compareTo(EquipoTorneo o) {
		if(this.getEquipo().getNombre().compareToIgnoreCase(o.getEquipo().getNombre()) == 0) {
			if(this.getTorneo().getAnio().compareTo(o.getTorneo().getAnio()) == 0) {
				return this.getTorneo().getNombre().compareToIgnoreCase(o.getTorneo().getNombre());
			}
			else {
				return this.getEquipo().getNombre().compareToIgnoreCase(o.getEquipo().getNombre());
			}
		}else if(this.getTorneo().getAnio().compareTo(o.getTorneo().getAnio()) == 0){
			return this.getTorneo().getNombre().compareToIgnoreCase(o.getTorneo().getNombre());
		}else {
			return this.getTorneo().getAnio().compareTo(o.getTorneo().getAnio());
		}

	
	}
}
