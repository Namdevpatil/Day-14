package javaStreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {


		List<Product> products = new ArrayList<Product>();

		products.add(new Product(1200, "Iphone 15", 126710.90));
		products.add(new Product(2990, "Samsung S15", 78710.80));
		products.add(new Product(1123, "VIVO", 86710.90));
		products.add(new Product(2233, "OPPO A9", 12710.77));
		products.add(new Product(3400, "Real me", 96710.40));

		
		//count means: number
		long countValue = products.stream()
								  .filter(product -> product.getPrice() >= 90000)
								  .count();
		
		System.out.println(countValue);
		
		System.out.println("=============================================");

		int count = 0;
		
		for(Product product: products)//
		{
			if(product.getPrice() >= 90000)
			{
				count = count+1;
			}
		}
		
		System.out.println(count);
		
	}

}
