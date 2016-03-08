/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import java.util.List;
import javax.ejb.Local;
import package_entite.Comptable;

/**
 *
 * @author 3092790
 */
@Local
public interface ComptableFacadeLocal {

    void create(Comptable comptable);

    void edit(Comptable comptable);

    void remove(Comptable comptable);

    Comptable find(Object id);

    List<Comptable> findAll();

    List<Comptable> findRange(int[] range);

    int count();
    
}
