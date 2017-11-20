package hangManGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 测试猜单词
 * @author 姗蝈
 * @Time 17.11.19
 *
 */
public class Test {
	
	public static void main(String[] args) {
		File hangMan = new File("src/hangManGame/hangMan.txt"); //文件类 hangMan 
		ArrayList<String> word = new ArrayList<>();
		Scanner input, input2;
		try {
			input2 = new Scanner(System.in);
			input = new Scanner(hangMan);
			while(input.hasNext()) {
				word.add(input.next());	
			}//将文本hangMan内的单词存入word列表中
			
			String aWord = word.get(random(word.size())); //随机从word列表中抽取一个单词 aWord
			GuessWord wordClass = new GuessWord(aWord);
			System.out.println("来猜单词~");
			wordClass.getStart();
			String c;
			while(!wordClass.checkAll()) {
				System.out.println("请猜一个字母~");
				wordClass.guess(input2.nextLine().charAt(0));
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 返回0到i随机位置，不包括i
	 * @param i
	 * @return 随机位置
	 */
	public static int random(int i) {
		return (int) (Math.random() * i); //随机生成位置
	}
}
