package clases;

public class FacturaDetalle implements Comparable<FacturaDetalle> {
	private int numeroItem, cantidad;
	private Producto producto;
	private float precioUnit, subTotal;
	
	public FacturaDetalle(int numeroItem, int cantidad, Producto producto, float precioUnit, float subTotal) {
		super();
		this.numeroItem = numeroItem;
		this.cantidad = cantidad;
		this.producto = producto;
		this.precioUnit = precioUnit;
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "FacturaDetalle [numeroItem=" + numeroItem + ", cantidad=" + cantidad + ", producto=" + producto
				+ ", precioUnit=" + precioUnit + ", subTotal=" + subTotal + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FacturaDetalle other = (FacturaDetalle) obj;
		if (cantidad != other.cantidad)
			return false;
		if (numeroItem != other.numeroItem)
			return false;
		if (Float.floatToIntBits(precioUnit) != Float.floatToIntBits(other.precioUnit))
			return false;
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		if (Float.floatToIntBits(subTotal) != Float.floatToIntBits(other.subTotal))
			return false;
		return true;
	}

	public int getNumeroItem() {
		return numeroItem;
	}

	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public float getPrecioUnit() {
		return precioUnit;
	}

	public void setPrecioUnit(float precioUnit) {
		this.precioUnit = precioUnit;
	}

	public float getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public int compareTo(FacturaDetalle o) {
		// TODO Auto-generated method stub
		return this.cantidad - o.getCantidad();
	}
	
	
	
}
