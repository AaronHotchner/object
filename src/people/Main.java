package people;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Person a = new Student("caoshan", "bistu", 123456, "126.com", "san");

        System.out.println(a.toString());
    }

}
