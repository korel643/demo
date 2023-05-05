package com.example.demo.domain.product.dao;

import com.example.demo.domain.product.entity.TProduct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductDAO {

    @PersistenceContext
    EntityManager entityManager;

    public Optional<TProduct> getProductById(Long idProduct) {
        String sql = """
                select t from TProduct t where t.id = :idProduct
                """;
        TProduct result;
        try {
             result = (TProduct) entityManager.createQuery(sql)
                    .setParameter("idProduct", idProduct)
                    .getSingleResult();
        } catch (NoResultException e) {
            result = null;
        }

        return Optional.ofNullable(result);
    }
}
