package clases;

import java.util.List;

public class Factura implements Comparable<Factura> {
	private TipoFacturaEnum tipoDeFactura;
	private int puntoDeVenta, numero;
	private Fecha fecha;
	private Empresa proveedor;
	private List<FacturaDetalle> detalleFactura;
	private float importeTotal;
	
	public Factura(TipoFacturaEnum tipoDeFactura, int puntoDeVenta, int numero, Fecha fecha, Empresa proveedor,
			List<FacturaDetalle> detalleFactura, float importeTotal) {
		super();
		this.tipoDeFactura = tipoDeFactura;
		this.puntoDeVenta = puntoDeVenta;
		this.numero = numero;
		this.fecha = fecha;
		this.proveedor = proveedor;
		this.detalleFactura = detalleFactura;
		this.importeTotal = importeTotal;
	}

	@Override
	public String toString() {
		return "Factura [tipoDeFactura=" + tipoDeFactura + ", puntoDeVenta=" + puntoDeVenta + ", numero=" + numero
				+ ", fecha=" + fecha + ", empresa=" + proveedor + ", detalleFactura=" + detalleFactura + ", importeTotal="
				+ importeTotal + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		if (detalleFactura == null) {
			if (other.detalleFactura != null)
				return false;
		} else if (!detalleFactura.equals(other.detalleFactura))
			return false;
		if (proveedor == null) {
			if (other.proveedor != null)
				return false;
		} else if (!proveedor.equals(other.proveedor))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (Float.floatToIntBits(importeTotal) != Float.floatToIntBits(other.importeTotal))
			return false;
		if (numero != other.numero)
			return false;
		if (puntoDeVenta != other.puntoDeVenta)
			return false;
		if (tipoDeFactura != other.tipoDeFactura)
			return false;
		return true;
	}

	public TipoFacturaEnum getTipoDeFactura() {
		return tipoDeFactura;
	}

	public void setTipoDeFactura(TipoFacturaEnum tipoDeFactura) {
		this.tipoDeFactura = tipoDeFactura;
	}

	public int getPuntoDeVenta() {
		return puntoDeVenta;
	}

	public void setPuntoDeVenta(int puntoDeVenta) {
		this.puntoDeVenta = puntoDeVenta;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public Empresa getProveedor() {
		return proveedor;
	}

	public void setProveedor(Empresa proveedor) {
		this.proveedor = proveedor;
	}

	public List<FacturaDetalle> getDetalleFactura() {
		return detalleFactura;
	}

	public void setDetalleFactura(List<FacturaDetalle> detalleFactura) {
		this.detalleFactura = detalleFactura;
	}

	public float getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(float importeTotal) {
		this.importeTotal = importeTotal;
	}

	@Override
	public int compareTo(Factura o) {
		int dato = -1;
		if(this.proveedor.equals(o.getProveedor())) {
			if(this.puntoDeVenta == o.getPuntoDeVenta()) {
				dato= this.numero - o.getNumero();
			}
		}
		return dato;
	}
	
	
	
	
	
}
