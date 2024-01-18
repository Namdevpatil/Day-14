package javaStreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {


		List<Product> products = new ArrayList<Product>();

		products.add(new Product(1200, "Iphone 15", 126710.90));
		products.add(new Product(2990, "Samsung S15", 78710.80));
		products.add(new Product(1123, "VIVO", 86710.90));
		products.add(new Product(2233, "OPPO A9", 12710.77));
		products.add(new Product(3400, "Real me", 96710.40));

		//?:
		Product productMaxPrice = products.stream()
								  		  .max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1)
								  		  .get();
								  
		
		System.out.println(productMaxPrice.toString());
		
		System.out.println("=============================================");

		Product productMinPrice = products.stream()
		  		  .min((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1)
		  		  .get();
		
		System.out.println(productMinPrice.toString());
		
	}

}
