package market;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		User user = new User();
		Scanner input = new Scanner(System.in);
		
		System.out.println("��ӭ");
		System.out.println("1Ϊע���û���2Ϊ��¼�û�");
		int num = input.nextInt();
		user.start(num);
		
	}
}
