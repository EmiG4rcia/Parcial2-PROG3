package com.tp1.spring.repository;

import com.tp1.spring.entity.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<E extends Base, ID> extends JpaRepository<E,ID> {
    List<E> findAllByEliminadoFalse();

    public default List<E> findAll(){
        return findAllByEliminadoFalse();
    }
    public default void deleteById(ID id){
        E e = getById(id);
        e.setEliminado(true);
        save(e);
    }

    public Optional<E> findByIdAndEliminadoFalse(ID id);

    public default E getById(ID id){
        return findByIdAndEliminadoFalse(id).orElseThrow(() -> new NullPointerException("No se encontro o esta eliminada la entidad con id " + id));
    }

}