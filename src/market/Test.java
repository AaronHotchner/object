package market;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		User user = new User();
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ");
		System.out.println("1Ϊע���û���2Ϊ��¼�û�");
		
		boolean flag = false;
		do {
			try {
				int num = input.nextInt();
				flag = user.start(num);
			}		
			catch (InputMismatchException ex) {
				String s = input.nextLine();
				System.out.println("������1��2��");
				System.out.println("1Ϊע���û���2Ϊ��¼�û�");
			}
			continue;
		}while(!flag);
	}
}
