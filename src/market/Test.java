package market;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		User user = new User();
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎");
		System.out.println("1为注册用户，2为登录用户");
		
		boolean flag = false;
		do {
			try {
				int num = input.nextInt();
				flag = user.start(num);
			}		
			catch (InputMismatchException ex) {
				String s = input.nextLine();
				System.out.println("请输入1或2！");
				System.out.println("1为注册用户，2为登录用户");
			}
			continue;
		}while(!flag);
	}
}
