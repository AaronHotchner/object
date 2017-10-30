package account;

import java.util.ArrayList;
import java.util.Date;

public class Account {
	private String name;
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	private ArrayList<Transaction> transactions = new ArrayList<>();
	
	
	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public Account(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}

 	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterstRate(double annualInterstRate) {
		this.annualInterestRate = annualInterstRate;
	}
	
	public int getId() {
		return this.id;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getAnnualInterstRate() {
		return this.annualInterestRate;
	}
	
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
	public String getName() {
		return this.name;
	}
	
	//返回月利率
	public double getMonthlyInterestRate() {
		return annualInterestRate / 100 / 12;
	}
	
	//返回月利息
	public double getMonthlyInterest() {
		return this.balance * this.getMonthlyInterestRate();
	}
	
	//取款
	public void withDraw(double money) {
		this.balance = this.balance - money;
		transactions.add(new Transaction('W', money, this.balance,"取钱"));
	}
	
	//存款
	public void deposit(double money) {
		this.balance = this.balance + money;
		transactions.add(new Transaction('D', money, this.balance,"存钱"));
	}
	
	public void display() {
		System.out.println();
		System.out.println("交易记录：");
		System.out.println("-----------------------");
		for(int i = 0; i < transactions.size(); i++) {
			System.out.println("时间：" + transactions.get(i).getDate());
			System.out.println("手续信息：" + transactions.get(i).getDescription() + transactions.get(i).getAmount());
			System.out.println("余额:" + transactions.get(i).getBalance());
			System.out.println("-----------------------");
		}
	}
}
