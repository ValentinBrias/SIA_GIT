/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import package_entite.Type_Paiement;

/**
 *
 * @author 3092790
 */
@Stateless
public class Type_PaiementFacade extends AbstractFacade<Type_Paiement> implements Type_PaiementFacadeLocal {
    @PersistenceContext(unitName = "STF-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Type_PaiementFacade() {
        super(Type_Paiement.class);
    }
    
}
