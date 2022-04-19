package clases;

public class Equipo implements Comparable<Equipo> {
	private String nombre;
	private Ciudad ciudad;
	
	public Equipo(String nombre, Ciudad ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
	}
	@Override
	public String toString() {
		return "Equipo: " + nombre + ", ciudad: " + ciudad;
	}

	public String getNombre() {
		return this.nombre;
	}

	@Override
	public boolean equals(Object obj) {
		
		Equipo  equipo = (Equipo)  obj;
		
		if(equipo.getNombre().equals(nombre)) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public int compareTo(Equipo o) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(o.getNombre());
	}

	
}
