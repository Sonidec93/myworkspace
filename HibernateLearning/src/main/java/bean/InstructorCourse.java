package bean;

public class InstructorCourse {
	private int InstructorId;
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
