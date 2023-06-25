package com.movies.movie.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movies.movie.model.Movie;
import com.movies.movie.service.MovieService;

@RestController
public class MovieHandler {
    @Autowired private MovieService movieService;

    @PostMapping(value="/movie")
    public Movie saveMovie( @RequestBody Movie movie){
        return movieService.saveMovie(movie);
    }
    @GetMapping(value="/movies")
    public List<Movie> getMovies(){
        return movieService.fetchMovieList();
    }
    @PutMapping(value="/movie/{id}")
    public Movie updateMovie(@RequestBody Movie movie,@PathVariable("id") Long id){
        return movieService.updateMovie(movie, id);
    }
    @DeleteMapping(value="/movie/{id}")
    public String deleteMovie(@PathVariable("id") Long id){
        movieService.deleteMovieById(id);
        return "Movie with id "+id+" successfully deleted!";
    }
}
