package lol;

public class Hero {
	private String name;
	private float hp;
	private float armor;
	private int moveSpeed;
	
	public Hero() {
		name = " ";
		hp = 0;
		armor = 0;
		moveSpeed = 0;
	}
	
	public float getHp() {
		return this.hp;
	}
	
	public void legenderay() {
		System.out.println("³¬Éñ£¡");
	}
	
	public void recoveryHp(float blood) {
		this.hp = this.hp + blood;
	}
	
	public void addSpeed (int speed) {
		this.moveSpeed = this.moveSpeed + speed;
	}
	
}
