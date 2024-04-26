package Java;

public class Account_Encap_Main {

	public static void main(String[] args) {

		Account_Encapsulation accob = new Account_Encapsulation();
		accob.setAcc_no(91727342);
		accob.setName("Suyog Borade");
		accob.setBalance(500000);

		System.out.println(accob.getAcc_no());
		System.out.println(accob.getName());
		System.out.println(accob.getBalance());

	}

}
