package collections.sets.treeSet;

public class City  implements Comparable<City>{

	private String code;
	private String name;

	public City(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public City() {

	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Sehir kodu: " + code + ", Isim: " + name;
	}

	@Override
	public int compareTo(City o) {
		
		return this.code.compareTo(o.code);
	}

}
