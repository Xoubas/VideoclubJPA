package model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity

@Table(name = "category")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer categoryId;

    @Column(length = 25)
    private String name;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    //Relations
    @ManyToMany(mappedBy = "categorias", fetch = FetchType.LAZY)
    private List<Pelicula> peliculas;

    public Categoria() {
    }

    public Categoria(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
}
