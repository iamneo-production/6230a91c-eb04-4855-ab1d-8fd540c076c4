package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examly.springapp.models.Like;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeDao extends JpaRepository<Like,String> {
    
}
