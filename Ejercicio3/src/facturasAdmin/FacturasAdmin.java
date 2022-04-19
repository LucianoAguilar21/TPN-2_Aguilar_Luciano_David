package facturasAdmin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import clases.Empresa;
import clases.Factura;
import clases.Producto;

public class FacturasAdmin extends FacturasAdminAbstract {

	@Override
	public List<Factura> buscarFacturasPorMesAnio(int mes, int anio) {
		List<Factura> lista = new ArrayList<>();
		for (int i = 0; i < this.facturasList.size(); i++) {
			if (this.facturasList.get(i).getFecha().getMes() == mes
					&& this.facturasList.get(i).getFecha().getAnio() == anio) {
				lista.add(facturasList.get(i));
			}
		}
		return lista;
	}

	@Override
	public List<Factura> buscarFacturasPorProveedor(Empresa empresa) {
		List<Factura> lista = new ArrayList<>();
		for (int i = 0; i < this.facturasList.size(); i++) {
			if (this.facturasList.get(i).getProveedor().equals(empresa)) {
				lista.add(facturasList.get(i));
			}
		}
		return lista;
	}

	@Override
	public Factura facturaMasCostosa() {
		float mayor;
		int indice = 0;
		Factura factura;
		mayor = this.facturasList.get(0).getImporteTotal();

		for (int i = 0; i < facturasList.size(); i++) {
			if (mayor < facturasList.get(i).getImporteTotal()) {
				mayor = facturasList.get(i).getImporteTotal();
				indice = i;

			}
		}
		factura = facturasList.get(indice);
		return factura;

	}

	@Override
	public List<Producto> top5ProductoCantidad() {
		//SIN COMPLETAR
		List<Producto> productos = new ArrayList<>();

		return null;
	}

}
