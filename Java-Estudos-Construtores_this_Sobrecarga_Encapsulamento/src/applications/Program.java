package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		Conta conta;

		int number;
		String name;
		char response;
		double depositInitial = 0.0;
		
		System.out.print("Enter account number: ");
		number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		name = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		response = sc.next() .charAt(0);
			if(response == 'y') {
				System.out.print("Enter initial deposit value: ");
				depositInitial = sc.nextDouble();
				conta = new Conta(number, name, depositInitial);
			} 
			else {
				conta = new Conta(number, name);
			}
		
		System.out.println();
		
		System.out.println("Account data:");
		System.out.print("Account " + conta.getNumber() + ", " 
						+ "Holder: " + conta.getHolder() + ", " 
						+ "Balance: $ " + conta.getBalance());
		System.out.println();
		System.out.println();
		
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		conta.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.print("Account " + conta.getNumber() + ", " 
		                + "Holder: " + conta.getHolder() + ", " 
		                + "Balance: $ " + conta.getBalance());
		System.out.println();
		System.out.println();
		
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		conta.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.print("Account " + conta.getNumber() + ", " 
		                + "Holder: " + conta.getHolder() + ", " 
		                + "Balance: $ " + conta.getBalance());
		
		sc.close();
	}

}
