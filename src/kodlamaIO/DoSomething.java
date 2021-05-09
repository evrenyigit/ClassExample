package kodlamaIO;

public class DoSomething {
	
	void printSomething(Product product)
	{
		System.out.println(product.id + " " + product.name + " " + product.instructor);
	}
	
	void printSomething2(Product product, Product productt)
	{
		if(product.id < productt.id)
			System.out.println("Birinci dersin ID'si daha düþük");
	}

}
