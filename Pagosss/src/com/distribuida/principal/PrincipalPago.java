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
		
		Pago pago = new Pago(1,1,new Date(),1,35.30);
		//pago.setIdTipoPago(5);
		//pago.setIdpedido(2);
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
