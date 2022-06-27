package com.datapersist.datapersist.data.repositories;

public interface DefaultRepo<T> {
    public void create(T entity);
    public T read(int id);
    public void update(T entity);
    public void delete(T entity);
}
