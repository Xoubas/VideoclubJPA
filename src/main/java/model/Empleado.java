package model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "staff")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id")
    private Integer id;

    @Column(name = "first_name", length = 45, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 45, nullable = false)
    private String lastName;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(nullable = false)
    private boolean active;

    @Column(length = 16, nullable = false)
    private String username;

    @Column(length = 40, nullable = false)
    private String password;

    @Column(name = "last_update", nullable = false)
    private LocalDateTime lastUpdate;

    // Relations
    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Direccion direccion;

    @ManyToOne
    @JoinColumn(name = "store_id", nullable = false)
    private Tienda tienda;

    @OneToMany(mappedBy = "empleado")
    private List<Alquiler> alquileres;

    @OneToMany(mappedBy = "empleado")
    private List<Pago> pagos;

    public Empleado() {
    }

    public Empleado(String firstName, String lastName, Direccion direccion, String email, boolean active, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.direccion = direccion;
        this.email = email;
        this.active = active;
        this.username = username;
        this.password = password;
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
}
