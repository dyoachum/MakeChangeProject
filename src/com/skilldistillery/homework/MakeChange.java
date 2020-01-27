package com.skilldistillery.homework;

import java.util.Scanner;

public class MakeChange {

	

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		float changeDue;
		System.out.print("The price for the item: ");
		float amountDue = kb.nextFloat();
		System.out.print("The amount paid: ");
		float amountPaid = kb.nextFloat();
		kb.close();
		if (amountPaid < amountDue)
			System.out.println("Not enough money");
		{
		if (amountPaid == amountDue)
				System.out.println("No change due.");
		}
		if (amountPaid > amountDue)
		{
			changeDue = amountPaid - amountDue;

			float change = (amountPaid - amountDue) * 100;
			changeDue = (int) (change + .5);
			System.out.println("Your change is: $" + changeDue / 100);

			int twenty = (int) change / 2000;
			change = change % 2000;
			System.out.println(twenty + " Twenties");

			int ten = (int) change / 1000;
			change = change % 1000;
			System.out.println(ten + " Tens");

			int five = (int) change / 500;
			change = change % 500;
			System.out.println(five + " Fives");

			int dollars = (int) change / 100;
			change = change % 100;
			System.out.println(dollars + " Dollars ");

			int quarters = (int) change / 25;
			change = change % 25;
			System.out.println(quarters + " Quarters ");

			int dimes = (int) change / 10;
			change = change % 10;
			System.out.println(dimes + " Dimes ");

			int nickels = (int) change / 5;
			change = change % 5;
			System.out.println(nickels + " Nickels ");

			int pennies = (int) change / 1;
			change = change % 1;
			System.out.println(pennies + " Pennies ");
		}
	}
}
