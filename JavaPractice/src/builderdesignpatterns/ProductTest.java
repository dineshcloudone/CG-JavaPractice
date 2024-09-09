package builderdesignpatterns;

public class ProductTest {
	
	public static void main(String[] args) {
		
		//UseCase1 : only mandatory fields
		Product product1=new Product.ProductBuilder("Apple Macbook Pro", 1200).build();		
		System.out.println(product1);
		
		//UseCase2 : mandatory + optional fields
		Product product2=new Product.ProductBuilder("Samsung Monitor", 500)
						.setCategory("Electronics")
						.setDescription("this is 17 inches monitory")
						.setDiscount(10)
						.setFreeShipping(false)
						.setStock(50)
						.build();
		
		System.out.println(product2);
		
		//updating some value
		product2.setDiscount(5);
		
		System.out.println(product2);
		System.out.println(product2.getCategory());
		
		//UseCase3 :  
		Product product3=new Product.ProductBuilder("T shirt", 500)
					.setCategory("Fashion")
					.setFreeShipping(true)
					.setStock(100)
					.build();
	}

}
