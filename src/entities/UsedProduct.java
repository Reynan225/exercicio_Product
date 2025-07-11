package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");  

	private LocalDate date;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, LocalDate date) {
		super(name, price);
		this.date = date;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String priceTag() {
		return getName() + String.format(" (Used) $ %.2f", getPrice()) + " (Manufacture date: " + fmt.format(date) + ")";
	}
	
}