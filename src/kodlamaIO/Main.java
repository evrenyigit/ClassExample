package kodlamaIO;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		
		product1.id = 101;
		product1.name = "C# + Angular";
		product1.instructor = "Engin Demiro�";

		Product product2 = new Product(102,"Java + React","Engin Demiro�");

		Product[] products = {product1,product2};
		
		DoSomething doSomething = new DoSomething();
		
		doSomething.printSomething(product1);
		doSomething.printSomething(product2);
		doSomething.printSomething2(product1,product2);
		
		for (Product product: products)
		{
			System.out.println(product.name);
		}
			
		}
	}
	

