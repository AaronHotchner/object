package perfectSquare;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		PerfectSquare p = new PerfectSquare();
		Scanner input = new Scanner(System.in);
		System.out.println("请输入m:");
		
		int m = input.nextInt();
		p.setM(m);
		p.minimalFactor();
		p.listN();
		p.N();
		System.out.println("最小完全平方：" + p.getMN());	
	}
}
