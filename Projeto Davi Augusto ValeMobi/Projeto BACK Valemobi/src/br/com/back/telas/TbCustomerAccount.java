/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.back.telas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author DaviAugustoKleiserdo
 */
@Entity
@Table(name = "tb_customer_account", catalog = "dbcliente", schema = "")
@NamedQueries({
    @NamedQuery(name = "TbCustomerAccount.findAll", query = "SELECT t FROM TbCustomerAccount t")
    , @NamedQuery(name = "TbCustomerAccount.findByIdCustomer", query = "SELECT t FROM TbCustomerAccount t WHERE t.idCustomer = :idCustomer")
    , @NamedQuery(name = "TbCustomerAccount.findByCpfCnpj", query = "SELECT t FROM TbCustomerAccount t WHERE t.cpfCnpj = :cpfCnpj")
    , @NamedQuery(name = "TbCustomerAccount.findByNmCustomer", query = "SELECT t FROM TbCustomerAccount t WHERE t.nmCustomer = :nmCustomer")
    , @NamedQuery(name = "TbCustomerAccount.findByIsActive", query = "SELECT t FROM TbCustomerAccount t WHERE t.isActive = :isActive")
    , @NamedQuery(name = "TbCustomerAccount.findByVlTotal", query = "SELECT t FROM TbCustomerAccount t WHERE t.vlTotal = :vlTotal")})
public class TbCustomerAccount implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_customer")
    private Integer idCustomer;
    @Basic(optional = false)
    @Column(name = "cpf_cnpj")
    private int cpfCnpj;
    @Basic(optional = false)
    @Column(name = "nm_customer")
    private String nmCustomer;
    @Basic(optional = false)
    @Column(name = "is_active")
    private Character isActive;
    @Basic(optional = false)
    @Column(name = "vl_total")
    private float vlTotal;

    public TbCustomerAccount() {
    }

    public TbCustomerAccount(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public TbCustomerAccount(Integer idCustomer, int cpfCnpj, String nmCustomer, Character isActive, float vlTotal) {
        this.idCustomer = idCustomer;
        this.cpfCnpj = cpfCnpj;
        this.nmCustomer = nmCustomer;
        this.isActive = isActive;
        this.vlTotal = vlTotal;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        Integer oldIdCustomer = this.idCustomer;
        this.idCustomer = idCustomer;
        changeSupport.firePropertyChange("idCustomer", oldIdCustomer, idCustomer);
    }

    public int getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(int cpfCnpj) {
        int oldCpfCnpj = this.cpfCnpj;
        this.cpfCnpj = cpfCnpj;
        changeSupport.firePropertyChange("cpfCnpj", oldCpfCnpj, cpfCnpj);
    }

    public String getNmCustomer() {
        return nmCustomer;
    }

    public void setNmCustomer(String nmCustomer) {
        String oldNmCustomer = this.nmCustomer;
        this.nmCustomer = nmCustomer;
        changeSupport.firePropertyChange("nmCustomer", oldNmCustomer, nmCustomer);
    }

    public Character getIsActive() {
        return isActive;
    }

    public void setIsActive(Character isActive) {
        Character oldIsActive = this.isActive;
        this.isActive = isActive;
        changeSupport.firePropertyChange("isActive", oldIsActive, isActive);
    }

    public float getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(float vlTotal) {
        float oldVlTotal = this.vlTotal;
        this.vlTotal = vlTotal;
        changeSupport.firePropertyChange("vlTotal", oldVlTotal, vlTotal);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCustomer != null ? idCustomer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbCustomerAccount)) {
            return false;
        }
        TbCustomerAccount other = (TbCustomerAccount) object;
        if ((this.idCustomer == null && other.idCustomer != null) || (this.idCustomer != null && !this.idCustomer.equals(other.idCustomer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.back.telas.TbCustomerAccount[ idCustomer=" + idCustomer + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
