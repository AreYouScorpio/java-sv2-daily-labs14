package day02;

import java.util.*;
import java.util.stream.Collectors;

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

    public List<Movie> getMoviesByActor(String actor){


        return movies.stream().filter(o-> o.getActors().stream().anyMatch(p-> p.equals(actor))).collect(Collectors.toList());
    }

    private int getLongestFilmLength(){
        int maxLength;

                maxLength = movies.stream().mapToInt(o->o.getLength()).max().getAsInt();
        return maxLength;
    }

    private String getLongestFilm(){
        String longestMovie;

        longestMovie = movies.stream().sorted(Collections.reverseOrder(Comparator.comparing(Movie::getLength))).findFirst().get().getTitle();
        return longestMovie;
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

        System.out.println(movieService.getMoviesByActor("A1"));
        System.out.println("A leghosszabb film hossza: ");
        System.out.println(movieService.getLongestFilmLength());
        System.out.println("A leghosszabb film címe: ");
        System.out.println(movieService.getLongestFilm());

    }
}


