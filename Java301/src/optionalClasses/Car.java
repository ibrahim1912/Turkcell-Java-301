package optionalClasses;

import java.util.Optional;
import java.util.function.Supplier;

public class Car {

	private String brand;
	private String model;
	private Engine engine;
	
	public Car() {
		
	}

	/*public Car(String brand, String model, Engine engine) {
		this.brand = brand;
		this.model = model;
		if(engine == null) {
			throw new IllegalArgumentException("Engine is not null");
		}
		this.engine = engine;
	}*/

	public Car(String brand, String model, Optional<Engine> engine) {
		this.brand = brand;
		this.model = model;
		this.engine = engine.orElseThrow(new Supplier<IllegalArgumentException>() {

			@Override
			public IllegalArgumentException get() {
				return new IllegalArgumentException("Engine is not null");
			}
		});
	}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	@Override
	public String toString() {
		return "Brand: " + brand + " Model: " + model + " Engine: " + engine;
	}
}
