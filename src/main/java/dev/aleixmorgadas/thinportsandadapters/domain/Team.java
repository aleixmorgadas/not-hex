package dev.aleixmorgadas.thinportsandadapters.domain;

import jakarta.persistence.*;

import java.util.UUID;


@Entity(name = "teams")
class Team {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;

    public Team(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public Team() {
    }

    public UUID id() {
        return id;
    }

    public String name() {
        return name;
    }
}