package collections.lists.vector;

public class Book {

	private String name;
	private Writer writer;
	
	public Book() {
		
	}

	public Book(String name, Writer writer) {
		super();
		this.name = name;
		this.writer = writer;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Writer getWriter() {
		return writer;
	}

	public void setWriter(Writer writer) {
		this.writer = writer;
	}
	
	@Override
	public boolean equals(Object other) {
		Book book = (Book)other;
		return this.name.equals(book.name) && this.writer.equals(book.writer);
	}
	
	@Override
	public String toString() {
		return "Book Name: " + name + ", Writer: " + writer;
	}
}
