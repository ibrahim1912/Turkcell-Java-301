package collections.lists.listLabs;

public class Seat {

	private int number;
	private Ticket ticket;
	
	public Seat() {
		
	}

	public Seat(int number, Ticket ticket) {
		super();
		this.number = number;
		this.ticket = ticket;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	@Override
	public String toString() {
		return "Number: " + number + ", Ticket: " + ticket;
	}
	
	@Override
	public int hashCode() {
		return number + ticket.getNumber();
	}
	
	@Override
	public boolean equals(Object other) {
		Seat seat = (Seat)other;
		return this.number == seat.number && this.ticket.equals(seat.ticket);
	}
	
}
