package day02;

import java.util.List;

public class MovieService {
private List<Movie> movies;

private void addMovie(Movie movie){
 movies.add(movie);
}

    public MovieService(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}

