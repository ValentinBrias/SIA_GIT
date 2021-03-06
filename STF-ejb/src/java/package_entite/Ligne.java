/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_entite;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author 3092790
 */
@Entity
public class Ligne implements Serializable {
    
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

    public int getNumLigne() {
        return numLigne;
    }

    public void setNumLigne(int numLigne) {
        this.numLigne = numLigne;
    }

    @ManyToOne
    private Gare gareDepart; //départ de la ligne

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

    public int getNbGare() {
        return nbGare;
    }

    public void setNbGare(int nbGare) {
        this.nbGare = nbGare;
    }

    @OneToMany(mappedBy = "laLigne" , cascade = CascadeType.REMOVE)
    private List<DistanceGare> lesDistanceGares;

    public List<DistanceGare> getLesDistanceGares() {
        return lesDistanceGares;
    }

    public void setLesDistanceGares(List<DistanceGare> lesDistanceGares) {
        this.lesDistanceGares = lesDistanceGares;
    }

    @OneToMany(mappedBy = "laLigne")
    private List<Horaire> lesHoraires;

    public List<Horaire> getLesHoraires() {
        return lesHoraires;
    }

    public void setLesHoraires(List<Horaire> lesHoraires) {
        this.lesHoraires = lesHoraires;
    }

    @ManyToMany
    private List<Gare> lesGares;

    public List<Gare> getLesGares() {
        return lesGares;
    }

    public void setLesGares(List<Gare> lesGares) {
        this.lesGares = lesGares;
    }

}
