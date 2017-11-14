package hangManGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		File hangMan = new File("src/hangManGame/hangMan.txt");
		ArrayList<String> word = new ArrayList<>();
		Scanner input;
		try {
			input = new Scanner(hangMan);
			while(input.hasNext()) {
				word.add(input.next());			
			}
		
			
		String aWord = word.get(random(word.size()));
		System.out.println(aWord);
		
		char[] charWord = new char [100];
		aWord.getChars(0, aWord.length(), charWord, 0);
		System.out.println(charWord);
		
		char[] guess = new char [aWord.length()];
		for(int j = 0; j < aWord.length(); j++) {
			guess[j] = '*';
		}
		
		System.out.println(guess);
			
			
		} 
		catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
			
		
	}
	
	
	public static int random(int i) {
		return (int) (Math.random() * i);
	}
}
