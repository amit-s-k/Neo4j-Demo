package com.stackroute.graph.service;

import com.stackroute.graph.model.Movie;
import com.stackroute.graph.model.Person;
import com.stackroute.graph.repository.MovieRepository;
import com.stackroute.graph.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
    private MovieRepository movieRepository;
    private PersonRepository personRepository;

    public HomeService(MovieRepository movieRepository, PersonRepository personRepository) {
        this.personRepository = personRepository;
        this.movieRepository = movieRepository;
    }

    public Iterable<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public void saveMovieToDb(Movie movie) {
        movieRepository.save(movie);
    }

    public Iterable<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public void savePersonToDb(Person person) {
        personRepository.save(person);
    }

    public Movie getByTitle(String title) {
        return movieRepository.getByTitle(title);
    }

}
