package fastening_exercise.src.application;
import fastening_exercise.src.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ProgramFastening {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double dolarPrice = sc.nextDouble();
		double dolarBought = sc.nextDouble();

		sc.close();
		
		CurrencyConverter currencyConverter = new CurrencyConverter();
		
		currencyConverter.setdollarBought(dolarBought);
		currencyConverter.setDollarPrice(dolarPrice);

	}

}
