package account_holder;

public class account_holder_objects {

	public static void main(String[] args) {
		account_holder_attr tom = new account_holder_attr();
		account_holder_attr jerry = new account_holder_attr();
		account_holder_attr jack = new account_holder_attr();
		tom.firstname="tom";
		tom.lastname="bharath";
		tom.age=25;
		tom.salary=50000;
		
	    tom.cc_eligibility();
		System.out.println("tom criteria = " + tom.credit_card_eligibility);
		
		jerry.age=25;
		jerry.salary=30000;
		jerry.cc_eligibility();
		System.out.println("jerry criteria = " + jerry.credit_card_eligibility);
	}

}
