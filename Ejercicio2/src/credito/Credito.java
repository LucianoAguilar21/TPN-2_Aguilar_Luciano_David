package credito;

import cliente.Cliente;

public class Credito implements Comparable<Credito>{
	private int numero, plazoEnAnios;
	private CreditoTipo tipo;
	private Cliente cliente;
	private Double montoAcordado,totalADevolver;
	private Sucursal sucursal;
	
	public Credito(int numero, int plazoEnAnios, CreditoTipo tipo, Cliente cliente, Double montoAcordado,
			Double totalADevolver, Sucursal sucursal) {
		super();
		this.numero = numero;
		this.plazoEnAnios = plazoEnAnios;
		this.tipo = tipo;
		this.cliente = cliente;
		this.montoAcordado = montoAcordado;
		this.totalADevolver = totalADevolver;
		this.sucursal = sucursal;
	}
	@Override
	public String toString() {
		return "Credito [numero=" + numero + ", plazoEnAnios=" + plazoEnAnios + ", tipo=" + tipo + ", cliente="
				+ cliente + ", montoAcordado=" + montoAcordado + ", totalADevolver=" + totalADevolver + ", sucursal="
				+ sucursal + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Credito other = (Credito) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (montoAcordado == null) {
			if (other.montoAcordado != null)
				return false;
		} else if (!montoAcordado.equals(other.montoAcordado))
			return false;
		if (numero != other.numero)
			return false;
		if (plazoEnAnios != other.plazoEnAnios)
			return false;
		if (sucursal == null) {
			if (other.sucursal != null)
				return false;
		} else if (!sucursal.equals(other.sucursal))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (totalADevolver == null) {
			if (other.totalADevolver != null)
				return false;
		} else if (!totalADevolver.equals(other.totalADevolver))
			return false;
		return true;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPlazoEnAnios() {
		return plazoEnAnios;
	}
	public void setPlazoEnAnios(int plazoEnAnios) {
		this.plazoEnAnios = plazoEnAnios;
	}
	public CreditoTipo getTipo() {
		return tipo;
	}
	public void setTipo(CreditoTipo tipo) {
		this.tipo = tipo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Double getMontoAcordado() {
		return montoAcordado;
	}
	public void setMontoAcordado(Double montoAcordado) {
		this.montoAcordado = montoAcordado;
	}
	public Double getTotalADevolver() {
		return this.montoAcordado * this.tipo.getTasaDeInteres();
	}
	public void setTotalADevolver(Double totalADevolver) {
		this.totalADevolver = totalADevolver;
	}
	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	@Override
	public int compareTo(Credito o) {
		// TODO Auto-generated method stub
		return this.getNumero() - o.getNumero();
	}
	

	
}
