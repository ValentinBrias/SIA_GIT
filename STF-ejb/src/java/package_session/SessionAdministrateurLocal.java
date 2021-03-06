/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_session;

import java.util.Date;
import java.util.List;
import javax.ejb.Local;
import package_entite.Gare;
import package_entite.Horaire;
import package_entite.Ligne;

/**
 *
 * @author 3092790
 */
@Local
public interface SessionAdministrateurLocal {

    void CreerGare(String nom, String adresse, List<Ligne> list);

    void SupprimerGare(long id);

    void ModifierGare(long id, String nom, String adresse, List<Ligne> list);

    Ligne CreerLigne(int num, Gare gareDepart, Gare gareArrivee, List <Gare> liste);

    void SupprimerLigne(long id);

    void ModifierLigne(long id, int num, Gare gareDepart, Gare gareArrivee, List<Gare> liste);

    void CreerHoraire(Date date, Gare gare, Ligne ligne);

    void ModifierHoraire(long id, Date date, Ligne ligne, Gare gare);

    void SupprimerHoraire(long id);

    List<Gare> RetournerGares();

    List<Ligne> RetournerLignes();

    List<Horaire> RetournerHoraires();

    Gare RechercherGareParId(long id);

    Ligne RechercherLigneParId(long id);

    Horaire RechercherHoraireParId(long id);

    Ligne RechercherLigneParNum(int num);

    List<Horaire> RechercherHoraireParLigne(Ligne ligne);

    List RetournerAbonnement();

    void CreerDistance(Gare gare, Ligne ligne, double distance);
    
}
