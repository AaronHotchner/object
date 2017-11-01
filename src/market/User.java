package market;

import java.util.ArrayList;
import java.util.Scanner;


public class User {
	private String id;
	private String password;
	private ArrayList<UserList> list = new ArrayList<>();
	
	public User() {
		id = null;
		password = null;
	}

	
	public void register(String id, String password) {
		this.id = id;
		this.password = password;
		this.list.add(new UserList(this.id, this.password));
		System.out.println("ע��ɹ���");
	}
	
	public boolean login(String id, String password) {	
		for(int i = 0; i < list.size(); i++) {
			if(id.equals(list.get(i).getId())  && password.equals(list.get(i).getPassword())) {
				System.out.println("��½�ɹ���");
				return true;
			}				
		}
		return false;
	}
	
	public void start(int num) {
		Scanner input = new Scanner(System.in);
		if(num == 1) {
			System.out.println("�������û�����");
			String id = input.nextLine();
			System.out.println("���������룺");
			String password = input.nextLine();
			this.register(id, password);
			System.out.println("1Ϊע���û���2Ϊ��¼�û�");
			int num1 = input.nextInt();
			this.start(num1);
		}
		else if(num == 2) {
			if(list.size() == 0) {
				System.out.println("����ע�ᣡ");
				System.out.println("1Ϊע���û���2Ϊ��¼�û�");
				int num1 = input.nextInt();
				this.start(num1);
			}	
			System.out.println("�������û�����");
			String id = input.nextLine();
			System.out.println("���������룺");
			String password = input.nextLine();
			if(!this.login(id, password)) {
				System.out.println("��¼ʧ�ܣ�������ѡ��");
				System.out.println("������ѡ��");
				System.out.println("1Ϊע���û���2Ϊ��¼�û�");
				int num1 = input.nextInt();
				this.start(num1);
			}
				
		}
		else {
			System.out.println("������ѡ��");
			System.out.println("1Ϊע���û���2Ϊ��¼�û�");
			int num1 = input.nextInt();
			this.start(num1);
		}
			
		System.exit(1);
	}
		
}
