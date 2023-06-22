package com.movies.movie.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.movies.movie.model.Movie;
import com.movies.movie.repository.MovieRepository;

@Component
@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepo;

    @Override
    public Movie saveMovie(Movie movie) {
       return movieRepo.save(movie);
    }

    @Override
    public List<Movie> fetchMovieList() {
        return (List<Movie>)movieRepo.findAll();
    }

    @Override
    public Movie updateMovie(Movie movie, Long movieId) {
        Movie movieDB = movieRepo.findById(movieId).get();
 
        if (Objects.nonNull(movie.getTitle())&& !"".equalsIgnoreCase(movie.getTitle())) {
            movieDB.setTitle(movie.getTitle());
        }
 
        if (Objects.nonNull( movie.getGenre()) && !"".equalsIgnoreCase(movie.getGenre())) {
            movieDB.setGenre(movie.getGenre());
        }
 
        if (Objects.nonNull(movie.getRating())&& movie.getRating()>0) {
             movieDB.setRating(movie.getRating());
        }
 
        return movieRepo.save(movieDB);
    }

    @Override
    public void deleteMovieById(Long movieId) {
        movieRepo.deleteById(movieId);
    }
    
}
