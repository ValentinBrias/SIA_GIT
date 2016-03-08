/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import java.util.List;
import javax.ejb.Local;
import package_entite.Prix_Kilometre;

/**
 *
 * @author 3092790
 */
@Local
public interface Prix_KilometreFacadeLocal {

    void create(Prix_Kilometre prix_Kilometre);

    void edit(Prix_Kilometre prix_Kilometre);

    void remove(Prix_Kilometre prix_Kilometre);

    Prix_Kilometre find(Object id);

    List<Prix_Kilometre> findAll();

    List<Prix_Kilometre> findRange(int[] range);

    int count();
    
}
