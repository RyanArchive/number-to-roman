// Convertion of a number to roman numerals
// if-else condition only

import java.util.Scanner;

public class NumberToRoman {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println();

		do {
			System.out.print("Enter number [1-100 only]: ");
			num = sc.nextInt();
		} while (!(num >= 1 && num <= 100));

		System.out.print("\nRoman Numeral: ");

		// Distinguishing the tens digit and printing the converted value
		// The tens digit will be subtracted to the number so that only ones digit will remain
		if (num >= 10 && num <= 19) {
			System.out.print("X");
			num-=10;
		} else if (num >= 20 && num <= 29) {
			System.out.print("XX");
			num-=20;
		} else if (num >= 30 && num <= 39) {
			System.out.print("XXX");
			num-=30;
		} else if (num >= 40 && num <= 49) {
			System.out.print("XL");
			num-=40;
		} else if (num >= 50 && num <= 59) {
			System.out.print("L");
			num-=50;
		} else if (num >= 60 && num <= 69) {
			System.out.print("LX");
			num-=60;
		} else if (num >= 70 && num <= 79) {
			System.out.print("LXX");
			num-=70;
		} else if (num >= 80 && num <= 89) {
			System.out.print("LXXX");
			num-=80;
		} else if (num >= 90 && num <= 99) {
			System.out.print("XC");
			num-=90;
		} else if (num == 100) {
			System.out.println("C");
		}

		// Distinguishing the ones digit and printing the converted value
		if (num == 1) {
			System.out.println("I");
		} else if (num == 2) {
			System.out.println("II");
		} else if (num == 3) {
			System.out.println("III");
		} else if (num == 4) {
			System.out.println("IV");
		} else if (num == 5) {
			System.out.println("V");
		} else if (num == 6) {
			System.out.println("VI");
		} else if (num == 7) {
			System.out.println("VII");
		} else if (num == 8) {
			System.out.println("VIII");
		} else if (num == 9) {
			System.out.println("IX");
		}
	}
}