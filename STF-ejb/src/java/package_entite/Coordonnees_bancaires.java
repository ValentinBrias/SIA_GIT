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
public class Coordonnees_bancaires implements Serializable {
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
        if (!(object instanceof Coordonnees_bancaires)) {
            return false;
        }
        Coordonnees_bancaires other = (Coordonnees_bancaires) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "package_entite.Coordonnees_bancaires[ id=" + id + " ]";
    }
    
    private String banque;

    /**
     * Get the value of banque
     *
     * @return the value of banque
     */
    public String getBanque() {
        return banque;
    }

    /**
     * Set the value of banque
     *
     * @param banque new value of banque
     */
    public void setBanque(String banque) {
        this.banque = banque;
    }

    private String guichet;

    /**
     * Get the value of guichet
     *
     * @return the value of guichet
     */
    public String getGuichet() {
        return guichet;
    }

    /**
     * Set the value of guichet
     *
     * @param guichet new value of guichet
     */
    public void setGuichet(String guichet) {
        this.guichet = guichet;
    }

    private String numCompte;

    /**
     * Get the value of numCompte
     *
     * @return the value of numCompte
     */
    public String getNumCompte() {
        return numCompte;
    }

    /**
     * Set the value of numCompte
     *
     * @param numCompte new value of numCompte
     */
    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    private String cle;

    /**
     * Get the value of cle
     *
     * @return the value of cle
     */
    public String getCle() {
        return cle;
    }

    /**
     * Set the value of cle
     *
     * @param cle new value of cle
     */
    public void setCle(String cle) {
        this.cle = cle;
    }

    @ManyToOne
    private Client leClient;

    /**
     * Get the value of leClient
     *
     * @return the value of leClient
     */
    public Client getLeClient() {
        return leClient;
    }

    /**
     * Set the value of leClient
     *
     * @param leClient new value of leClient
     */
    public void setLeClient(Client leClient) {
        this.leClient = leClient;
    }

}
