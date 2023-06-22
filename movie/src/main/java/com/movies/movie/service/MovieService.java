package com.movies.movie.service;

import java.util.List;

import com.movies.movie.model.Movie;

public interface MovieService {
     // Save operation
     Movie saveMovie(Movie movie);
 
     // Read operation
     List<Movie> fetchMovieList();
  
     // Update operation
     Movie updateMovie(Movie movie, Long movieId);
  
     // Delete operation
     void deleteMovieById(Long movieId);
}
