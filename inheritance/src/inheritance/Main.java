package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer individual = new IndividualCustomer();
		individual.customerNumber ="12345";
		
		CorporateCustomer corporate = new CorporateCustomer();
		corporate.customerNumber ="123";
		
		syndicateCustomer syndicate = new syndicateCustomer();
		syndicate.customerNumber="1234";
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(corporate);
		customerManager.add(individual);
		customerManager.add(syndicate);
		
		System.out.println("*-*-*-*-*-*-*-*-*-*");
		
		//Alternatif 2. yol
		Customer[] customers = {individual,corporate,syndicate};
		customerManager.addMultiple(customers);
		

	}

}
