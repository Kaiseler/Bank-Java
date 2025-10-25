package com.bank.repository;

import java.util.List;

public interface GenericDAO <T, K> {
    public void add(T t);
    public T get(K k);
    public boolean remove(K k);
    public boolean update(T t, K k);
    //TODO: Perguntar ao António - o que fazer se k != t.getNif();
    public List<T> getAll();
}
