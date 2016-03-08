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
import javax.persistence.ManyToOne;

/**
 *
 * @author 3092790
 */
@Entity
public class DistanceGare implements Serializable {
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
        if (!(object instanceof DistanceGare)) {
            return false;
        }
        DistanceGare other = (DistanceGare) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "package_entite.DistanceGare[ id=" + id + " ]";
    }
    
    private double distanceGare;

    /**
     * Get the value of distanceGare
     *
     * @return the value of distanceGare
     */
    public double getDistanceGare() {
        return distanceGare;
    }

    /**
     * Set the value of distanceGare
     *
     * @param distanceGare new value of distanceGare
     */
    public void setDistanceGare(double distanceGare) {
        this.distanceGare = distanceGare;
    }

    @ManyToOne
    private Gare laGare;

    /**
     * Get the value of laGare
     *
     * @return the value of laGare
     */
    public Gare getLaGare() {
        return laGare;
    }

    /**
     * Set the value of laGare
     *
     * @param laGare new value of laGare
     */
    public void setLaGare(Gare laGare) {
        this.laGare = laGare;
    }

    @ManyToOne
    private Ligne laLigne;

    /**
     * Get the value of laLigne
     *
     * @return the value of laLigne
     */
    public Ligne getLaLigne() {
        return laLigne;
    }

    /**
     * Set the value of laLigne
     *
     * @param laLigne new value of laLigne
     */
    public void setLaLigne(Ligne laLigne) {
        this.laLigne = laLigne;
    }

}
