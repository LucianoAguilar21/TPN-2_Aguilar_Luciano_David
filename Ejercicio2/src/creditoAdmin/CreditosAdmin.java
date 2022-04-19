package creditoAdmin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import cliente.ClienteTipoEnum;
import credito.Credito;
import credito.CreditoTipo;
import credito.Sucursal;

public class CreditosAdmin extends CreditoAdminAbstract {

	@Override
	public List<Credito> creditosPorClienteTipo(ClienteTipoEnum tipo) {

		List<Credito> lista = new ArrayList<Credito>();
		for (int i = 0; i < this.creditosList.size(); i++) {
			if (this.creditosList.get(i).getCliente().getTipo().equals(tipo)) {
				lista.add(this.creditosList.get(i));
			}
		}
		return lista;

	}

	@Override
	public List<Credito> creditosPorCreditoTipoySucursal(CreditoTipo tipo, Sucursal sucursal) {
		List<Credito> lista = new ArrayList<Credito>();
		for (int i = 0; i < this.creditosList.size(); i++) {
			if (this.creditosList.get(i).getTipo().equals(tipo)
					&& this.creditosList.get(i).getSucursal().equals(sucursal)) {
				lista.add(creditosList.get(i));
			}

		}
		return lista;

	}

	@Override
	public List<Credito> creditosInferioresA(double monto) {
		List<Credito> lista = new ArrayList<Credito>();

		for (int i = 0; i < this.creditosList.size(); i++) {
			if (this.creditosList.get(i).getMontoAcordado() < monto) {
				lista.add(creditosList.get(i));
			}

		}
		return lista;
	}

	@Override
	public List<Credito> creditosSuperioresA(double monto) {
		List<Credito> lista = new ArrayList<Credito>();

		for (int i = 0; i < this.creditosList.size(); i++) {
			if (this.creditosList.get(i).getMontoAcordado() > monto) {
				lista.add(creditosList.get(i));
			}

		}
		return lista;
	}

	@Override
	public void ordenar() {
		Collections.sort(this.creditosList);
	}

	@Override
	public void ordenar(Comparator<Credito> comparator) {
		this.creditosList.sort(comparator);

	}

	@Override
	public String toString() {
		String datos= "";
		for (int i = 0; i < this.creditosList.size(); i++) {
			datos += this.creditosList.get(i).toString();
		}
		return datos;
	}

}
