package lol;

public class Support extends Hero implements Healer {

    @Override
    public void heal() {
        System.out.println("治疗");
    }


}
