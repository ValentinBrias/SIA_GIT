/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_session;

import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import package_entite.Gare;
import package_entite.Horaire;
import package_entite.Ligne;
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


    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void CreerGare(String nom, String adresse, List<Ligne> list) {
        gareFacade.CreerGare(nom, adresse, list);
    }

    @Override
    public void SupprimerGare(long id) {
        gareFacade.SupprimerGare(id);
    }

    @Override
    public void ModifierGare(long id, String nom, String adresse, List<Ligne> list) {
        gareFacade.ModifierGare(id, nom, adresse, list);
    }

    @Override
    public void CreerLigne(int num, Gare gareDepart, Gare gareArrivee) {
        ligneFacade.CreerLigne(num, gareDepart, gareArrivee);
    }

    @Override
    public void SupprimerLigne(long id) {
        ligneFacade.SupprimerLigne(id);
    }

    @Override
    public void ModifierLigne(long id, int num, Gare gareDepart, Gare gareArrivee) {
        ligneFacade.ModifierLigne(id, num, gareDepart, gareArrivee);
    }

    @Override
    public void CreerHoraire(Date date, Gare gare, Ligne ligne) {
        horaireFacade.CreerHoraire(date, ligne, gare);
    }

    @Override
    public void ModifierHoraire(long id, Date date, Ligne ligne, Gare gare) {
        horaireFacade.ModifierHoriaire(id, date, ligne, gare);
    }

    @Override
    public void SupprimerHoraire(long id) {
        horaireFacade.SupprimerHoraire(id);
    }

    @Override
    public List<Gare> RetournerGares() {
        List<Gare> list = gareFacade.RetournerGares();
        return list;
    }

    @Override
    public List<Ligne> RetournerLignes() {
        List<Ligne> list = ligneFacade.RetournerLignes();
        return list;
    }

    @Override
    public List<Horaire> RetournerHoraires() {
        List<Horaire> list = horaireFacade.RetournerHoraires();
        return list;
    }

    @Override
    public Gare RechercherGareParId(long id) {
        Gare g = gareFacade.RechercherGareParId(id);
        return g;
    }

    @Override
    public Ligne RechercherLigneParId(long id) {
        Ligne l = ligneFacade.RechercherLigneParId(id);
        return l;
    }

    @Override
    public Horaire RechercherHoraireParId(long id) {
        Horaire h = horaireFacade.RechercherHoraireParId(id);
        return h;
    }

    @Override
    public Ligne RechercherLigneParNum(int num) {
        Ligne l = ligneFacade.RechercherLigneParNum(num);
        return l;
    }

    @Override
    public List<Horaire> RechercherHoraireParLigne(Ligne ligne) {
        List<Horaire> list = horaireFacade.RechercherHoraireParLigne(ligne);
        return list;
    }
    
    
}
