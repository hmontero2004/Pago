package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.TipoPagoDAO;
import com.distribuida.entities.TipoPago;


public class PrincipalTipoPago  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		TipoPagoDAO tipoPagoDAO = context.getBean("tipoPagoDAOImpl",TipoPagoDAO.class);
		
		//add
		TipoPago tipoPago = new TipoPago(0, "Pichincha");
		tipoPagoDAO.add(tipoPago);
		
		//up
		//TipoPago tipoPago2 = new TipoPago(6, "produbanco");
		//tipoPagoDAO.up(tipoPago2);
		
		//del
		//tipoPagoDAO.del(6);
		//finone
		System.out.print("*******************DEL***************"+tipoPagoDAO.findOne(6));
		try {System.out.print("*****************DEL****************"+tipoPagoDAO.findOne(6));} catch(Exception e) {e.printStackTrace();}

		//finall
		List<TipoPago> tipoPagos = tipoPagoDAO.findALL();
		
		
		tipoPagos.forEach(item -> {
			System.out.println(item.toString());});
				context.close();
	}

}

