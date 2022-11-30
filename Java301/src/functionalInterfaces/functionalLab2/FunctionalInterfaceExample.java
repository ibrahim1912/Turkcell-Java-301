package functionalInterfaces.functionalLab2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Supplier<Product> supplier = new Supplier<Product>() {
			
			@Override
			public Product get() {
				Product product = new Product(1,"Labtop",10202);
				return product;
			}
		};
		
		Supplier<Product> supplier2 = () -> new Product(1,"Labtop",10202);
		System.out.println(supplier.get());
		System.out.println(supplier2.get());
		System.out.println("******************");
		

		Supplier<List<Product>> supplier3 = () -> {
			List<Product> list = new ArrayList<Product>();
			list.add(new Product(2,"Mouse",345));
			list.add(new Product(3,"Keyboard",585));
			list.add(new Product(4,"Monitor",1265));
			return list;
		};
		
		supplier3.get().forEach((p) -> System.out.println(p));
		
	}
}
