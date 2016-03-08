/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import package_entite.Coordonnees_bancaires;

/**
 *
 * @author 3092790
 */
@Stateless
public class Coordonnees_bancairesFacade extends AbstractFacade<Coordonnees_bancaires> implements Coordonnees_bancairesFacadeLocal {
    @PersistenceContext(unitName = "STF-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Coordonnees_bancairesFacade() {
        super(Coordonnees_bancaires.class);
    }
    
}
