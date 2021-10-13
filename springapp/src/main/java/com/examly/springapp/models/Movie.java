package com.examly.springapp.models;

import java.util.List;
import com.examly.springapp.models.*;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "movie")
public class Movie {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name="movie_id")
    private String movieId;

    @Column(name="movie_name")
    private String movieName;
    
    @Column(name="movie_url")
    private String movieUrl;

    @Column(name="movie_poster_url")
    private String moviePosterUrl;

    @ElementCollection // 1
    @CollectionTable(name = "movie_casts", joinColumns = @JoinColumn(name = "id"))
    private List<String> movieCast;
    
    @OneToOne(cascade=CascadeType.ALL)
    private Like like;
    
    public Movie(){
        super();
    }

    public Movie(String movieId,String movieName,String movieUrl,String moviePosterUrl,List<String> movieCast,Like like)
    {
        super();
        System.out.println(movieId);
        System.out.println(movieName);
        System.out.println(movieUrl);
        System.out.println(moviePosterUrl);
       // System.out.println(movieCast);
        this.movieId=movieId;
        this.movieName=movieName;
        this.movieUrl=movieUrl;
        this.moviePosterUrl=moviePosterUrl;
        this.movieCast=movieCast;
        this.like=like;
    }
    public String getMovieId(){
        return movieId;
    }
    public String getMovieName(){
        return movieName;
    }
    public String getMovieUrl(){
        return movieUrl;
    }
    public String getMoviePosterUrl(){
        return moviePosterUrl;
    }
    public List<String> getMovieCast(){
        return movieCast;
    }
    public Like getLike(){
        return like;
    }
    public void setMovieName(String movieName){
        this.movieName=movieName;
    }
    public void setMovieUrl(String movieUrl){
        this.movieUrl=movieUrl;
    }
    public void setMoviePosterUrl(String moviePosterUrl){
        this.moviePosterUrl=moviePosterUrl;
    }
    public void setLike(Like like){
        this.like=like;
    }
    public void setMovieCast(List<String> movieCast){
        this.movieCast=movieCast;
    }
    
}
