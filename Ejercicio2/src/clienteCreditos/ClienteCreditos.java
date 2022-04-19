package clienteCreditos;



import cliente.Cliente;
import cliente.ClienteTipoEnum;
import credito.Credito;
import credito.CreditoTipo;
import credito.OrdenacionCliente;
import credito.OrdenacionTotalADevolver;
import credito.Sucursal;
import creditoAdmin.CreditosAdmin;

public class ClienteCreditos {
	

	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Ricardo","Rojas","22555333",ClienteTipoEnum.PERSONA);
		Cliente cli2 = new Cliente("Jorge","Odiard","23444888",ClienteTipoEnum.PERSONA);
		Cliente cli3 = new Cliente("Ramon","Aguilar","24555111",ClienteTipoEnum.COMERCIO);
		Cliente cli4 = new Cliente("Luciano","Aguilar","37444222",ClienteTipoEnum.EMPRESA_DE_CONSTRUCCION);
		Cliente cli5 = new Cliente("Nicolas","Perez","18999145",ClienteTipoEnum.PERSONA);

		
		CreditoTipo credTipo1 = new CreditoTipo("Descripcion1", 500.0, 200.0, 2.0, 2, 6, ClienteTipoEnum.COMERCIO);
		CreditoTipo credTipo2 = new CreditoTipo("Descripcion2", 800.0, 100.0, 2.0, 2, 6, ClienteTipoEnum.PERSONA);
		CreditoTipo credTipo3 = new CreditoTipo("Descripcion3", 600.0, 300.0, 2.0, 2, 6, ClienteTipoEnum.EMPRESA_DE_CONSTRUCCION);
		CreditoTipo credTipo4 = new CreditoTipo("Descripcion4", 1500.0, 500.0, 2.0, 2, 6, ClienteTipoEnum.COMERCIO);
		CreditoTipo credTipo5 = new CreditoTipo("Descripcion5", 1000.0, 600.0, 2.0, 2, 6, ClienteTipoEnum.COMERCIO);
		
		Sucursal suc1 = new Sucursal("sucursal1");
		Sucursal suc2 = new Sucursal("sucursal2");
		Sucursal suc3 = new Sucursal("sucursal3");
		
		
		Credito cred1 = new Credito(1,5,credTipo2,cli1,5000.0,7000.0,suc1);
		Credito cred2 = new Credito(2,6,credTipo2,cli2,5000.0,7000.0,suc2);
		Credito cred3 = new Credito(3,4,credTipo1,cli3,5000.0,7000.0,suc1);
		Credito cred4 = new Credito(4,8,credTipo3,cli4,13000.0,20000.0,suc3);
		Credito cred5 = new Credito(5,3,credTipo1,cli5,5000.0,7000.0,suc1);
		
		
		CreditosAdmin creditos = new CreditosAdmin();
		
		creditos.add(cred1);
		creditos.add(cred3);
		creditos.add(cred4);
		creditos.add(cred2);
		creditos.add(cred5);
		
		System.out.println(creditos.size());
		
		System.out.println(creditos.creditosPorClienteTipo(ClienteTipoEnum.COMERCIO));
		
		System.out.println(creditos.creditosPorCreditoTipoySucursal(credTipo3, suc3));
		
		System.out.println(creditos.creditosInferioresA(10000));
		
		System.out.println(creditos.creditosSuperioresA(5000));
		
		System.out.println(creditos.toString());
		
		creditos.ordenar();
		
		System.out.println(creditos.toString());
		
		creditos.ordenar(new OrdenacionTotalADevolver());
		
		System.out.println(creditos.toString());
		
		creditos.ordenar(new OrdenacionCliente());
		
		System.out.println(creditos.toString());
		
		
	}
	
	
}
