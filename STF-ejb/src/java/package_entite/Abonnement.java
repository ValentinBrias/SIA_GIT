/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_entite;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author 3092790
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Abonnement extends Type_Paiement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Abonnement)) {
            return false;
        }
        Abonnement other = (Abonnement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "package_entite.Abonnement[ id=" + id + " ]";
    }
    
    private String nomAbonnement;

    /**
     * Get the value of nomAbonnement
     *
     * @return the value of nomAbonnement
     */
    public String getNomAbonnement() {
        return nomAbonnement;
    }

    /**
     * Set the value of nomAbonnement
     *
     * @param nomAbonnement new value of nomAbonnement
     */
    public void setNomAbonnement(String nomAbonnement) {
        this.nomAbonnement = nomAbonnement;
    }

    private double tauxReduction;

    /**
     * Get the value of tauxReduction
     *
     * @return the value of tauxReduction
     */
    public double getTauxReduction() {
        return tauxReduction;
    }

    /**
     * Set the value of tauxReduction
     *
     * @param tauxReduction new value of tauxReduction
     */
    public void setTauxReduction(double tauxReduction) {
        this.tauxReduction = tauxReduction;
    }

}
