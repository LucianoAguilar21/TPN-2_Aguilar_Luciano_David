package clases;

public class Torneo implements Comparable<Torneo> {
	private String nombre;
	private int anio;
	public Torneo(String nombre, int anio) {
		this.nombre = nombre;
		this.anio = anio;
	}
	public String getNombre() {
		return nombre;
	}
	public Integer getAnio() {
		return anio;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Torneo other = (Torneo) obj;
		if (anio != other.anio)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Torneo [nombre=" + nombre + ", anio=" + anio + "]";
	}
	@Override
	public int compareTo(Torneo o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
