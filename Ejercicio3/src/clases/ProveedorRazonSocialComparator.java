package clases;

import java.util.Comparator;

public class ProveedorRazonSocialComparator implements Comparator<Factura>{

	@Override
	public int compare(Factura o1, Factura o2) {
		return o1.getProveedor().getRazonSocial().compareTo(o2.getProveedor().getRazonSocial());
	}

}
