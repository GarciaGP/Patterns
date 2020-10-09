package br.com.fiap.pousada.generics;

import java.util.List;

public interface DAO<T> {
    List<T> findAll();
    T findById(long id);
    void save(T t);
    void update(T t);
    void delete(long id);
}
