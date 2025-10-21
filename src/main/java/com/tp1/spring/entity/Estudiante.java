package com.tp1.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
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
public class Estudiante extends Base{
    private String nombre;
    private String matricula;

    @ManyToMany(mappedBy = "estudiantes")
    @Builder.Default
    Set<Curso> cursos = new HashSet<>();


}
