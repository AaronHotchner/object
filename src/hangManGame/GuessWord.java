package hangManGame;

/**
 * 
 * GuessWord��
 * @author ���
 * 
 * 
 */

public class GuessWord {
	private char[] word = new char[100];
	private char[] start = new char[100];
	
	/**
	 * �ַ���word��ʼ��
	 * @param word
	 */
	public GuessWord(String word) {
		word.getChars(0, word.length(), this.word, 0); //�ַ������� ��� �ַ�����
		for(int i = 0; i < word.length(); i++)			//���ɺ���ĸ������ͬ��*��
			start[i] = '*';
	}
	
	/**
	 * ��ӡ����
	 */
	public void getWord() {
		System.out.println(word);
	}
	
	/**
	 * ��ӡ*��
	 */
	public void getStart() {
		System.out.println(start);
	}
	
	/**
	 * ����c�Ƿ�����ȷ������
	 * @param c 
	 * @return �ڵ����з���λ�ã����򷵻�-1
	 */
	public int check(char c) {
		for(int i = 0; i < word.length; i++) {
			if(c == word[i])
				return i;
		}
		return -1;
	}
	
	/**
	 * �¶���ʾc,������ʾ �´���
	 * @param c
	 */
	public void guess(char c) {
		if(check(c) >= 0) {
			start[check(c)] = c;
			word[check(c)] = '*';
			getStart();
		}
		else {
			System.out.println("�´���~");
			getStart();
		}	
	}
	
	/**
	 * �Ƿ�ȫ���³�
	 * @return trueΪȫ���³�
	 */
	public boolean checkAll() {
		for(int i = 0; i < start.length; i++) {
			if(start[i] == '*')
				return false;
		}
		return true;
	}
	
	
	
}
