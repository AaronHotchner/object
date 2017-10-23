package courses;

/**�γ��࣬���� �γ����ơ�ѧ��������ѧ������*/
public class Course {
	private String courseName;
	private String[] students;
	private int numberOfStudents;
	
	//��ʼ��
	public Course(String courseName) {
		this.courseName = courseName;
		this.students = new String[100];
		this.numberOfStudents = 0;
	}
	
	//��ÿγ�����
	public String getCourseName() {
		return this.courseName;
	}
	
	//���ѧ��
	public void addStudent(String student) {
		this.numberOfStudents++;	
		this.students[numberOfStudents] = student;		
	}
	
	//ɾ��ѧ��
	public void dropStudent(String student) {
		this.numberOfStudents--;
	}
	
	//���ѧ����������
	public String[] getStudents() {
		return this.students;
	}
	
	//���ѧ����
	public int getNumberOfStudents() {
		return this.numberOfStudents;
	}
}
