package lol;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Season s = Season.SUMMER;
		
		switch (s) {
		case SPRING: System.out.println("春天"); break;
		case SUMMER: System.out.println("夏天"); break;
		case AUTUMN: System.out.println("秋天"); break;
		case WINTER: System.out.println("冬天"); break;
		}
		

	}
}
