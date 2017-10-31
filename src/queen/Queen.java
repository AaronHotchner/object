package queen;

public class Queen {

	public static void main(String[] args) {
		int[] queen = new int[8];
		num(1,9,queen);
		display(queen);
	}
	/*数组代表列数，不重复*/
	public static void num(int min, int max, int[] queen) {		
		int k = 0;
		int i = 0;
		boolean flag = true;
		while(i < queen.length) {
			int num = (int) (Math.random() * (max - min) + min);
			queen[i] = num;
			for(k = 0; k < i; k++) {
				if(queen[i] == queen[k]) {
					flag = false;
					break;
				}
				flag = true;
			}
			if(flag)
				i++;
		}
	}
	
	/*打印*/
	public static void display(int[] queen) {
		int k = 1;
		for(int i = 0; i < queen.length; i++) {
			for(k = 1; k < 9; k++) {
				if(k == queen[i])
					System.out.print("|Q");
				else
					System.out.print("| ");
			}
			System.out.println("|");
		}
	}
}
