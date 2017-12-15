/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jod.controller;

import com.jod.dao.UserService;
import com.jod.model.TblCustomer;
import com.jod.utils.PasswordDigest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/register")
public class RegistrationController {
    
    @Autowired
    UserService us;
   
    @RequestMapping() 
    public String registerForm(Model model) {
        RegisterFormBean registerBean = new RegisterFormBean();
        //registerBean.setLastName("Smith");
        model.addAttribute("registerBean", registerBean);
        return "registration";
    }
    
    @RequestMapping(value="/save") 
    public String saveRegistration(@ModelAttribute("registerBean") RegisterFormBean registerBean, 
            Model model) {
        TblCustomer customer = new TblCustomer();
        String encryptedPassword = 
                PasswordDigest.createEncryptedPassword(registerBean.getPassword());
        customer.setFirstname(registerBean.getFirstName());
        customer.setLastname(registerBean.getLastName());
        customer.setUsername(registerBean.getUsername());
        customer.setPassword(registerBean.getPassword());
        customer.setAlamat(registerBean.getAlamat());
        customer.setEmail(registerBean.getEmail());
        customer.setNotelp(registerBean.getNoTelp());
        
        us.saveCustomer(customer);
        
        model.addAttribute("data", registerBean);
        return "successregistration";
    }
}
