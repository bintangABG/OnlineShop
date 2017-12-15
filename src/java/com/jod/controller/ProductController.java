/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jod.controller;

import com.jod.dao.ProductService;
import com.jod.model.TblProduct;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService ps;
    
    @RequestMapping(value = "/all")
    public String showAllProducts (Model model) {
        List<TblProduct> products = ps.findAll();
        model.addAttribute("products",products);
        return "product";
    }
    
    @RequestMapping(value = "/{productId}")
    public String showOneProduct (@PathVariable Integer productId, Model model) {
        TblProduct product = ps.findById(productId);
        model.addAttribute("product",product);
        return "productDetail";
    }
}
