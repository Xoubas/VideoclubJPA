package model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "store")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "staff_id", nullable = false)
    private Empleado manager;

    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Direccion direccion;

    @Column(name = "last_update", nullable = false)
    private LocalDateTime lastUpdate;

    public Tienda() {
    }

    public Tienda(Empleado manager, Direccion direccion) {
        this.manager = manager;
        this.direccion = direccion;
    }

    public Integer getId() {
        return id;
    }

    public Empleado getManager() {
        return manager;
    }

    public void setManager(Empleado manager) {
        this.manager = manager;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
}
