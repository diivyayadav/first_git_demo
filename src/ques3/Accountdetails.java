package ques3;

public class Accountdetails {

	float bal;
	int num;
	String name;
	public Accountdetails(float bal, int num, String name) {
		
		this.bal = bal;
		this.num= num;
		this.name= name;
	}

	public int acctNo(int num) {
		return num;	
	}

	public String acctName(String name) {
		return name;	
	}
	
	public float acctBalance(float bal) {
		this.bal=bal;
		return bal;	
	}
	
	public float Deposit(float dep) {
			return bal+dep;
	}
	
	public float Withdraw(float draw) {
		return bal-draw;
	}
	
	public String creditCard() {
		return Integer.toString(num)+name;
	}
	
	
}
