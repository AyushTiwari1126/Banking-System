package thisJavaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class myMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, city;
		int accno, amt;
		ArrayList<Account> list = new ArrayList<>();
		list.add(new Account("Ayush Tiwari", "New Delhi", 5000));
		list.add(new Account("Ajay Garg", "Noida", 4600));
		list.add(new Account("Deepak Bhati", "Ghaziabad", 10000));

		System.out.println("Select Operations");
		System.out.println("1. Open Account");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Balance Enquiry");
		System.out.println("5. List All");
		System.out.println("6. Exit");
		
		int choice;
		boolean found;
		do {
			System.out.println("Enter Choice here ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Account Open");
				System.out.println("Enter Name ");
				name = sc.next();
				System.out.println("Enter City ");
				city = sc.next();
				System.out.println("Enter Amount ");
				amt = sc.nextInt();
				Account ac = new Account(name, city, amt);
				list.add(ac);
				System.out.println("Account Opened");
				break;
			case 2:
				System.out.println("Deposit Amount");
				found = false;
				System.out.println("Enter Account Number ");
				accno = sc.nextInt();
				for (Account i : list) {
					if (accno == i.getAccno()) {
						found = true;
						System.out.println("Customer name " + i.getName());
						System.out.println("City " + i.getCity());
						System.out.println("Balance " + i.getBal());

						System.out.println("\nEnter amount to deposit ");
						amt = sc.nextInt();
						i.setBal(i.getBal() + amt);
						System.out.println("Deposit Successfully...");
						break;
					}
				}
				if (!found) {
					System.out.println("Invalid Account Number");
				}
				break;
			case 3:
				System.out.println("Withdraw Account");
				found = false;
				System.out.println("Enter Account Number ");
				accno = sc.nextInt();
				for (Account i : list) {
					if (accno == i.getAccno()) {
						found = true;
						System.out.println("Customer name " + i.getName());
						System.out.println("City " + i.getCity());
						System.out.println("Balance " + i.getBal());

						System.out.println("\nEnter amount to withdraw ");
						amt = sc.nextInt();
						if (amt <= i.getBal()) {
							i.setBal(i.getBal() - amt);
							System.out.println("Withdraw Successfully...");
						}
						else {
							System.out.println("Insufficient Balance !!");
						}
						break;
					}
				}
				if (!found) {
					System.out.println("Invalid Account Number");
				}
				break;
			case 4:
				System.out.println("Account Balance Enqiury");
				found = false;
				System.out.println("Enter Account Number ");
				accno = sc.nextInt();
				for (Account i : list) {
					if (accno == i.getAccno()) {
						found = true;
						System.out.println("Customer name " + i.getName());
						System.out.println("City " + i.getCity());
						System.out.println("Balance " + i.getBal());
						break;
					}
				}
				if (!found) {
					System.out.println("Invalid Account Number");
				}
				break;
			case 5:
				System.out.println("Open all List Accounts");
				break;
			case 6:
				System.out.println("Exit");
				for (Account i : list) {
					System.out.println(i);
				}
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		} while(choice != 6);
		
	}

}
