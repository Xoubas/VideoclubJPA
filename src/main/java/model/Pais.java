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
    private Integer id;

    @Column(name = "country", length = 50)
    private String name;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    // Relations
    @OneToMany(mappedBy = "pais")
    private List<Ciudad> ciudades;

    public Pais() {
    }

    public Pais(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
}
