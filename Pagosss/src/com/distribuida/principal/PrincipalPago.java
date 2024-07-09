package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.PagoDAO;
import com.distribuida.entities.Pago;


public class PrincipalPago  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		PagoDAO pagoDAO = context.getBean("pagoDAOImpl",PagoDAO.class);
		List<Pago> Pago = pagoDAO.findALL();
		Pago.forEach(item -> {
			System.out.println(item.toString());
		});
				context.close();
	}

}
