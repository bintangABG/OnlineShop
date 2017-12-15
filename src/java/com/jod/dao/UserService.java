/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jod.dao;

import com.jod.model.TblCustomer;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */
@Repository
@Transactional
public class UserService {
    static final Logger logger = Logger.getLogger(UserService.class.getName());

    @PersistenceUnit
    EntityManagerFactory emf;

    private EntityManager em;
    
    @Transactional
    public void saveCustomer(TblCustomer customer) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();
        em.close();
    }
    
    public TblCustomer findByUsername(String username) {
        TblCustomer customer = new TblCustomer();
        try {
            em = emf.createEntityManager();
            Query query = em.createQuery("Select c from TblCustomer c where c.username = :username");
            query.setParameter("username", username);
            customer = (TblCustomer) query.getSingleResult();
        } catch (NoResultException nre) {
            logger.severe("Username tidak ada");
        }
        return customer;
    }
    
    
    
     /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }
}
