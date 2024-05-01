package model;

import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class ClavePeliculaActor {
    private final Integer filmId;
    private final Integer actorId;

    public ClavePeliculaActor(Integer filmId, Integer actorId) {
        this.filmId = filmId;
        this.actorId = actorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClavePeliculaActor that = (ClavePeliculaActor) o;
        return Objects.equals(filmId, that.filmId) && Objects.equals(actorId, that.actorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, actorId);
    }
}
