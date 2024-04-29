package model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "address")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer id;

    @Column(length = 50, nullable = false)
    private String address;

    @Column(name = "address2", length = 50)
    private String address2;

    @Column(length = 20, nullable = false)
    private String district;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private Ciudad city;

    @Column(name = "postal_code", length = 10)
    private String postalCode;

    @Column(length = 20, nullable = false)
    private String phone;

    @Column(name = "last_update", nullable = false)
    private LocalDateTime lastUpdate;

}
