package com.tp1.spring.repository;

import com.tp1.spring.entity.Curso;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends BaseRepository<Curso,Long> {
}
