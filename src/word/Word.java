package word;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * ���� 
 * @author ���
 * @time 17.11.20
 */
public class Word {
	private ArrayList<String> word = new ArrayList<>();
	private int[] number = new int[52];
	
	public Word(File word) {
		try {
			Scanner input = new Scanner(word);
			while(input.hasNext())
				this.word.add(input.next());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("δ�ҵ��ļ���");
		}
	}
	
	public ArrayList<String> getList (){
		return this.word;
	}
	
	/**
	 * ͳ�Ƹ�����ĸ���ֵĴ���
	 * @return ����������������
	 */
	public int[] times() {
		for(int i = 0; i < word.size(); i++) {
			String a = word.get(i);
			for(int j = 0; j < a.length(); j++) {
				if(a.charAt(j) >= 'A' && a.charAt(j) <= 'Z')
					this.number[a.charAt(j) - 65]++;
				else if(a.charAt(j) >= 'a' && a.charAt(j) <= 'z')
					this.number[a.charAt(j) - 97 + 26]++;
				}
			}
		return this.number;
	}
}
