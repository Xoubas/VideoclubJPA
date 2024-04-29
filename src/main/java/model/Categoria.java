package model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity

@Table(name = "category")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int categoryId;

    @Column(length = 25)
    private String name;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    public Categoria() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
}
