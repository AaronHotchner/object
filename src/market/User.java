package market;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class User {
	private String id;
	private String password;
	private ArrayList<UserList> list = new ArrayList<>();
	
	public User() {
		id = null;
		password = null;
	}
	
	public String userName() {
		Scanner input = new Scanner(System.in);
		System.out.println("�������û�����");
		String name = input.nextLine();
		return name;
	}
	
	public String passWord() {
		Scanner input = new Scanner(System.in);
		System.out.println("���������룺");
		String passWord = input.nextLine();
		return passWord;
	}

	public boolean cheak(UserList l) {
		for(int i = 0; i < this.list.size(); i++) {
			if(list.get(i).getId().equals(l.getId()))
				return false;
		}
		return true;
	}
	
	public void register(String id, String password) {
		this.id = id;
		this.password = password;
		UserList u = new UserList(this.id, this.password);
		if(this.cheak(u)) {
			this.list.add(u);
			System.out.println("ע��ɹ���");
		}
		else {
			System.out.println("�û����ظ���������ѡ��");
			this.start(this.choose());
		}
			
		
	}
	
	public int choose() {
		Scanner input = new Scanner(System.in);
		System.out.println("1Ϊע���û���2Ϊ��¼�û�");
		int num = input.nextInt();
		//if(num == 1 || num == 2)
			return num;
		//else
			//throw new InputMismatchException("��ѡ��1��2��");
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
	
	public boolean start(int num) {
		
		if(num == 1) {
			this.register(this.userName(), this.passWord());
			this.start(this.choose());
		}
		else if(num == 2) {
			if(list.size() == 0) {
				System.out.println("����ע�ᣡ");
				this.start(this.choose());
			}	
			if(!this.login(this.userName(), this.passWord())) {
				System.out.println("��¼ʧ�ܣ�������ѡ��");
				this.start(this.choose());
			}
			return true;
				
		}
		else {
			throw new InputMismatchException();
			//throw new NoSuchElementException();
		}
		
		return false;
			
		//System.exit(1);
	}
		
}
