package courses;

import java.util.Scanner;

public class TestCourse {
	public static void main(String[] args) {
		Course course = new Course("����");
		Scanner input = new Scanner(System.in);
		String stu = "";
		System.out.println("���������γ̵�ѧ��������");
		while(true) {
			stu =input.nextLine();
			if(stu.equals("."))
				break;
			course.addStudent(stu);
		}
		String[] student = course.getStudents();
		
		System.out.print("�γ����ƣ�");
		System.out.println(course.getCourseName());
		
		System.out.println("ѧ��������");
		for(int i = 1; i <= course.getNumberOfStudents(); i++) {
			System.out.println(student[i]);
		}
		
		System.out.print("ѧ��������");
		System.out.println(course.getNumberOfStudents());
		
		
	}
}
