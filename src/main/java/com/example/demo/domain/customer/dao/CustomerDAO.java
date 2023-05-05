package com.example.demo.domain.customer.dao;

import com.example.demo.domain.customer.entity.TCustomer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerDAO {

    @PersistenceContext
    EntityManager entityManager;

    public Optional<TCustomer> getCustomerById(Long idCustomer) {
        String sql = """
                select t from TCustomer t where t.id = idCustomer""";
        TCustomer result;
        try {
            result = (TCustomer) entityManager.createQuery(sql)
                    .setParameter("idCustomer", idCustomer)
                    .getSingleResult();
        } catch (NoResultException e) {
            result = null;
        }
        return Optional.ofNullable(result);
    }
}
