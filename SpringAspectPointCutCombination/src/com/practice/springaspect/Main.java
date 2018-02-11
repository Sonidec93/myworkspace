package com.practice.springaspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.springaspect.dao.AccountDAO;
import com.practice.springaspect.service.FortuneService;

public class Main {

	/**
	 * @param arg
	 */
	public static void main(String arg[]) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				JavaConfig.class);

		// Account account = context.getBean("account", Account.class);
		//
		// account.setFirstName("Mukul");
		// account.getFirstName();
		// context.close();

		// AccountDAO accountDAO = context.getBean("accountDAO",
		// AccountDAO.class);
		//
		//
		// accountDAO.throwigException();

		FortuneService fortuneService = context.getBean("fortuneService",
				FortuneService.class);
		
		System.out.println(fortuneService.getFortune(false));
		context.close();
	}
}
