package com.practice.springaspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.springaspect.dao.AccountDAO;
import com.practice.springaspect.dao.MembershipDAO;

public class Main {

	public static void main(String arg[]) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				JavaConfig.class);

		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

		MembershipDAO membershipDAO = context.getBean("membershipDAO",
				MembershipDAO.class);

		System.out.println(membershipDAO.addMembership(true));
		accountDAO.addAccount();
		context.close();
	}
}
