/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import package_entite.Hebdomadaire;

/**
 *
 * @author 3092790
 */
@Stateless
public class HebdomadaireFacade extends AbstractFacade<Hebdomadaire> implements HebdomadaireFacadeLocal {
    @PersistenceContext(unitName = "STF-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HebdomadaireFacade() {
        super(Hebdomadaire.class);
    }
    
}
