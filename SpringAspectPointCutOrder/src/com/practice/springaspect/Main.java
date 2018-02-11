package com.practice.springaspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.springaspect.dao.Account;

public class Main {

	public static void main(String arg[]) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				JavaConfig.class);

		Account account = context.getBean("account", Account.class);

		account.setFirstName("Mukul");

		account.getFirstName();
		account.Details();
		context.close();
	}
}
