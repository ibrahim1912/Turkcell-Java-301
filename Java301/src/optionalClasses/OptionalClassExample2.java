package optionalClasses;

import java.util.Optional;

public class OptionalClassExample2 {

	public static void main(String[] args) {
		Engine engine = null;
		Engine engine2 = new Engine("Z engine");
		Car car = new Car("X marka","Y marka",Optional.ofNullable(engine2));
		System.out.println(car);

	}

}
