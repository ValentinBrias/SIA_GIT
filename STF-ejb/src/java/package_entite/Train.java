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
import javax.persistence.ManyToMany;

/**
 *
 * @author 3092790
 */
@Entity
public class Train implements Serializable {
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
        if (!(object instanceof Train)) {
            return false;
        }
        Train other = (Train) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "package_entite.Train[ id=" + id + " ]";
    }
    
    @ManyToMany (mappedBy = "lesTrains")
    private List<Ligne> lesLignes;

    /**
     * Get the value of lesLignes
     *
     * @return the value of lesLignes
     */
    public List<Ligne> getLesLignes() {
        return lesLignes;
    }

    /**
     * Set the value of lesLignes
     *
     * @param lesLignes new value of lesLignes
     */
    public void setLesLignes(List<Ligne> lesLignes) {
        this.lesLignes = lesLignes;
    }

}
