package plus;

import java.util.ArrayList;

public class Plus {
	private int p1, p2;
	private ArrayList<Integer> answer = new ArrayList<>();
	
	public Plus(int p1, int p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public int getP1() {
		return this.p1;
	}
	
	public int getP2() {
		return this.p2;
	}
	
	public void setP1P2(int p1, int p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public void result(int a) {
		answer.add((Integer) a);
		if(answer.get(answer.size() - 1) != (Integer)(this.p1 + this.p2)) {
			if(answer.size() >= 2) {
				for(int i = 0; i <= answer.size() - 2; i++) {
					if(answer.get(i) == answer.get(answer.size() - 1)) {
						System.out.println("��д���������");
						break;
					}
					else {
						System.out.println("����𰸣�");
						break;
					}
				}
			}
			else {
				System.out.println("����𰸣�");
			}				
		}
		else {
			System.out.println("����ȷ��");	
			System.exit(1);
		}
	}
}
