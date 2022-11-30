package collections.maps.hashMap;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Date startedDate;
	private String writer;
	
	public Book() {
		
	}

	public Book(String name, Date startedDate, String writer) {
		this.name = name;
		this.startedDate = startedDate;
		this.writer = writer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(Date startedDate) {
		this.startedDate = startedDate;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.startedDate.hashCode() + this.writer.hashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		Book book = (Book)other;
		return this.name.equals(book.name) && this.startedDate.equals(book.startedDate) && this.writer.equals(book.writer);
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Started Date:" + startedDate + ", Writer: " + writer;
	}



}
