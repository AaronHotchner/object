package hangManGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ���Բµ���
 * @author ���
 * @Time 17.11.19
 *
 */
public class Test {
	
	public static void main(String[] args) {
		File hangMan = new File("src/hangManGame/hangMan.txt"); //�ļ��� hangMan 
		ArrayList<String> word = new ArrayList<>();
		Scanner input, input2;
		try {
			input2 = new Scanner(System.in);
			input = new Scanner(hangMan);
			while(input.hasNext()) {
				word.add(input.next());	
			}//���ı�hangMan�ڵĵ��ʴ���word�б���
			
			String aWord = word.get(random(word.size())); //�����word�б��г�ȡһ������ aWord
			GuessWord wordClass = new GuessWord(aWord);
			System.out.println("���µ���~");
			wordClass.getStart();
			String c;
			while(!wordClass.checkAll()) {
				System.out.println("���һ����ĸ~");
				wordClass.guess(input2.nextLine().charAt(0));
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * ����0��i���λ�ã�������i
	 * @param i
	 * @return ���λ��
	 */
	public static int random(int i) {
		return (int) (Math.random() * i); //�������λ��
	}
}
