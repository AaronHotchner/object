package changeName;

import java.io.File;
/**
 * 替换文件名
 * @author 姗蝈
 * @time 17.11.20
 */
public class ChangeName {
	public static void main(String[] args) {
		File path = new File("wenjian");
		File[] txt = path.listFiles();
		
		for(int a = 0; a < txt.length; a++) {
			System.out.println(txt[a].getName());
			
			if(check(txt[a].getName()) >= '0' && check(txt[a].getName()) <= '9') {
				File test = new File("wenjian/" + txt[a].getName());
				File test1 = new File("wenjian/exercise1_0" + check(txt[a].getName()) + ".txt"); //补0
				test.renameTo(test1);
			}
		}
		
		System.out.println("");
		System.out.println("以下是改变后的文件名：");
		txt = path.listFiles();
		for(int i = 0; i < txt.length; i++) {
			System.out.println(txt[i].getName());
		}
	}
	/**
	 * 检测exercisei_j.txt 的  j 是否为个位数
	 * @param name
	 * @return 个位数
	 */
	public static char check(String name) {
		int n = name.indexOf('_');
		if(name.charAt(n + 2) == '.') {
			//System.out.println(name.charAt(n + 1));
			return name.charAt(n + 1);
		}
		else
			return 'a';
	}
}
