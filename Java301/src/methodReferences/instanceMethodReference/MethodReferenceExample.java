package methodReferences.instanceMethodReference;

import java.util.ArrayList;
import java.util.Collections;

public class MethodReferenceExample {

	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(new Car("Ford",122000));
		cars.add(new Car("Bmw",1000));
		cars.add(new Car("Audi",62000));

		//Collections.sort(cars,new CarComparator());
		CarComparator carComparator = new CarComparator();
		Collections.sort(cars,carComparator::compare);
		cars.forEach(System.out::println);
	}

}
