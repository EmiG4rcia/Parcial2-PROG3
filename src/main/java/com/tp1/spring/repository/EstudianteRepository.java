package com.tp1.spring.repository;

import com.tp1.spring.entity.Curso;
import com.tp1.spring.entity.Estudiante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends BaseRepository<Estudiante,Long> {
    //Devuelve todos los cursos del estudiante con el, id que enviemos como parametro
    //id seria el id de estudiante
    @Query("SELECT e.cursos FROM Estudiante e WHERE e.id = :id")
    List<Curso> findCursosById(Long id);
}
