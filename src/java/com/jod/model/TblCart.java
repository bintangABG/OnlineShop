/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jod.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "TBL_CART")
@NamedQueries({
    @NamedQuery(name = "TblCart.findAll", query = "SELECT t FROM TblCart t")
    , @NamedQuery(name = "TblCart.findById", query = "SELECT t FROM TblCart t WHERE t.id = :id")
    , @NamedQuery(name = "TblCart.findByJumlah", query = "SELECT t FROM TblCart t WHERE t.jumlah = :jumlah")
    , @NamedQuery(name = "TblCart.findByTotalharga", query = "SELECT t FROM TblCart t WHERE t.totalharga = :totalharga")})
public class TblCart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "JUMLAH")
    private Integer jumlah;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTALHARGA")
    private Double totalharga;
    @JoinTable(name = "TBL_CART_TBL_PRODUCT", joinColumns = {
        @JoinColumn(name = "CART_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "LISTITEMS_ID", referencedColumnName = "ID")})
    @ManyToMany
    private List<TblProduct> tblProductList;

    public TblCart() {
    }

    public TblCart(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public Double getTotalharga() {
        return totalharga;
    }

    public void setTotalharga(Double totalharga) {
        this.totalharga = totalharga;
    }

    public List<TblProduct> getTblProductList() {
        return tblProductList;
    }

    public void setTblProductList(List<TblProduct> tblProductList) {
        this.tblProductList = tblProductList;
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
        if (!(object instanceof TblCart)) {
            return false;
        }
        TblCart other = (TblCart) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jod.model.TblCart[ id=" + id + " ]";
    }
    
}
