/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_entite;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author 3092790
 */
@Entity
public class Horaire implements Serializable {
    @ManyToOne
    private Gare laGare;

    public Gare getLaGare() {
        return laGare;
    }

    public void setLaGare(Gare laGare) {
        this.laGare = laGare;
    }
    
    @ManyToOne
    private Ligne laLigne;

    public Ligne getLaLigne() {
        return laLigne;
    }

    public void setLaLigne(Ligne laLigne) {
        this.laLigne = laLigne;
    }
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
        if (!(object instanceof Horaire)) {
            return false;
        }
        Horaire other = (Horaire) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "package_entite.Horaire[ id=" + id + " ]";
    }
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private java.util.Date dateHoraire;

    /**
     * Get the value of dateHoraire
     *
     * @return the value of dateHoraire
     */
    public java.util.Date getDateHoraire() {
        return dateHoraire;
    }

    /**
     * Set the value of dateHoraire
     *
     * @param dateHoraire new value of dateHoraire
     */
    public void setDateHoraire(java.util.Date dateHoraire) {
        this.dateHoraire = dateHoraire;
    }

}
