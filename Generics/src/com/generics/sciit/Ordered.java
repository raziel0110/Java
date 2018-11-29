package com.generics.sciit;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ordered<T> implements Repo<T> {
    private Set<T> repo;

    public Ordered(Set<T> list) {
        this.repo = new LinkedHashSet<>();
    }

    @Override
    public void save(T obj) {
        repo.add(obj);
    }

    @Override
    public void remove(T obj) {
        repo.remove(obj);
    }

    @Override
    public Set listAll() {
        return Collections.unmodifiableSet(repo);
    }

    @Override
    public int count() {
        return repo.size();
    }

    @Override
    public void sort() {

    }
}
