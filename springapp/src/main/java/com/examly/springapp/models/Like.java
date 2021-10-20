package com.examly.springapp.models;

import java.lang.annotation.Inherited;
import java.util.List;
import com.examly.springapp.models.*;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "likes")
public class Like {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name="like_id")
    private String likeId;

    @Column(name="no_of_like")
    private int noOfLike;

    public Like(){
        super();
    }
    public Like(String likeId,int noOfLike){
        super();
        this.likeId=likeId;
        this.noOfLike=noOfLike;
    }
    public String getLikeId(){
        return likeId;
    }
    public int getNoOfLike(){
        return noOfLike;
    }
    public void setLikeId(String likeId){
        this.likeId=likeId;
    }
    public void setNoOfLike(int noOfLike){
        this.noOfLike=noOfLike;
    }
}
