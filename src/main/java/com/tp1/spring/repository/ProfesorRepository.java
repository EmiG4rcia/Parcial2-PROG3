package com.tp1.spring.repository;

import com.tp1.spring.entity.Profesor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends BaseRepository<Profesor, Long> {
}
