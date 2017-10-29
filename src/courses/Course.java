package courses;

/**课程类，包含 课程名称、学生名单、学生数量*/
public class Course {
	private String courseName;
	private String[] students;
	private int numberOfStudents;
	
	//初始化
	public Course(String courseName) {
		this.courseName = courseName;
		this.students = new String[100];
		this.numberOfStudents = 0;
	}
	
	//获得课程名称
	public String getCourseName() {
		return this.courseName;
	}
	
	//添加学生
	public void addStudent(String student) {
		this.numberOfStudents++;	
		this.students[numberOfStudents] = student;		
	}
	
	//删除学生
	public void dropStudent(String student) {
		this.numberOfStudents--;
	}
	
	//获得学生名单数组
	public String[] getStudents() {
		return this.students;
	}
	
	//获得学生数
	public int getNumberOfStudents() {
		return this.numberOfStudents;
	}
}
