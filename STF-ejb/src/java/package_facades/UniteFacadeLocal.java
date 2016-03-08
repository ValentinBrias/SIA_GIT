/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import java.util.List;
import javax.ejb.Local;
import package_entite.Unite;

/**
 *
 * @author 3092790
 */
@Local
public interface UniteFacadeLocal {

    void create(Unite unite);

    void edit(Unite unite);

    void remove(Unite unite);

    Unite find(Object id);

    List<Unite> findAll();

    List<Unite> findRange(int[] range);

    int count();
    
}
