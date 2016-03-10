/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import package_entite.DistanceGare;
import package_entite.Gare;
import package_entite.Ligne;

/**
 *
 * @author 3092790
 */
@Stateless
public class GareFacade extends AbstractFacade<Gare> implements GareFacadeLocal {
    @PersistenceContext(unitName = "STF-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GareFacade() {
        super(Gare.class);
    }

    @Override
    public void CreerGare(String nomGare, String adresse, List<Ligne> list) {
        Gare gare = new Gare(); 
        gare.setNomGare(nomGare); 
        gare.setAdresse(adresse);
        gare.setLesLignes(list);
        em.persist(gare); 
   }

    @Override
    public void ModifierGare(long id, String nom, String adresse, List<Ligne> list) {
        Gare gare = RechercherGareParId(id) ;
        gare.setNomGare(nom); 
        gare.setAdresse(adresse);
        gare.setLesLignes(list);
        em.merge(gare);
    }

    @Override
    public Gare RechercherGareParId(long id) {
        Gare g;
        String txt = "SELECT g FROM Gare AS g WHERE g.id=:id";
        Query req = getEntityManager().createQuery(txt);
        req = req.setParameter("id", id);
        g = (Gare) req.getSingleResult();
        return g;
    }

    @Override
    public void SupprimerGare(long id) {
        Gare g = RechercherGareParId(id);
        em.remove(g);
    }

    @Override
    public List<Gare> RetournerGares() {
        List<Gare> listeG;
        Gare g = null;
        String txt = "SELECT g FROM Gare as g";
        Query req = getEntityManager().createQuery(txt);
        listeG = req.getResultList();
        return listeG;
    }
    
}
