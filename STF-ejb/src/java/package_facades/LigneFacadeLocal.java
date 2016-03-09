/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import java.util.List;
import javax.ejb.Local;
import package_entite.Gare;
import package_entite.Ligne;

/**
 *
 * @author 3092790
 */
@Local
public interface LigneFacadeLocal {

    void create(Ligne ligne);

    void edit(Ligne ligne);

    void remove(Ligne ligne);

    Ligne find(Object id);

    List<Ligne> findAll();

    List<Ligne> findRange(int[] range);

    int count();

    void CreerLigne(int num, Gare gareDepart, Gare gareArrivee, List <Gare> liste);

    Ligne RechercherLigneParId(long id);

    void SupprimerLigne(long id);

    void ModifierLigne(long id, int num, Gare gareDepart, Gare gareArrivee, List<Gare> liste);

    Ligne RechercherLigneParNum(int num);

    List<Ligne> RetournerLignes();
    
}
