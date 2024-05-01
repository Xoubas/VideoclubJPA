package model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table
@IdClass(ClavePeliculaActor.class)
public class PeliculaActor {
    @Id
    @Column(name = "film_id")
    private Integer filmId;

    @Id
    @Column(name = "actor_id")
    private Integer actorId;

    @Column(name = "last_update", nullable = false)
    private LocalDateTime lastUpdate;

    public PeliculaActor() {
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "PeliculaActor{" +
                "filmId=" + filmId +
                ", actorId=" + actorId +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
