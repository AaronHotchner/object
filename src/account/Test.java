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
		
		System.out.println("客户名字：" + b.getName());
		System.out.println("客户ID：" + b.getId());
		System.out.println("客户余额：" + b.getBalance());
		System.out.println("客户月利息：" + b.getMonthlyInterest());
		System.out.println("开户日期：" + b.getDateCreated());
		
		b.display();
	}
}
