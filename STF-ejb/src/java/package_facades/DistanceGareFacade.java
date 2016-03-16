/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import package_entite.DistanceGare;
import package_entite.Gare;
import package_entite.Ligne;

/**
 *
 * @author 3099709
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
    public void CreerDistance(Gare gare, Ligne ligne, double distance) {
        DistanceGare d = new DistanceGare();
        d.setLaGare(gare);
        d.setLaLigne(ligne);
        d.setDistanceGare(distance);
        em.persist(d);
    }
    
}
