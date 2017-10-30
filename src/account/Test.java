package account;

public class Test {
	public static void main(String[] args) {
		
		
		Account b = new Account("George", 1122, 1000);
		b.setAnnualInterstRate(1.5);
		
		b.withDraw(30);
		b.withDraw(40);
		b.withDraw(50);
		b.deposit(5);
		b.deposit(4);
		b.deposit(2);
		
		System.out.println("�ͻ����֣�" + b.getName());
		System.out.println("�ͻ�ID��" + b.getId());
		System.out.println("�ͻ���" + b.getBalance());
		System.out.println("�ͻ�����Ϣ��" + b.getMonthlyInterest());
		System.out.println("�������ڣ�" + b.getDateCreated());
		
		b.display();
	}
}
