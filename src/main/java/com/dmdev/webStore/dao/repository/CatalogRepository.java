package com.dmdev.webStore.dao.repository;

import com.dmdev.webStore.entity.Catalog;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class CatalogRepository extends RepositoryBase<Integer, Catalog> {
    public CatalogRepository(EntityManager entityManager) {
        super(Catalog.class, entityManager);
    }
}
