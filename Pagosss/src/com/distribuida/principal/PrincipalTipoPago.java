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
		List<TipoPago> tipoPago = tipoPagoDAO.findALL();
		tipoPago.forEach(item -> {
			System.out.println(item.toString());
		});
				context.close();
	}

}
