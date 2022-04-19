package clases;

public class Ciudad {
	private String nombre;

	public Ciudad(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCiudad() {
		return this.nombre;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciudad other = (Ciudad) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + "]";
	}
	
	
	
	
}
