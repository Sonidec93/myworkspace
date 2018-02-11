package dao;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.CourseEntity;
import entity.EmbeddedPrimaryKey;
import entity.EmployeeCompanyEntity;
import entity.InstructorCourseEntity;
import entity.InstructorEntity;
import entity.PrimaryKey;
import resources.HibernateUtility;
import bean.Course;
import bean.EmployeeCompany;
import bean.Instructor;
import bean.InstructorCourse;

public class InstructorDAO implements InstructorDAOImpl {

	@Override
	public int saveInstructorDetails(Instructor ins) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtility.createSessionFactory();
		Session session = sessionFactory.openSession();
		int id = 0;
		try {
			InstructorEntity entity = new InstructorEntity();
			entity.setInstructorId(ins.getInstructorId());
			entity.setInstructorName(ins.getInstructorName());
			session.getTransaction().begin();
			session.persist(entity);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			DOMConfigurator.configure("src/main/java/resources/log4j.xml");
			Logger logger = Logger.getLogger(InstructorDAO.class);
			logger.error(e.getMessage());
		} finally {
			if (session.isOpen()) {
				session.close();
			}
			

		}
		return id;
	}

	@Override
	public int saveCourseDetails(Course c) {
		SessionFactory sessionFactory = HibernateUtility.createSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			CourseEntity courseEntity = new CourseEntity();
			courseEntity.setCourseId(c.getCourseId());
			courseEntity.setCourseName(c.getCourseName());
			session.beginTransaction();
			session.save(courseEntity);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			DOMConfigurator.configure("src/main/java/resources/log4j.xml");
			Logger logger = Logger.getLogger(InstructorDAO.class);
			logger.error(e.getMessage());
		} finally {
			if (session.isOpen()) {
				session.close();
			}
			

		}
		return 0;
	}

	@Override
	public InstructorCourse getInstructorCourseDetails(int instructorId,
			int courseId) {
		InstructorCourse instructorCourse = null;
		SessionFactory sessionFactory = HibernateUtility.createSessionFactory();
		Session session = sessionFactory.openSession();
		try {

			InstructorEntity instructorEntity = (InstructorEntity) session.get(
					InstructorEntity.class, instructorId);

			CourseEntity courseEntity = (CourseEntity) session.get(
					CourseEntity.class, courseId);
			if (instructorEntity != null && courseEntity != null) {
				PrimaryKey primaryKey = new PrimaryKey();
				primaryKey.setCourseId(courseId);
				primaryKey.setInstructorId(instructorId);

				InstructorCourseEntity instructorCourseEntity = (InstructorCourseEntity) session
						.get(InstructorCourseEntity.class, primaryKey);
				instructorCourse = new InstructorCourse();
				instructorCourse.setCourseId(instructorCourseEntity
						.getCourseId());
				instructorCourse.setInstructorId(instructorCourseEntity
						.getInstructorId());
				instructorCourse.setTotalHoursTaught(instructorCourseEntity
						.getTotalHoursTaught());
			}
		} catch (Exception e) {
			e.printStackTrace();
			DOMConfigurator.configure("src/main/java/resources/log4j.xml");
			Logger logger = Logger.getLogger(InstructorDAO.class);
			logger.error(e.getMessage());
		} finally {
			if (session.isOpen()) {
				session.close();
			}
			

		}
		return instructorCourse;
	}

	@Override
	public void saveInstructorCourseDetails(InstructorCourse obj) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtility.createSessionFactory();
		Session session = sessionFactory.openSession();

		try {
			InstructorCourseEntity instructorCourseEntity = new InstructorCourseEntity();
			instructorCourseEntity.setCourseId(obj.getCourseId());
			instructorCourseEntity.setInstructorId(obj.getInstructorId());
			instructorCourseEntity.setTotalHoursTaught(obj
					.getTotalHoursTaught());
			session.getTransaction().begin();
			session.save(instructorCourseEntity);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			DOMConfigurator.configure("src/main/java/resources/log4j.xml");
			Logger logger = Logger.getLogger(InstructorDAO.class);
			logger.error(e.getMessage());
		} finally {
			if (session.isOpen()) {
				session.close();
			}
			

		}

	}

	@Override
	public void saveEmployeeCompanyDetails(EmployeeCompany ecomp) {
		SessionFactory sessionFactory=HibernateUtility.createSessionFactory();
		Session session=sessionFactory.openSession();
		try{
			EmployeeCompanyEntity employeeCompanyEntity=new EmployeeCompanyEntity();
			EmbeddedPrimaryKey embeddedPrimaryKey=new EmbeddedPrimaryKey();
			embeddedPrimaryKey.setCompId(ecomp.getCompId());
			embeddedPrimaryKey.setEmpId(ecomp.getEmpId());
			
			employeeCompanyEntity.setKey(embeddedPrimaryKey);
			employeeCompanyEntity.setTenure(ecomp.getTenure());
			
			session.getTransaction().begin();
			session.save(employeeCompanyEntity);
			session.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
			DOMConfigurator.configure("src/main/java/resources/log4j.xml");
			Logger logger = Logger.getLogger(InstructorDAO.class);
			logger.error(e.getMessage());
		} finally {
			if (session.isOpen()) {
				session.close();
			}
			

		}
		
	}

	@Override
	public EmployeeCompany getEmployeeCompanyDetails(int empId, int compId) {
		// TODO Auto-generated method stub
		EmployeeCompany employeeCompany=null;
		SessionFactory sessionFactory=HibernateUtility.createSessionFactory();
		Session session=sessionFactory.openSession();
		
		try{
			EmbeddedPrimaryKey key=new EmbeddedPrimaryKey();
			key.setCompId(compId);
			key.setEmpId(empId);
			EmployeeCompanyEntity employeeCompanyEntity=(EmployeeCompanyEntity) session.get(EmployeeCompanyEntity.class,key);
			
			employeeCompany=new EmployeeCompany();
			employeeCompany.setCompId(employeeCompanyEntity.getKey().getCompId());
			employeeCompany.setEmpId(employeeCompanyEntity.getKey().getEmpId());
			employeeCompany.setTenure(employeeCompanyEntity.getTenure());
			
			
		}catch (Exception e) {
			e.printStackTrace();
			DOMConfigurator.configure("src/main/java/resources/log4j.xml");
			Logger logger = Logger.getLogger(InstructorDAO.class);
			logger.error(e.getMessage());
		} finally {
			if (session.isOpen()) {
				session.close();
			}
			

		}
		
		return employeeCompany;
	}

}
