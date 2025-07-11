package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.printf("Product #%d data:", i + 1);
			System.out.print("\nCommon, used or imported (c/u/i)? ");
			Character option = sc.next().toLowerCase().charAt(0);

			while (toCheck(option)) {
				System.out.print("Invalid option. Try again (c/u/i): ");
				option = sc.next().toLowerCase().charAt(0);
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (option == 'c') {

				list.add(new Product(name, price));

			} else if (option == 'i') {

				System.out.print("Customs fee: ");

				double customs = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customs));
				
			} else if (option == 'u') {

				System.out.print("Manufacture date: (DD/MM/YYYY): ");
				sc.nextLine();
				String date = sc.nextLine();
				list.add(new UsedProduct(name, price, LocalDate.parse(date, fmt)));

			}
		}

		System.out.println("PRICE TAGS:");
		for (Product x : list) {
			System.out.println(x.priceTag());
		}

		sc.close();
	}

	public static boolean toCheck(char option) {

		boolean x = false;
		if (option != 'u' && option != 'i' && option != 'c') {
			x = true;
		}

		return x;
	}
}
