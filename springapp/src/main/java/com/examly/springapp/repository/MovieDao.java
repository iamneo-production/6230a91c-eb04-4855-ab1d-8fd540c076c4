package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examly.springapp.models.Movie;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieDao extends JpaRepository<Movie,String> {
    
}
