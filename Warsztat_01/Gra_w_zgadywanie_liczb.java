package Warsztat_01;

import java.util.Scanner;

public class Gra_w_zgadywanie_liczb {

	public static void main(String[] args) {
		bestNumber();
	}

	static void bestNumber() {
		Scanner scan = new Scanner(System.in);
		int bestInt = 23;

		while (true) {
			System.out.println("Zgadnij liczbę':");
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.println("To nie jest liczba matole:");
			}

			int input = scan.nextInt();

			if (input == bestInt) {
				System.out.println("Zgadłeś!!!");
				break;
			} else if (input < bestInt) {
				System.out.println("Za mało");
			} else {
				System.out.println("Za dużo");
			}
		}
		scan.close();
	}
}
