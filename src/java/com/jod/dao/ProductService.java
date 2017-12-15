/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jod.dao;

import com.jod.model.TblProduct;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */
@Repository
@Transactional
public class ProductService {
    
    @PersistenceContext
    private EntityManager em;

    public ProductService() {
    }

    public ProductService(EntityManager em) {
        this.em = em;
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
    
    public List<TblProduct> findAll() {
        List<TblProduct> products = em.createQuery("select e from TblProduct e").getResultList();
//        products = this.em.createNamedQuery("TblProduct.findAll").getResultList();
        return products;
    }
    public TblProduct findById(Integer productId) {
        return em.find(TblProduct.class, productId);
    }
}
