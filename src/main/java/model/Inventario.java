package model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "inventory")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id", nullable = false)
    private Integer id;
    @OneToMany
    private Pelicula pelicula;

    @ManyToOne
    @JoinColumn(name = "store_id", nullable = false)
    private Tienda tienda;
    @Column(name = "last_update", nullable = false)
    private LocalDateTime lastUpdate;

    public Inventario() {
    }

    public Inventario(Pelicula pelicula, Tienda tienda) {
        this.pelicula = pelicula;
        this.tienda = tienda;
    }

    public Integer getId() {
        return id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
}
