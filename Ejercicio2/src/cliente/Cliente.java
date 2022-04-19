package cliente;

public class Cliente implements Comparable<Cliente> {
	private String apellido, nombre, documento;
	private ClienteTipoEnum tipo;
	
	public Cliente(String apellido, String nombre, String documento, ClienteTipoEnum tipo) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.documento = documento;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Cliente [apellido=" + apellido + ", nombre=" + nombre + ", documento=" + documento + ", tipo=" + tipo
				+ "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public ClienteTipoEnum getTipo() {
		return tipo;
	}

	public void setTipo(ClienteTipoEnum tipo) {
		this.tipo = tipo;
	}

	@Override
	public int compareTo(Cliente o) {
		// TODO Auto-generated method stub
		return this.apellido.compareTo(o.getApellido());
	}
	
	
	
	
}
