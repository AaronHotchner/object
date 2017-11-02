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
		System.out.println("请输入用户名：");
		String name = input.nextLine();
		return name;
	}
	
	public String passWord() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入密码：");
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
			System.out.println("注册成功！");
		}
		else {
			System.out.println("用户名重复！请重新选择！");
			this.start(this.choose());
		}
			
		
	}
	
	public int choose() {
		Scanner input = new Scanner(System.in);
		System.out.println("1为注册用户，2为登录用户");
		int num = input.nextInt();
		//if(num == 1 || num == 2)
			return num;
		//else
			//throw new InputMismatchException("请选择1或2！");
	}
	
	public boolean login(String id, String password) {	
		for(int i = 0; i < list.size(); i++) {
			if(id.equals(list.get(i).getId())  && password.equals(list.get(i).getPassword())) {
				System.out.println("登陆成功！");
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
				System.out.println("请先注册！");
				this.start(this.choose());
			}	
			if(!this.login(this.userName(), this.passWord())) {
				System.out.println("登录失败！请重新选择！");
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
