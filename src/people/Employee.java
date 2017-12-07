package people;

public class Employee extends Person {


    /**
     * 构造函数
     *
     * @param name      名字
     * @param address   地址
     * @param telephone 电话号码
     * @param eMail     邮箱
     */
    public Employee(String name, String address, int telephone, String eMail) {
        super(name, address, telephone, eMail);
    }
}
