package model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table
@IdClass(ClaveCategoriaPelicula.class)
public class CategoriaPelicula {
    @Id
    @Column(name = "film_id")
    private Integer filmId;

    @Id
    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "last_update", nullable = false)
    private LocalDateTime lastUpdate;

    public CategoriaPelicula() {
    }

    public CategoriaPelicula(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "CategoriaPelicula{" +
                "filmId=" + filmId +
                ", categoryId=" + categoryId +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
