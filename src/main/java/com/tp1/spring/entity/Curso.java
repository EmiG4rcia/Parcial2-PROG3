package com.tp1.spring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Curso extends Base {
    private String nombre;

    @ManyToOne
    private Profesor profesor;

    @ManyToMany
    @JoinTable(name = "CURSO-ESTUDIANTE",
            joinColumns = @JoinColumn(name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name = "estudiante_id"))
    @Builder.Default
    Set<Estudiante> estudiantes = new HashSet<>();
}
