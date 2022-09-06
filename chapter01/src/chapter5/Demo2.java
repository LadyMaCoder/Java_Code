package chapter5;

public class Demo2 {
		public static void main(String[] args) {
		    Bank ba = new Bank("123456", 500);
		    ba.savemoney(1000);
		    ba.getmoney(800);
		}
	}
	class Bank{
		String account;
		int money;
		public Bank() {}
		public Bank(String account, int money) {
		    this.account= account;
		    this.money = money;
		}
		public void savemoney(int savemoney) {
		    money+= savemoney;
		    System.out.println("存入1000元后您的余额为："+money);
		}
		public void getmoney(int getmoney) {
		    if (money > getmoney) {
		        money-= getmoney;
		        System.out.println("取出800元后您的余额为："+money);
		    } else {
		        System.out.println("账户余额不足");
		    }
		}
	}

