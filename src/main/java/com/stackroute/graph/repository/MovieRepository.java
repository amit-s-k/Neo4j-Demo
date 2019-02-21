package com.stackroute.graph.repository;

import com.stackroute.graph.model.Movie;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

public interface MovieRepository extends Neo4jRepository<Movie,Integer> {
    @Query("match (m:Movie) where m.titleOfMovie={title} return m")
    Movie getByTitle(@Param("title") String title);

}
