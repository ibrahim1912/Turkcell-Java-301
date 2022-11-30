package collections.lists.listLabs;

import java.util.Date;

public class Ticket {

	private int number;
	private Date date;
	private float price;
	
	public Ticket() {
		
	}

	public Ticket(int number, Date date, float price) {
		super();
		this.number = number;
		this.date = date;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Number: " + number + ", Date: " + date + ", Price: " + price;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
	
	@Override
	public boolean equals(Object other) {
		Ticket ticket = (Ticket)other;
		return this.number == ticket.number;
	}
}
