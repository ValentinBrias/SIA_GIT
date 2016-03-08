/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import package_entite.Porte_Monnaie;

/**
 *
 * @author 3092790
 */
@Stateless
public class Porte_MonnaieFacade extends AbstractFacade<Porte_Monnaie> implements Porte_MonnaieFacadeLocal {
    @PersistenceContext(unitName = "STF-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Porte_MonnaieFacade() {
        super(Porte_Monnaie.class);
    }
    
}
