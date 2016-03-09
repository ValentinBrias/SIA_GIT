/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_entite;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vanna
 */
@Local
public interface DistanceGareFacadeLocal {

    void create(DistanceGare distanceGare);

    void edit(DistanceGare distanceGare);

    void remove(DistanceGare distanceGare);

    DistanceGare find(Object id);

    List<DistanceGare> findAll();

    List<DistanceGare> findRange(int[] range);

    int count();

    void AjouterDistance(double nbkm, Ligne ligne, Gare gare);

    DistanceGare RechercherDistanceParID(long id);

    void ModifierDistance(double nouvelledistance, DistanceGare distance);

    void SupprimerDistance(long id);

    List RetournerDistance();
    
}
