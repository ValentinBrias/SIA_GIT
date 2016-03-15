/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import java.util.List;
import javax.ejb.Local;
import package_entite.Abonnement;
import package_entite.Type_Abonnement;

/**
 *
 * @author 3099709
 */
@Local
public interface AbonnementFacadeLocal {

    void create(Abonnement abonnement);

    void edit(Abonnement abonnement);

    void remove(Abonnement abonnement);

    Abonnement find(Object id);

    List<Abonnement> findAll();

    List<Abonnement> findRange(int[] range);

    int count();

    List RetournerAbonnement();

    void CreerAbonnement(double taux, Type_Abonnement type);
    
}
