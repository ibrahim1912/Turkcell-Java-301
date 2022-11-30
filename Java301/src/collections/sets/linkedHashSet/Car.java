package collections.sets.linkedHashSet;

public class Car {

	private String model;
	private String plate;
	
	public Car() {
		
	}
	
	public Car(String model, String plate) {
		super();
		this.model = model;
		this.plate = plate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}
	
	@Override
	public String toString() {
		return "Model: " + model + ", Plaka: " + plate;
	}
	@Override
	public int hashCode(){
		return this.plate.hashCode();
	}

	@Override
	public boolean equals(Object other) {
		Car car = (Car)other;
		return this.plate.equals(car.plate);
	}
	
}
