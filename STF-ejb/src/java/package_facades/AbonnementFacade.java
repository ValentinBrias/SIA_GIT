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
import package_entite.Abonnement;
import package_entite.Type_Abonnement;

/**
 *
 * @author 3099709
 */
@Stateless
public class AbonnementFacade extends AbstractFacade<Abonnement> implements AbonnementFacadeLocal {
    @PersistenceContext(unitName = "STF-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AbonnementFacade() {
        super(Abonnement.class);
    }
    

    @Override
    public List <Abonnement> RetournerAbonnement() {
        List <Abonnement> listeA;
        Abonnement g = null;
        String txt = "SELECT g FROM Abonnement as g order by g.type ASC";
        Query req = getEntityManager().createQuery(txt);
        listeA = req.getResultList();
        return listeA;
    }

    @Override
    public void CreerAbonnement(double taux, Type_Abonnement type) {
        Abonnement abo = new Abonnement();
        abo.setTauxReduction(taux);
        abo.setType(type);
        em.persist(abo);
    }
    
}
