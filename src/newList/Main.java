package newList;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入指定目录：");
		String path = input.nextLine();
		File list = new File(path);
		if(list.exists()) {
			System.out.println("目录已存在");
			System.exit(1);
		}			
		else
			System.out.println("准备创建");
		
		list.mkdirs();
		
		if(list.exists())
			System.out.println("目录创建成功");
		else
			System.out.println("目录创建失败");
		
	}
	
	
	
	
}
