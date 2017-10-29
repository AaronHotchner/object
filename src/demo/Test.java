package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		//测试 对象类型转换 声明类型 实例类型
/*		Parent p1 = new Sub();
		
		System.out.println(p1.tostring("hh"));
		System.out.println(((Sub) p1).gets());
*/	
		
		//测试数组
		/*ArrayList<Integer> num = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int value;
		
		do {
			value = input.nextInt();
			
			if(value != 0 && !num.contains(value))
				num.add(value);
		}while(value != 0);
		
		for(int i = 0; i < num.size(); i++)
			System.out.print(num.get(i) + " ");	*/
		
		/*Integer[] num = {1, 2, 3};
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(num));
		
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");*/
		
		Mystack stack = new Mystack();
		Scanner input = new Scanner(System.in);
		String word = "";
		do {
			//word = input.nextLine();
			word = input.nextLine();
			if(!word.equals("."))
				stack.push(word);
		}while(!word.equals("."));
		
		System.out.println(stack.toString());
	}
}
