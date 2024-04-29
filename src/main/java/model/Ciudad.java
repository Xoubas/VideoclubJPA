package model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "city")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id", nullable = false)
    private Integer id;

    @Column(name="city", length = 50, nullable = false)
    private String ciudad;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Pais pais;

    @OneToMany
    private List<Direccion> direcciones;

    @Column(name="last_update")
    private LocalDateTime lastUpdate;
}
