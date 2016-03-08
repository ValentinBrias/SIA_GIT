/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import java.util.List;
import javax.ejb.Local;
import package_entite.Gare;

/**
 *
 * @author 3092790
 */
@Local
public interface GareFacadeLocal {

    void create(Gare gare);

    void edit(Gare gare);

    void remove(Gare gare);

    Gare find(Object id);

    List<Gare> findAll();

    List<Gare> findRange(int[] range);

    int count();

    void CreerGare(String nomGare, String adresse);

    void ModifierGare(long id, String nom, String adresse);

    Gare RechercherGareParId(long id);

    void SupprimerGare(long id);
    
}
