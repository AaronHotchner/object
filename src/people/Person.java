package people;

/**
 * 父类
 *
 * @author 姗蝈
 * @version  1.0  于2017.11.30
 */
public class Person {
    private String name;
    private String address;
    private int telephone;
    private String eMail;

    /**
     *  构造函数
     * @param name 名字
     * @param address 地址
     * @param telephone 电话号码
     * @param eMail 邮箱
     */
    public Person(String name, String address, int telephone, String eMail){
        this.address = address;
        this.name = name;
        this.eMail = eMail;
        this.telephone = telephone;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getAddress() {
        return address;
    }

    public String geteMail() {
        return eMail;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }



}
