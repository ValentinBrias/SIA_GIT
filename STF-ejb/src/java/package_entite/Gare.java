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
public class Gare implements Serializable {
    @OneToMany(mappedBy = "laGare")
    private List<DistanceGare> lesDistanceGares;
    @OneToMany(mappedBy = "gareArrivee")
    private List<Ligne> lesLignesArrivee;

    public List<Ligne> getLesLignesArrivee() {
        return lesLignesArrivee;
    }
    @OneToMany(mappedBy = "laGare")
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


    public void setLesLignesArrivee(List<Ligne> lesLignesArrivee) {
        this.lesLignesArrivee = lesLignesArrivee;
    }

    public List<Ligne> getLesLignesDepart() {
        return lesLignesDepart;
    }

    public void setLesLignesDepart(List<Ligne> lesLignesDepart) {
        this.lesLignesDepart = lesLignesDepart;
    }
    @OneToMany(mappedBy = "gareDepart")
    private List<Ligne> lesLignesDepart;
    @OneToMany(mappedBy = "gareArrivee")
    private List<Trajet> lesTrajetsArrivee;

    public List<Trajet> getLesTrajetsArrivee() {
        return lesTrajetsArrivee;
    }

    public void setLesTrajetsArrivee(List<Trajet> lesTrajetsArrivee) {
        this.lesTrajetsArrivee = lesTrajetsArrivee;
    }

    public List<Trajet> getLesTrajetsDepart() {
        return lesTrajetsDepart;
    }

    public void setLesTrajetsDepart(List<Trajet> lesTrajetsDepart) {
        this.lesTrajetsDepart = lesTrajetsDepart;
    }
    @OneToMany(mappedBy = "gareDepart")
    private List<Trajet> lesTrajetsDepart;
    
    @ManyToMany(mappedBy = "lesGares")
    @JoinTable(name="LIGNE_GARE", 
    joinColumns=@JoinColumn(name="LESGARES_ID"),
    inverseJoinColumns=@JoinColumn(name="LESLIGNES_ID"))
    private List<Ligne> lesLignes;

    public List<Ligne> getLesLignes() {
        return lesLignes;
    }

    public void setLesLignes(List<Ligne> lesLignes) {
        this.lesLignes = lesLignes;
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
        if (!(object instanceof Gare)) {
            return false;
        }
        Gare other = (Gare) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "package_entite.Gare[ id=" + id + " ]";
    }
    
    private String nomGare;

    /**
     * Get the value of nomGare
     *
     * @return the value of nomGare
     */
    public String getNomGare() {
        return nomGare;
    }

    /**
     * Set the value of nomGare
     *
     * @param nomGare new value of nomGare
     */
    public void setNomGare(String nomGare) {
        this.nomGare = nomGare;
    }

    private String adresse;

   
    public String getAdresse() {
        return adresse;
    }

    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }



}
