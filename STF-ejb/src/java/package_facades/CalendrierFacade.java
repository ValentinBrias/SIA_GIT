/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import package_entite.Calendrier;

/**
 *
 * @author 3092790
 */
@Stateless
public class CalendrierFacade extends AbstractFacade<Calendrier> implements CalendrierFacadeLocal {
    @PersistenceContext(unitName = "STF-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CalendrierFacade() {
        super(Calendrier.class);
    }
    
}
