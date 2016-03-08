/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import package_entite.Gare;
import package_entite.Ligne;

/**
 *
 * @author 3092790
 */
@Stateless
public class LigneFacade extends AbstractFacade<Ligne> implements LigneFacadeLocal {
    @PersistenceContext(unitName = "STF-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LigneFacade() {
        super(Ligne.class);
    }

    @Override
    public void CreerLigne(int num, Gare gareDepart, Gare gareArrivee, int nbGares) {
        Ligne ligne = new Ligne(); 
        ligne.setNumLigne(num); 
        ligne.setGareDepart(gareDepart);
        ligne.setGareArrivee(gareArrivee);
        ligne.setNbGare(nbGares);
        em.persist(ligne);
    }

    @Override
    public Ligne RechercherLigneParId(long id) {
        Ligne l;
        String txt = "SELECT l FROM Ligne AS l WHERE l.id=:id";
        Query req = getEntityManager().createQuery(txt);
        req = req.setParameter("id", id);
        l = (Ligne) req.getSingleResult();
        return l;
    }

    @Override
    public void SupprimerLigne(long id) {
        Ligne l = RechercherLigneParId(id);
        em.remove(l);
    }

    @Override
    public void ModifierLigne(long id, int num, Gare gareDepart, Gare gareArrivee, int nbGares) {
        Ligne ligne = RechercherLigneParId(id); 
        ligne.setNumLigne(num); 
        ligne.setGareDepart(gareDepart);
        ligne.setGareArrivee(gareArrivee);
        ligne.setNbGare(nbGares);
        em.merge(ligne);
    }

    @Override
    public Ligne RechercherLigneParNum(int num) {
        Ligne l;
        String txt = "SELECT l FROM Ligne AS l WHERE l.numLigne=:num";
        Query req = getEntityManager().createQuery(txt);
        req = req.setParameter("num", num);
        l = (Ligne) req.getSingleResult();
        return l;
    }
    
}
