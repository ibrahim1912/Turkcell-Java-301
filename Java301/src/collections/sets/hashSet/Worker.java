package collections.sets.hashSet;

public class Worker {

	private String nationalIdentity;
	private String firstName;
	
	public Worker() {
		
	} 
	
	public Worker(String nationalIdentity, String firstName) {
		this.nationalIdentity = nationalIdentity;
		this.firstName = firstName;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Override
	public String toString() {
		return "National Number : " + nationalIdentity + " , Name : " + firstName;
	}
	
	@Override
	public int hashCode() {
		return Integer.valueOf(nationalIdentity);
	}
	
	@Override
	public boolean equals(Object other) {
		Worker worker = (Worker) other;
		return this.nationalIdentity.equals(worker.nationalIdentity);
	}
}
