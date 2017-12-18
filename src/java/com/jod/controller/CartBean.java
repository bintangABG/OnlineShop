/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jod.controller;

import com.jod.model.TblProduct;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class CartBean {
     private Map<Integer, TblProduct> carts;
     
     public CartBean(Map<Integer, TblProduct> carts) {
        this.carts = carts;
    }

    public CartBean() {
        carts = new HashMap<>();
    }

    /**
     * @return the carts
     */
    public Map<Integer, TblProduct> getCarts() {
        return carts;
    }

    /**
     * @param carts the carts to set
     */
    public void setCarts(Map<Integer, TblProduct> carts) {
        this.carts = carts;
    }
}
