package perfectSquare;

import java.util.ArrayList;

public class PerfectSquare {
	private int m;
	private int n;
	private ArrayList<Integer> listFactor = new ArrayList<>();
	private ArrayList<Integer> listN = new ArrayList<>();
	
	public PerfectSquare() {
		m = 0;
		n = 0;
	}
	
	public void setM(int m) {
		this.m = m;
	}
	
	//������С��������
	public void minimalFactor() {
		int i = 2;
		int m = this.m;
		do {
			if(m % i == 0) {
				listFactor.add(i);
				m = m / i;
			}				
			else
				i++;
		}while(m != 1);
	}
	
	public boolean flag(int i) {
		if((int)listFactor.get(i) != (int)listFactor.get(i - 1))
			return true;
		else
			return false;
	}
	
	//���ɳ�����������������
	public void listN() {
		int flag = 1;
		int i = 0;
		do{
			for(int j = i + 1; j < listFactor.size(); j++){
				if(listFactor.get(j) == listFactor.get(i))
					flag++;
			}
			if(flag % 2 != 0)
				listN.add(listFactor.get(i));			
			i++;
			
			if(i < listFactor.size()) {
				while(!flag(i)) {
					i++;	
					if(i >= listFactor.size())
						break;
				}
			}
					
			flag = 1;
		}while(i < listFactor.size());		
	}
	
	//N������Ԫ�����
	public void N() {
		this.n = listN.get(0);
		for(int i = 1; i < listN.size(); i++) {
			this.n = this.n * listN.get(i);
		}
	}
	
	//������ȫƽ��
	public int getMN() {
		return this.m * this.n;
	}
}
