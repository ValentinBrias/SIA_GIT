/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import package_entite.Gare;
import package_entite.Horaire;
import package_entite.Ligne;

/**
 *
 * @author 3092790
 */
@Stateless
public class HoraireFacade extends AbstractFacade<Horaire> implements HoraireFacadeLocal {
    @PersistenceContext(unitName = "STF-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HoraireFacade() {
        super(Horaire.class);
    }

    @Override
    public Horaire RechercherHoraireParId(long id) {
        Horaire h;
        String txt = "SELECT h FROM Horaire AS h WHERE h.id=:id";
        Query req = getEntityManager().createQuery(txt);
        req = req.setParameter("id", id);
        h = (Horaire) req.getSingleResult();
        return h;
    }

    @Override
    public void CreerHoraire(Date date, Ligne ligne, Gare gare) {
        Horaire h = new Horaire();
        h.setDateHoraire(date);
        h.setLaLigne(ligne);
        h.setLaGare(gare);
        em.persist(h);
    }

    @Override
    public void ModifierHoriaire(long id, Date date, Ligne ligne, Gare gare) {
        Horaire h = RechercherHoraireParId(id);
        h.setDateHoraire(date);
        h.setLaLigne(ligne);
        h.setLaGare(gare);
        em.merge(h);
    }

    @Override
    public void SupprimerHoraire(long id) {
        Horaire h = RechercherHoraireParId(id);
        em.remove(h);
    }
    
}
