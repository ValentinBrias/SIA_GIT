/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

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
public interface HoraireFacadeLocal {

    void create(Horaire horaire);

    void edit(Horaire horaire);

    void remove(Horaire horaire);

    Horaire find(Object id);

    List<Horaire> findAll();

    List<Horaire> findRange(int[] range);

    int count();

    Horaire RechercherHoraireParId(long id);

    void CreerHoraire(Date date, Ligne ligne, Gare gare);

    void ModifierHoriaire(long id, Date date, Ligne ligne, Gare gare);

    void SupprimerHoraire(long id);

    List<Horaire> RetournerHoraires();

    List<Horaire> RechercherHoraireParLigne(Ligne ligne);
    
}
