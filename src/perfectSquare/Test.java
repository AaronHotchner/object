package perfectSquare;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		PerfectSquare p = new PerfectSquare();
		Scanner input = new Scanner(System.in);
		System.out.println("������m:");
		
		int m = input.nextInt();
		p.setM(m);
		p.minimalFactor();
		p.listN();
		p.N();
		System.out.println("��С��ȫƽ����" + p.getMN());	
	}
}
