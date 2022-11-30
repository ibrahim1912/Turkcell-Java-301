package collections.maps.hashMap;

public class City {

	private String name;
	private long population;
	
	public City() {
		
	}

	public City(String name, long population) {
		super();
		this.name = name;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		City city = (City) other;
		return this.name.equals(city.name);
	}
	
	@Override
	public String toString() {
		return "Name: " + name + " , Population: " + population;
	}
}
