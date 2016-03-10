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
import package_entite.AbstractFacade;
import package_entite.DistanceGare;
import package_entite.Gare;
import package_entite.Ligne;

/**
 *
 * @author vanna
 */
@Stateless
public class DistanceGareFacade extends AbstractFacade<DistanceGare> implements DistanceGareFacadeLocal {
    @PersistenceContext(unitName = "STF-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DistanceGareFacade() {
        super(DistanceGare.class);
    }

    @Override
    public void AjouterDistance(double nbkm, Ligne ligne, Gare gare) {
        DistanceGare d = new DistanceGare();
        d.setDistanceGare(nbkm);
        d.setLaLigne(ligne);
        d.setLaGare(gare);
        em.persist(d);
    }

    @Override
    public DistanceGare RechercherDistanceParID(long id) {
        DistanceGare d;
        String txt = "SELECT d FROM DistanceGare AS d WHERE d.id=:id";
        Query req = getEntityManager().createQuery(txt);
        req = req.setParameter("id", id);
        d = (DistanceGare) req.getSingleResult();
        return d;
    }

    @Override
    public void ModifierDistance(double nouvelledistance, DistanceGare distance) {
        distance.setDistanceGare(nouvelledistance);
        em.merge(distance);
    }

    @Override
    public void SupprimerDistance(long id) {
        DistanceGare d = RechercherDistanceParID(id);
        em.remove(d);
    }

    @Override
    public List <DistanceGare> RetournerDistance() {
        List <DistanceGare> listeDistance;
        DistanceGare d = null;
        String txt = "SELECT d FROM DistanceGare as d order by ASC d.distancegare";
        Query req = getEntityManager().createQuery(txt);
        listeDistance = req.getResultList();
        return listeDistance;
    }
    
}
