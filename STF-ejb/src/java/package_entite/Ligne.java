/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_entite;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author 3092790
 */
@Entity
public class Ligne implements Serializable {
    @OneToMany(mappedBy = "laLigne")
    private List<DistanceGare> lesDistanceGares;
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
        if (!(object instanceof Ligne)) {
            return false;
        }
        Ligne other = (Ligne) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "package_entite.Ligne[ id=" + id + " ]";
    }
    
    @Column (unique = true)
    private int numLigne;

    /**
     * Get the value of numLigne
     *
     * @return the value of numLigne
     */
    public int getNumLigne() {
        return numLigne;
    }

    /**
     * Set the value of numLigne
     *
     * @param numLigne new value of numLigne
     */
    public void setNumLigne(int numLigne) {
        this.numLigne = numLigne;
    }

    @ManyToOne
    private Gare gareDepart; //départ de la ligne

    /**
     * Get the value of gareA
     *
     * @return the value of gareA
     */
    public Gare getGareDepart() {
        return gareDepart;
    }

    
    public void setGareDepart(Gare gareDepart) {
        this.gareDepart = gareDepart;
    }

    @ManyToOne
    private Gare gareArrivee; //terminus de la ligne

    
    public Gare getGareArrivee() {
        return gareArrivee;
    }

  
    public void setGareArrivee(Gare gareArrivee) {
        this.gareArrivee = gareArrivee;
    }

    private int nbGare;

    /**
     * Get the value of nbGare
     *
     * @return the value of nbGare
     */
    public int getNbGare() {
        return nbGare;
    }

    /**
     * Set the value of nbGare
     *
     * @param nbGare new value of nbGare
     */
    public void setNbGare(int nbGare) {
        this.nbGare = nbGare;
    }

    @ManyToMany
    private List<Train> lesTrains;

    /**
     * Get the value of lesTrains
     *
     * @return the value of lesTrains
     */
    public List<Train> getLesTrains() {
        return lesTrains;
    }

    /**
     * Set the value of lesTrains
     *
     * @param lesTrains new value of lesTrains
     */
    public void setLesTrains(List<Train> lesTrains) {
        this.lesTrains = lesTrains;
    }

    @OneToMany(mappedBy = "laLigne")
    private List<Horaire> lesHoraires;

    /**
     * Get the value of lesHoraires
     *
     * @return the value of lesHoraires
     */
    public List<Horaire> getLesHoraires() {
        return lesHoraires;
    }

    /**
     * Set the value of lesHoraires
     *
     * @param lesHoraires new value of lesHoraires
     */
    public void setLesHoraires(List<Horaire> lesHoraires) {
        this.lesHoraires = lesHoraires;
    }

    @ManyToMany
    private List<Gare> lesGares;

    /**
     * Get the value of lesGares
     *
     * @return the value of lesGares
     */
    public List<Gare> getLesGares() {
        return lesGares;
    }

    /**
     * Set the value of lesGares
     *
     * @param lesGares new value of lesGares
     */
    public void setLesGares(List<Gare> lesGares) {
        this.lesGares = lesGares;
    }

}
