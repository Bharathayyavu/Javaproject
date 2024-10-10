package account_holder;

public class account_holder_attr {

	String firstname;
	String lastname;
	int age;
	int salary;
	boolean credit_card_eligibility;
	
	public void cc_eligibility() {
		if (age>21 && salary>=50000)
			credit_card_eligibility=true;
	}

}
