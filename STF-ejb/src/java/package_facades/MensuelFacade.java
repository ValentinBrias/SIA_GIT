/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import package_entite.Mensuel;

/**
 *
 * @author 3092790
 */
@Stateless
public class MensuelFacade extends AbstractFacade<Mensuel> implements MensuelFacadeLocal {
    @PersistenceContext(unitName = "STF-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MensuelFacade() {
        super(Mensuel.class);
    }
    
}
