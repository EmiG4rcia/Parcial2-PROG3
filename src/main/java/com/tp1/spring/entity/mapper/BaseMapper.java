package com.tp1.spring.entity.mapper;

public interface BaseMapper <E,D,DC>{
    public E toEntity(DC dc);
    public D toDto(E e);
}
