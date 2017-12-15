/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jod.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "TBL_CUSTOMER")
@NamedQueries({
    @NamedQuery(name = "TblCustomer.findAll", query = "SELECT t FROM TblCustomer t")
    , @NamedQuery(name = "TblCustomer.findById", query = "SELECT t FROM TblCustomer t WHERE t.id = :id")
    , @NamedQuery(name = "TblCustomer.findByAlamat", query = "SELECT t FROM TblCustomer t WHERE t.alamat = :alamat")
    , @NamedQuery(name = "TblCustomer.findByEmail", query = "SELECT t FROM TblCustomer t WHERE t.email = :email")
    , @NamedQuery(name = "TblCustomer.findByFirstname", query = "SELECT t FROM TblCustomer t WHERE t.firstname = :firstname")
    , @NamedQuery(name = "TblCustomer.findByLastname", query = "SELECT t FROM TblCustomer t WHERE t.lastname = :lastname")
    , @NamedQuery(name = "TblCustomer.findByNotelp", query = "SELECT t FROM TblCustomer t WHERE t.notelp = :notelp")
    , @NamedQuery(name = "TblCustomer.findByPassword", query = "SELECT t FROM TblCustomer t WHERE t.password = :password")
    , @NamedQuery(name = "TblCustomer.findByUsername", query = "SELECT t FROM TblCustomer t WHERE t.username = :username")})
public class TblCustomer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ALAMAT")
    private String alamat;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Column(name = "LASTNAME")
    private String lastname;
    @Column(name = "NOTELP")
    private String notelp;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "USERNAME")
    private String username;

    public TblCustomer() {
    }

    public TblCustomer(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCustomer)) {
            return false;
        }
        TblCustomer other = (TblCustomer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jod.model.TblCustomer[ id=" + id + " ]";
    }
    
}
