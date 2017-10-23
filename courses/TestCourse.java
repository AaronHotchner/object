package courses;

import java.util.Scanner;

public class TestCourse {
	public static void main(String[] args) {
		Course course = new Course("高数");
		Scanner input = new Scanner(System.in);
		String stu = "";
		System.out.println("请输入加入课程的学生姓名：");
		while(true) {
			stu =input.nextLine();
			if(stu.equals("."))
				break;
			course.addStudent(stu);
		}
		String[] student = course.getStudents();
		
		System.out.print("课程名称：");
		System.out.println(course.getCourseName());
		
		System.out.println("学生名单：");
		for(int i = 1; i <= course.getNumberOfStudents(); i++) {
			System.out.println(student[i]);
		}
		
		System.out.print("学生人数：");
		System.out.println(course.getNumberOfStudents());
		
		
	}
}
