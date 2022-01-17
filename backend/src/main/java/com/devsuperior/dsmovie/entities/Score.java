package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {

    @EmbeddedId
    private ScorePK id = new ScorePK();
    private Double value;

    public Score() {

    }

    public void seMovie(Movie movie){
        id.setMovie(movie);        
    }

    public void setUser(User user){
        id.setUser(user);
    }

    public ScorePK getId() {
        return this.id;
    }

    public void setId(ScorePK id) {
        this.id = id;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

}
