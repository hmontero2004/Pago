package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.PagoDAO;
import com.distribuida.dao.TipoPagoDAO;
import com.distribuida.entities.Pago;


public class PrincipalPago  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		PagoDAO pagoDAO = context.getBean("pagoDAOImpl",PagoDAO.class);
		
		Pago pago = new Pago(0, new Date(), 22.12);
		pago.setIdTipoPago(5);
		pago.setIdpedido(2);
        //pago.setTipoPago(TipoPagoDAO.findOne());
        pagoDAO.add(pago);


		
		
	
		pagoDAO.del(0);
		
		//
		System.out.println("******************* DEL *******************"+pagoDAO.findOne(6));
		//
		pagoDAO.findALL().forEach(item -> {System.out.println(item.toString());});
		
		
//		List<Pago> Pago = pagoDAO.findALL();
//		Pago.forEach(item -> {
//			System.out.println(item.toString());
//		});
				context.close();
	}

}
/*add
		Bodega bodega= new Bodega (0,"lulú","Costa Rica", 15);
		//***** existe la DI (Inyección de Dependencias)
		bodega.setIdSucurales(3);
		//bodega.setSucursal(sucursalDAO.findOne(3)); 
		//bodegaDao.add(bodega);
		// up
		Bodega bodega2= new Bodega(5,"Carcasa","xd", 12);
		//bodega2.setIdSucurales(2);
		//bodegaDao.up(bodega2);
		// del
		//bodegaDao.del(5);
		// findOne
		System.out.println("******************* DEL *******************"+bodegaDao.findOne(1));
		// findAll
		bodegaDao.findAll().forEach(item -> {System.out.println(item.toString());});
		//List<Bodega> Bodegas= BodegaDao.findAll();
		//Bodegas.forEach(item -> {
			//System.out.println(item.toString());		
		context.close();
	} */