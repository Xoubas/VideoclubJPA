package model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "country")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private int id;

    @Column(name = "country", length = 50)
    private String name;

    @OneToMany(mappedBy = "pais")
    private List<Ciudad> ciudades;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    public Pais() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
}
