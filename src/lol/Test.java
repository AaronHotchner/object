package lol;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Season s = Season.SUMMER;
		
		switch (s) {
		case SPRING: System.out.println("����"); break;
		case SUMMER: System.out.println("����"); break;
		case AUTUMN: System.out.println("����"); break;
		case WINTER: System.out.println("����"); break;
		}
		

	}
}
