package model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "payment")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Integer id;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal amount;

    @Column(name = "payment_date", nullable = false)
    private LocalDateTime paymentDate;

    // Relations
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "staff_id", nullable = false)
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "rental_id", nullable = false)
    private Alquiler alquiler;

    public Pago() {
    }

    public Pago(Integer id, BigDecimal amount, LocalDateTime paymentDate, Cliente cliente, Empleado empleado, Alquiler alquiler) {
        this.id = id;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.cliente = cliente;
        this.empleado = empleado;
        this.alquiler = alquiler;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
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

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }
}
