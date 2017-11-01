package market;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		User user = new User();
		Scanner input = new Scanner(System.in);
		
		System.out.println("欢迎");
		System.out.println("1为注册用户，2为登录用户");
		int num = input.nextInt();
		user.start(num);
		
	}
}
