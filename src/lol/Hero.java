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
		System.out.println("传说");
	}
	
	public void recoveryHp(float blood) {
		this.hp = this.hp + blood;
	}
	
	public void addSpeed (int speed) {
		this.moveSpeed = this.moveSpeed + speed;
	}

	public  void kill(Mortal m){
		System.out.println(this.getName() + "放了一个大招！");
		m.die();
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void battleWin(){
		System.out.println("hero battle win!");
	}
}
