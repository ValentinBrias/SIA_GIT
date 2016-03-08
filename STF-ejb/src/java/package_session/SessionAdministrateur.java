/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_session;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import package_entite.Gare;
import package_facades.AdministrateurFacadeLocal;
import package_facades.GareFacadeLocal;
import package_facades.HoraireFacadeLocal;
import package_facades.LigneFacadeLocal;

/**
 *
 * @author 3092790
 */
@Stateless
public class SessionAdministrateur implements SessionAdministrateurLocal {
    @EJB
    private LigneFacadeLocal ligneFacade;
    @EJB
    private HoraireFacadeLocal horaireFacade;
    @EJB
    private GareFacadeLocal gareFacade;
    @EJB
    private AdministrateurFacadeLocal administrateurFacade;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void CreerGare(String nom, String adresse) {
        gareFacade.CreerGare(nom, adresse);
    }

    @Override
    public void SupprimerGare(long id) {
        gareFacade.SupprimerGare(id);
    }

    @Override
    public void ModifierGare(long id, String nom, String adresse) {
        gareFacade.ModifierGare(id, nom, adresse);
    }

    @Override
    public void CreerLigne(int num, Gare gareDepart, Gare gareArrivee, int nbGares) {
        ligneFacade.CreerLigne(num, gareDepart, gareArrivee, nbGares);
    }

    @Override
    public void SupprimerLigne(long id) {
        ligneFacade.SupprimerLigne(id);
    }

    @Override
    public void ModifierLigne(long id, int num, Gare gareDepart, Gare gareArrivee, int nbGares) {
        ligneFacade.ModifierLigne(id, num, gareDepart, gareArrivee, nbGares);
    }
    
}
