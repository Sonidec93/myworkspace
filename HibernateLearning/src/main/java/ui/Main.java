package ui;

import resources.HibernateUtility;
import bean.Course;
import bean.EmployeeCompany;
import bean.Instructor;
import bean.InstructorCourse;
import dao.InstructorDAO;
import dao.InstructorDAOImpl;

public class Main {

	public static void main(String[] arg) {

		InstructorDAOImpl daoImpl = new InstructorDAO();
		// Instructor instructor = new Instructor();
		// instructor.setInstructorId(120);
		// instructor.setInstructorName("Rajesh");
		// daoImpl.saveInstructorDetails(instructor);
		// Course course = new Course();
		// course.setCourseId(22);
		// course.setCourseName("Chemistry");
		// daoImpl.saveCourseDetails(course);
		// InstructorCourse instructorCourse = new InstructorCourse();
		// instructorCourse.setCourseId(21);
		// instructorCourse.setInstructorId(121);
		// instructorCourse.setTotalHoursTaught(10.5);
		// daoImpl.saveInstructorCourseDetails(instructorCourse);
		//
		// // InstructorCourse obj=daoImpl.getInstructorCourseDetails(121,21);
		// // System.out.println(obj.getTotalHoursTaught());

		EmployeeCompany employeeCompany = new EmployeeCompany();
		employeeCompany.setCompId(233);
		employeeCompany.setEmpId(1011);
		employeeCompany.setTenure(12.7);
		daoImpl.saveEmployeeCompanyDetails(employeeCompany);

		EmployeeCompany employeeCompany2 = daoImpl.getEmployeeCompanyDetails(
				1011, 233);
		System.out.println(employeeCompany2.getCompId());
		System.out.println(employeeCompany2.getEmpId());
		System.out.println(employeeCompany2.getTenure());
		HibernateUtility.closeSessionFactory();

	}
}
