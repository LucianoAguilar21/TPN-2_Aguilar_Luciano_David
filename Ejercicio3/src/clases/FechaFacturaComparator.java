package clases;

import java.util.Comparator;

public class FechaFacturaComparator implements Comparator<Factura>{

	@Override
	public int compare(Factura o1, Factura o2) {
		return o1.getFecha().compareTo(o2.getFecha());
	}

}
