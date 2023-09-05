package com.techchallenges.faseDois.services;

import java.util.List;
import java.util.UUID;

public interface BaseService<D> {

    public D save(D dto);

    public List<D> getAll();

    public D getById(UUID id);

    public void delete(UUID id);

    public D update(D dto);
}
