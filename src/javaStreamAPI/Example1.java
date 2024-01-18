package javaStreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {


		List<Product> products = new ArrayList<Product>();

		products.add(new Product(1200, "Iphone 15", 126710.90));
		products.add(new Product(2990, "Samsung S15", 78710.80));
		products.add(new Product(1123, "VIVO", 86710.90));
		products.add(new Product(2233, "OPPO A9", 12710.77));
		products.add(new Product(3400, "Real me", 96710.40));

		products.forEach((product) -> System.out.println(product.toString()));

		System.out.println("====================without stream api=========================");

		for(Product product: products)//
		{
			if(product.getPrice() >= 90000)
			{
				System.out.println(product.toString());
			}
		}

		System.out.println("========================with stream api=====================");

		products.stream()
		.filter(product -> product.getPrice() >= 90000)
		.forEach(product -> System.out.println(product.toString()));
		
		
	}

}
