package newList;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ָ��Ŀ¼��");
		String path = input.nextLine();
		File list = new File(path);
		if(list.exists()) {
			System.out.println("Ŀ¼�Ѵ���");
			System.exit(1);
		}			
		else
			System.out.println("׼������");
		
		list.mkdirs();
		
		if(list.exists())
			System.out.println("Ŀ¼�����ɹ�");
		else
			System.out.println("Ŀ¼����ʧ��");
		
	}
	
	
	
	
}
