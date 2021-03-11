import java.util.UUID;

public class Main {
	
	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount();
		System.out.println(sa.toString());
		sa.depositMoney(50.0);
		System.out.println(sa.toString());
		
		PersonalAccount pa = new PersonalAccount();
		System.out.println(pa.toString());
		pa.depositMoney(200.0);
		System.out.println(pa.toString());
		
		/*
		BankAccount ba = new BankAccount();
		
		
		System.out.println(ba.toString());
		ba.depositMoney(100.0);
		System.out.println(ba.toString());
		ba.depositMoney(50);
		System.out.println(ba.toString());
		ba.withdrawMoney(-100.0);
		 */
		
		
		/*
		System.out.println(UUID.randomUUID());
		System.out.println(UUID.randomUUID().toString().substring(0, 2));
		System.out.println(UUID.randomUUID().toString().substring(0, 10));
		*/
		
	}
	
	
}
