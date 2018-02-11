package dao;

import bean.Course;
import bean.EmployeeCompany;
import bean.Instructor;
import bean.InstructorCourse;

public interface InstructorDAOImpl {

	public int saveInstructorDetails(Instructor ins);
	public int saveCourseDetails(Course c);
	public InstructorCourse getInstructorCourseDetails(int instructorId,int courseId);
	public void saveInstructorCourseDetails(InstructorCourse obj);
	public void saveEmployeeCompanyDetails(EmployeeCompany ecomp);
	public EmployeeCompany getEmployeeCompanyDetails(int empId,int compId);
}
