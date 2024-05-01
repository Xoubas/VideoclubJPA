package model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "rental")
public class Alquiler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rental_id")
    private Integer rentalId;

    @Column(name = "rental_date", nullable = false)
    private LocalDateTime rentalDate;

    @Column(name = "return_date", nullable = false)
    private LocalDateTime returnDate;

    @Column(name = "last_update, nullable=false")
    private LocalDateTime lastUpdate;

    // Relations
    @ManyToOne
    @JoinColumn(name = "inventory_id", nullable = false)
    private Inventario inventario;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "staff_id", nullable = false)
    private Empleado empleado;

    @OneToMany(mappedBy = "alquiler")
    private List<Pago> pagos;

    public Alquiler() {
    }

    public Alquiler(Integer rentalId, LocalDateTime rentalDate, LocalDateTime returnDate, LocalDateTime lastUpdate, Inventario inventario, Cliente cliente, Empleado empleado, List<Pago> pagos) {
        this.rentalId = rentalId;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.lastUpdate = lastUpdate;
        this.inventario = inventario;
        this.cliente = cliente;
        this.empleado = empleado;
        this.pagos = pagos;
    }

    public Integer getRentalId() {
        return rentalId;
    }

    public void setRentalId(Integer rentalId) {
        this.rentalId = rentalId;
    }

    public LocalDateTime getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDateTime rentalDate) {
        this.rentalDate = rentalDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }
}
