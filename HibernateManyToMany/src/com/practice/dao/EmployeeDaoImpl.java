package com.practice.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import resources.HibernateUtility;

import com.practice.beans.Account;
import com.practice.beans.Employee;

import entity.AccountEntity;
import entity.EmployeeEntity;

public class EmployeeDaoImpl implements EmployeeDao {

	private static final Logger logger;

	static {
		DOMConfigurator.configure("src/resources/Log4j.xml");
		logger = Logger.getLogger(EmployeeDaoImpl.class);
	}

	@Override
	public int addAccountsToEmployee(List<Account> accoList, String EmpName) {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateUtility.createSessionFactory();
		Session session = sf.openSession();
		int empID = 0;
		try {

			EmployeeEntity emp = new EmployeeEntity();
			emp.setEmpName(EmpName);
			List<AccountEntity> accountEntities = new ArrayList<AccountEntity>();
			for (Account obj : accoList) {

				AccountEntity accountEntity = new AccountEntity();
				accountEntity.setAmount(obj.getAmount());
				accountEntities.add(accountEntity);
			}

			emp.setAccounts(accountEntities);
			session.getTransaction().begin();
			empID = (int) session.save(emp);
			session.getTransaction().commit();

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			session.close();
		}
		return empID;

	}

	public void removeAccount(int accountNumber, int empId) {
		SessionFactory sf = HibernateUtility.createSessionFactory();
		Session session = sf.openSession();
		try {

			AccountEntity accountEntity = (AccountEntity) session.get(
					AccountEntity.class, accountNumber);

			if (accountEntity != null) {

				EmployeeEntity empEntity = (EmployeeEntity) session.get(
						EmployeeEntity.class, empId);
				List<AccountEntity> found = new ArrayList<AccountEntity>();
				if (empEntity != null) {

					for (AccountEntity acc : empEntity.getAccounts()) {
						if (acc.getAccountNumber() == accountNumber) {
							found.add(acc);
						}
					}

					session.getTransaction().begin();
					empEntity.getAccounts().removeAll(found);
					session.getTransaction().commit();
				}

			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);

		} finally {
			if (session.isOpen() || session != null) {
				session.close();
			}
		}

	}

	public void deleteEmployee(int empId) {

		SessionFactory sf = HibernateUtility.createSessionFactory();
		Session session = sf.openSession();
		try {
			EmployeeEntity emp = (EmployeeEntity) session.get(
					EmployeeEntity.class, empId);

			if (emp != null) {

				emp.setAccounts(null);// if i comment this line then the
										// corresponding account also get
										// deleted otherwise it will delete the
										// entry from the third table and the
										// entry in the joined table will not
										// get deleted
				session.getTransaction().begin();
				session.delete(emp);
				session.getTransaction().commit();
			}

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			if (session.isOpen() || session != null) {
				session.close();
			}
		}

	}

	@Override
	public void addingEmployeesToAccounts(List<Employee> employees,
			Double amount) {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateUtility.createSessionFactory();
		Session session = sf.openSession();
		AccountEntity accountEntity = new AccountEntity();
		try {
			List<EmployeeEntity> list = new ArrayList<EmployeeEntity>();

			AccountEntity accountEntity2 = new AccountEntity();
			accountEntity2.setAmount(5555.0);
			for (Employee obj : employees) {
				EmployeeEntity empEntity = new EmployeeEntity();
				empEntity.setEmpName(obj.getEmpName());
				// empEntity.getAccounts().add(accountEntity);
				empEntity.getAccounts().add(accountEntity2);
				list.add(empEntity);
			}

			accountEntity.setList(list);
			accountEntity.setAmount(amount);
			session.getTransaction().begin();
			// session.save(accountEntity);
			session.save(accountEntity2);
			session.getTransaction().commit();

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			if (session.isOpen() || session != null) {
				session.close();
			}
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public void manyTomanyHQL() {
		SessionFactory sf = HibernateUtility.createSessionFactory();
		Session session = sf.openSession();
		try {
			org.hibernate.Query query = session
					.createQuery("select e.EmpId,e.EmpName,a.accountNumber,a.amount from EmployeeEntity e join e.accounts a where a.amount>5000");
			// query.setParameter("id",1);
			List<Object[]> list = query.list();

			for (Object obj[] : list) {
				System.out.println(obj[0] + " " + obj[1] + " " + obj[2] + " "
						+ obj[3]);
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			session.close();
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public void manyToManyCriteria() {
		// TODO Auto-generated method stub

		SessionFactory sf = HibernateUtility.createSessionFactory();
		Session session = sf.openSession();

		try {
			Criteria criteria = session.createCriteria(EmployeeEntity.class);
			criteria.createCriteria("accounts", "a");
			Criterion criterion1 = Restrictions.ge("a.amount", 5000.0);
			Criterion criterion2 = Restrictions.eq("EmpName", "mukul");
			LogicalExpression lg = Restrictions.and(criterion1, criterion2);
			criteria.add(lg);
			ProjectionList projList = Projections.projectionList();

			projList.add(Projections.property("EmpName"));
			projList.add(Projections.property("EmpId"));
			// criteria.setProjection(Projections.property("a.accountNumber"));
			// criteria.setProjection(Projections.property("a.amount"));
			projList.add(Projections.property("a.accountNumber"));
			projList.add(Projections.property("a.amount"));
			criteria.setProjection(projList);
			List<Object[]> list = criteria.list();

			for (Object obj[] : list) {
				System.out.println(obj[0] + " " + obj[1] + " " + " " + obj[2]
						+ " " + obj[3]);

			}

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			session.close();
		}

	}
}
