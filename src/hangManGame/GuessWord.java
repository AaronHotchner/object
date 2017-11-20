package hangManGame;

/**
 * 
 * GuessWord类
 * @author 姗蝈
 * 
 * 
 */

public class GuessWord {
	private char[] word = new char[100];
	private char[] start = new char[100];
	
	/**
	 * 字符串word初始化
	 * @param word
	 */
	public GuessWord(String word) {
		word.getChars(0, word.length(), this.word, 0); //字符串单词 变成 字符数组
		for(int i = 0; i < word.length(); i++)			//生成和字母数量相同的*号
			start[i] = '*';
	}
	
	/**
	 * 打印单词
	 */
	public void getWord() {
		System.out.println(word);
	}
	
	/**
	 * 打印*号
	 */
	public void getStart() {
		System.out.println(start);
	}
	
	/**
	 * 检验c是否在正确单词中
	 * @param c 
	 * @return 在单词中返回位置，否则返回-1
	 */
	public int check(char c) {
		for(int i = 0; i < word.length; i++) {
			if(c == word[i])
				return i;
		}
		return -1;
	}
	
	/**
	 * 猜对显示c,否则显示 猜错了
	 * @param c
	 */
	public void guess(char c) {
		if(check(c) >= 0) {
			start[check(c)] = c;
			word[check(c)] = '*';
			getStart();
		}
		else {
			System.out.println("猜错啦~");
			getStart();
		}	
	}
	
	/**
	 * 是否全部猜出
	 * @return true为全部猜出
	 */
	public boolean checkAll() {
		for(int i = 0; i < start.length; i++) {
			if(start[i] == '*')
				return false;
		}
		return true;
	}
	
	
	
}
