package credito;

import cliente.ClienteTipoEnum;

public class CreditoTipo {
	private String descripcion;
	private Double montoMaximo, montoMinimo, tasaDeInteres;
	private int aniosMinimo, aniosMaximo;
	private ClienteTipoEnum clienteTipo;
	
	public CreditoTipo(String descripcion, Double montoMaximo, Double montoMinimo, Double tasaDeInteres,
			int aniosMinimo, int aniosMaximo, ClienteTipoEnum clienteTipo) {
		super();
		this.descripcion = descripcion;
		this.montoMaximo = montoMaximo;
		this.montoMinimo = montoMinimo;
		this.tasaDeInteres = tasaDeInteres;
		this.aniosMinimo = aniosMinimo;
		this.aniosMaximo = aniosMaximo;
		this.clienteTipo = clienteTipo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aniosMaximo;
		result = prime * result + aniosMinimo;
		result = prime * result + ((clienteTipo == null) ? 0 : clienteTipo.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((montoMaximo == null) ? 0 : montoMaximo.hashCode());
		result = prime * result + ((montoMinimo == null) ? 0 : montoMinimo.hashCode());
		result = prime * result + ((tasaDeInteres == null) ? 0 : tasaDeInteres.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditoTipo other = (CreditoTipo) obj;
		if (aniosMaximo != other.aniosMaximo)
			return false;
		if (aniosMinimo != other.aniosMinimo)
			return false;
		if (clienteTipo != other.clienteTipo)
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (montoMaximo == null) {
			if (other.montoMaximo != null)
				return false;
		} else if (!montoMaximo.equals(other.montoMaximo))
			return false;
		if (montoMinimo == null) {
			if (other.montoMinimo != null)
				return false;
		} else if (!montoMinimo.equals(other.montoMinimo))
			return false;
		if (tasaDeInteres == null) {
			if (other.tasaDeInteres != null)
				return false;
		} else if (!tasaDeInteres.equals(other.tasaDeInteres))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CreditoTipo [descripcion=" + descripcion + ", montoMaximo=" + montoMaximo + ", montoMinimo="
				+ montoMinimo + ", tasaDeInteres=" + tasaDeInteres + ", aniosMinimo=" + aniosMinimo + ", aniosMaximo="
				+ aniosMaximo + ", clienteTipo=" + clienteTipo + "]";
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getMontoMaximo() {
		return montoMaximo;
	}
	public void setMontoMaximo(Double montoMaximo) {
		this.montoMaximo = montoMaximo;
	}
	public Double getMontoMinimo() {
		return montoMinimo;
	}
	public void setMontoMinimo(Double montoMinimo) {
		this.montoMinimo = montoMinimo;
	}
	public Double getTasaDeInteres() {
		return tasaDeInteres;
	}
	public void setTasaDeInteres(Double tasaDeInteres) {
		this.tasaDeInteres = tasaDeInteres;
	}
	public int getAniosMinimo() {
		return aniosMinimo;
	}
	public void setAniosMinimo(int aniosMinimo) {
		this.aniosMinimo = aniosMinimo;
	}
	public int getAniosMaximo() {
		return aniosMaximo;
	}
	public void setAniosMaximo(int aniosMaximo) {
		this.aniosMaximo = aniosMaximo;
	}
	public ClienteTipoEnum getClienteTipo() {
		return clienteTipo;
	}
	public void setClienteTipo(ClienteTipoEnum clienteTipo) {
		this.clienteTipo = clienteTipo;
	}
	
	
	
	
}
