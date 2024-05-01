package model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "customer")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false)
    private Integer id;

    @Column(name = "first_name", length = 45, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 45, nullable = false)
    private String lastName;

    @Column(length = 50)
    private String email;

    @Column
    private boolean activebool;

    @Column(name = "create_date", nullable = false)
    private LocalDate createDate;

    @Column(name = "last_update", nullable = false)
    private LocalDateTime lastUpdate;

    @Column(nullable = false)
    private boolean active;

    //    Relations
    @ManyToOne
    @JoinColumn(name = "store_id", nullable = false)
    private Tienda tienda;

    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Direccion direccion;

    @OneToMany(mappedBy = "cliente")
    private List<Pago> pagos;


    public Cliente() {
    }

    public Cliente(Tienda tienda, String firstName, String lastName, String email, Direccion direccion, boolean activebool, LocalDate createDate, boolean active) {
        this.tienda = tienda;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.direccion = direccion;
        this.activebool = activebool;
        this.createDate = createDate;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public boolean isActivebool() {
        return activebool;
    }

    public void setActivebool(boolean activebool) {
        this.activebool = activebool;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
