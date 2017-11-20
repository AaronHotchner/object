package word;

import java.io.File;

/**
 * 统计文件中个字母出现的次数（区分大小写）
 * @author 姗蝈
 * @time 17.11.20
 */
public class Main {
	public static void main(String[] args) {
		File office = new File("wenjian/word.txt"); //文件路径
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
