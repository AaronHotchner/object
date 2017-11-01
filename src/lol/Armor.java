package lol;

public class Armor extends Item {
	private int ac = 1;
	
	public Armor() {
		ac = 0;
	}
	
	public int getAc() {
		return this.ac;
	}
	
	public void setAc(int ac) {
		this.ac = ac;
	}
}
