/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_session;

import javax.ejb.Local;
import package_entite.Gare;

/**
 *
 * @author 3092790
 */
@Local
public interface SessionAdministrateurLocal {

    void CreerGare(String nom, String adresse);

    void SupprimerGare(long id);

    void ModifierGare(long id, String nom, String adresse);

    void CreerLigne(int num, Gare gareDepart, Gare gareArrivee, int nbGares);

    void SupprimerLigne(long id);

    void ModifierLigne(long id, int num, Gare gareDepart, Gare gareArrivee, int nbGares);
    
}
