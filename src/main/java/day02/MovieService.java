package day02;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private static List<Movie> movies = new ArrayList<>();

    public MovieService() {

    }


    private void addMovie(Movie movie) {
        movies.add(movie);
    }



    public List<Movie> getMovies() {
        return movies;
    }


    public static void main(String[] args) {

        MovieService movieService = new MovieService();

        Movie movie1 = new Movie("A", 12, List.of("A1", "A2"));
        Movie movie2 = new Movie("B", 24, List.of("A2", "A3"));
        Movie movie3 = new Movie("C", 36, List.of("A1", "A3"));



        movieService.addMovie(movie1);
        movieService.addMovie(movie2);
        movieService.addMovie(movie3);

        System.out.println(movies);

    }
}


