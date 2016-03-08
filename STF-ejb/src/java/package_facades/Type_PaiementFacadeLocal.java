/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import java.util.List;
import javax.ejb.Local;
import package_entite.Type_Paiement;

/**
 *
 * @author 3092790
 */
@Local
public interface Type_PaiementFacadeLocal {

    void create(Type_Paiement type_Paiement);

    void edit(Type_Paiement type_Paiement);

    void remove(Type_Paiement type_Paiement);

    Type_Paiement find(Object id);

    List<Type_Paiement> findAll();

    List<Type_Paiement> findRange(int[] range);

    int count();
    
}
