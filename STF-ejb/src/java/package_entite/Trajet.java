/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_entite;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author 3092790
 */
@Entity
public class Trajet implements Serializable {
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
        if (!(object instanceof Trajet)) {
            return false;
        }
        Trajet other = (Trajet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "package_entite.Trajet[ id=" + id + " ]";
    }
    
    @ManyToOne
    private Gare gareDepart;

    /**
     * Get the value of gareDepart
     *
     * @return the value of gareDepart
     */
    public Gare getGareDepart() {
        return gareDepart;
    }

    /**
     * Set the value of gareDepart
     *
     * @param gareDepart new value of gareDepart
     */
    public void setGareDepart(Gare gareDepart) {
        this.gareDepart = gareDepart;
    }

    @ManyToOne
    private Gare gareArrivee;

    /**
     * Get the value of gareArrivee
     *
     * @return the value of gareArrivee
     */
    public Gare getGareArrivee() {
        return gareArrivee;
    }

    /**
     * Set the value of gareArrivee
     *
     * @param gareArrivee new value of gareArrivee
     */
    public void setGareArrivee(Gare gareArrivee) {
        this.gareArrivee = gareArrivee;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date heureDepart;

    /**
     * Get the value of heureDepart
     *
     * @return the value of heureDepart
     */
    public Date getHeureDepart() {
        return heureDepart;
    }

    /**
     * Set the value of heureDepart
     *
     * @param heureDepart new value of heureDepart
     */
    public void setHeureDepart(Date heureDepart) {
        this.heureDepart = heureDepart;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date heureArrivee;

    /**
     * Get the value of heureArrivee
     *
     * @return the value of heureArrivee
     */
    public Date getHeureArrivee() {
        return heureArrivee;
    }

    /**
     * Set the value of heureArrivee
     *
     * @param heureArrivee new value of heureArrivee
     */
    public void setHeureArrivee(Date heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    private double distanceParcourue;

    /**
     * Get the value of distanceParcourue
     *
     * @return the value of distanceParcourue
     */
    public double getDistanceParcourue() {
        return distanceParcourue;
    }

    /**
     * Set the value of distanceParcourue
     *
     * @param distanceParcourue new value of distanceParcourue
     */
    public void setDistanceParcourue(double distanceParcourue) {
        this.distanceParcourue = distanceParcourue;
    }

    private double tarif;

    /**
     * Get the value of tarif
     *
     * @return the value of tarif
     */
    public double getTarif() {
        return tarif;
    }

    /**
     * Set the value of tarif
     *
     * @param tarif new value of tarif
     */
    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    private int tempsTrajet; //en minutes

    /**
     * Get the value of tempsTrajet
     *
     * @return the value of tempsTrajet
     */
    public int getTempsTrajet() {
        return tempsTrajet;
    }

    /**
     * Set the value of tempsTrajet
     *
     * @param tempsTrajet new value of tempsTrajet
     */
    public void setTempsTrajet(int tempsTrajet) {
        this.tempsTrajet = tempsTrajet;
    }

}
