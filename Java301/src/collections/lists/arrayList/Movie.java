package collections.lists.arrayList;

public class Movie {

	private String name;
	private MovieGenre genre;
	
	public Movie() {
		
	}

	public Movie(String name, MovieGenre genre) {
		super();
		this.name = name;
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MovieGenre getGenre() {
		return genre;
	}

	public void setGenre(MovieGenre genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Genre: " + genre;
	}
	
	@Override
	public boolean equals(Object other) {
		Movie movie = (Movie)other;
		return this.name.equals(movie.name);
	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(this.name);
	}
}
