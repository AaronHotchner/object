package word;

import java.io.File;

/**
 * ͳ���ļ��и���ĸ���ֵĴ��������ִ�Сд��
 * @author ���
 * @time 17.11.20
 */
public class Main {
	public static void main(String[] args) {
		File office = new File("wenjian/word.txt"); //�ļ�·��
		Word docx = new Word(office);
		int[] number = new int[52];
		number = docx.times();
		for(int i = 0; i < number.length; i++) {
			if(i < 26)
				System.out.println((char)(65 + i) + ":" + number[i]);
			else
				System.out.println((char)(97 + i - 26) + ":" + number[i]);
		}		
	}
}
