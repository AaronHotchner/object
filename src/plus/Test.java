package plus;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Plus a = new Plus(5, 9);
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println(a.getP1() + "+" + a.getP2() + "= ?");
			int key = input.nextInt();
			a.result(key);			
		}while(true);
		
	}
	
}
