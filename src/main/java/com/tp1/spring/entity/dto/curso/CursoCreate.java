package com.tp1.spring.entity.dto.curso;

import com.tp1.spring.entity.Profesor;
import jakarta.persistence.ManyToOne;

public record CursoCreate (
    String nombre,
    Long profesorId){
}
