package people;

public class Student extends Person {
    private String grade;
    /**
     * 构造函数
     *
     * @param name      名字
     * @param address   地址
     * @param telephone 电话号码
     * @param eMail     邮箱
     * @param grade     年级
     */
    public Student(String name, String address, int telephone, String eMail, String grade) {
        super(name, address, telephone, eMail);
        this.grade = grade;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString(){
        return "Student " + this.getName();
    }




}
