package lol;

public class ADHero extends Hero implements AD,Mortal {
    @Override
    public void physicAttack(){
        System.out.println("进行物理攻击！");
    }

    @Override
    public void die() {
        System.out.println(this.getName() + "挂了！");
    }

    public static void battleWin(){
        System.out.println("ad hero battle win!");
    }
}
