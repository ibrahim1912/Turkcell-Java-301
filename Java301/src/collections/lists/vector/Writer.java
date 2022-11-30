package collections.lists.vector;

import java.io.Serializable;

public class Writer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public Writer() {

	}

	public Writer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object other) {
		Writer writer = (Writer) other;
		return this.name.equals(writer.name);
	}
	
	@Override
	public String toString() {
		return "Name: " + name;
	}

}
