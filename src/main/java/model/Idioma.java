package model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "language")
public class Idioma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private int languageId;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(name = "last_update", nullable = false)
    private LocalDateTime lastUpdate;

    // Constructors, getters and setters

    public Idioma() {
    }

    public Idioma(String name) {
        this.name = name;
    }

    public int getLanguageId() {
        return languageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
}

