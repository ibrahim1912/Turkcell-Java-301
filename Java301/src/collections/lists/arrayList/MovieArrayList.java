package collections.lists.arrayList;

import java.util.ArrayList;

public class MovieArrayList {

	public static void main(String[] args) {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("American Pie",MovieGenre.COMEDY));
		movies.add(new Movie("Uncharted",MovieGenre.ACTION));
		
		for (Movie movie : movies) {
			System.out.println(movie);
		}
		
		System.out.println(movies.get(2)); //hata verir
	}

}
