package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "InstructorCourse")
@IdClass(PrimaryKey.class)
public class InstructorCourseEntity {
	@Id
	private int InstructorId;
	@Id
	private int CourseId;

	private double totalHoursTaught;

	public int getInstructorId() {
		return InstructorId;
	}

	public void setInstructorId(int instructorId) {
		InstructorId = instructorId;
	}

	public int getCourseId() {
		return CourseId;
	}

	public void setCourseId(int courseId) {
		CourseId = courseId;
	}

	public double getTotalHoursTaught() {
		return totalHoursTaught;
	}

	public void setTotalHoursTaught(double totalHoursTaught) {
		this.totalHoursTaught = totalHoursTaught;
	}
}
