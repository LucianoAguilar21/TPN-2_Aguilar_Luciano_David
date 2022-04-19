package clienteSCoopsAHoy;

import java.util.ArrayList;
import java.util.List;

import clases.Empresa;
import clases.Factura;
import clases.FacturaDetalle;
import clases.Fecha;
import clases.Producto;
import clases.SituacionIVAEnum;
import clases.TipoFacturaEnum;
import facturasAdmin.FacturasAdmin;

public class ClienteScoopsAhoy {
	
	
	public static void main(String[] args) {
		FacturasAdmin facturasAdmin = new FacturasAdmin();
		
		Producto prod1 = new Producto(1,"Descripcion1");
		Producto prod2 = new Producto(2,"Descripcion2");
		Producto prod3 = new Producto(3,"Descripcion3");
		Producto prod4 = new Producto(4,"Descripcion4");
		Producto prod5 = new Producto(5,"Descripcion5");
		Producto prod6 = new Producto(6,"Descripcion6");
		Producto prod7 = new Producto(7,"Descripcion7");
		
		Empresa emp1 = new Empresa("2122222227","Razon1", SituacionIVAEnum.CONSUMIDOR_FINAL);
		Empresa emp2 = new Empresa("2582522227","Razon2", SituacionIVAEnum.RESP_INSCRIPTO);
		Empresa emp3 = new Empresa("4112222272","Razon3", SituacionIVAEnum.RESP_NOINSCRIPTO);
		Empresa emp4 = new Empresa("555123147","Razon4", SituacionIVAEnum.CONSUMIDOR_FINAL);
		Empresa emp5 = new Empresa("89222227","Razon5", SituacionIVAEnum.CONSUMIDOR_FINAL);
		Empresa emp6 = new Empresa("1482354855","Razon6", SituacionIVAEnum.RESP_MONOTRIBUTO);
		
		FacturaDetalle facDet1 = new FacturaDetalle(1,68,prod1,150,68*150);
		FacturaDetalle facDet2 = new FacturaDetalle(2,28,prod2,200,28*200);
		FacturaDetalle facDet3 = new FacturaDetalle(3,88,prod3,100,88*100);
		FacturaDetalle facDet4 = new FacturaDetalle(4,98,prod4,300,98*300);
		FacturaDetalle facDet5 = new FacturaDetalle(5,38,prod5,600,38*600);
		FacturaDetalle facDet6 = new FacturaDetalle(6,18,prod6,800,18*800);
		
		List<FacturaDetalle> facturas = new ArrayList<FacturaDetalle>();
		
		facturas.add(facDet6);
		facturas.add(facDet5);
		facturas.add(facDet4);
		facturas.add(facDet3);
		facturas.add(facDet2);
		facturas.add(facDet1);
		
		Factura factura = new Factura(TipoFacturaEnum.FACTURA_A, 2,1, new Fecha(05,04,20), emp1, facturas, 50000);
		
		facturasAdmin.add(factura);
		
		//System.out.println(facturasAdmin.buscarFacturasPorMesAnio(1, 20));
		
		//System.out.println(facturasAdmin.buscarFacturasPorProveedor(emp1));
		
		System.out.println(facturasAdmin.facturaMasCostosa());
		
		//System.out.println(facturasAdmin.top5ProductoCantidad());
		
	}
}
