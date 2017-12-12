package lol;

public class Test {
	public static void main(String[] args) {
		ADHero ad = new ADHero();
		Hero h = new Hero();
		Support s = new Support();
        APHero ap = new APHero();
        ADAPHero adap = new ADAPHero();

		//h = ad; //h为父类，子类的引用给父类
        //ad = (ADHero) h;//ad为子类，父类的引用给子类需要强制转换

        //h = s; //h为父类，子类的引用给父类
        //ad = (ADHero) h; // 此时h的引用为Support类，ADHero 和 Support 两个类并无继承关系，此时会抛出异常java.lang.ClassCastException

        //ADHero ad2 = new ADHero(); //ad2为ADHero类的对象
        //AD adi = ad2; //adi为AD接口引用，将ad2引用给adi,向上转型为接口
        //ADHero adHero = (ADHero) adi; //adi本为AD引用，转换成ADHero，由于原本为ad2的引用，所以可以
        //ADAPHero adapHero = (ADAPHero) adi; //抛出异常java.lang.ClassCastException

        //Hero h1 = new ADHero();
        //Hero h2 = new APHero();
        //boolean res1 = h1 instanceof ADHero;
        //boolean res2 = h2 instanceof APHero;
        //boolean res3 = h1 instanceof Hero;
        //System.out.println("h1是否是ADHero类型：" + res1); //此时不能写为("..." + h1 instanceof ADHero)
        //System.out.println("h2是否为APHero类型：" + res2);
        //System.out.println("h1是否为Hero类型：" + res3);

        //h = ad; //可以
        //AD adi = (AD) h;//可以
        //ap = (APHero) adi;//不可以，抛出异常java.lang.ClassCastException

        Hero garon = new Hero();
        garon.setName("亚瑟");
        ad.setName("后羿");
        ap.setName("王昭君");
        adap.setName("扁鹊");
        garon.kill(ad);
        garon.kill(ap);
        garon.kill(adap);

        Hero hero = new ADHero();
        hero.battleWin(); //会调用父类的battle函数！！！
        

	}
}
