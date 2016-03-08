/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import java.util.List;
import javax.ejb.Local;
import package_entite.Mensuel;

/**
 *
 * @author 3092790
 */
@Local
public interface MensuelFacadeLocal {

    void create(Mensuel mensuel);

    void edit(Mensuel mensuel);

    void remove(Mensuel mensuel);

    Mensuel find(Object id);

    List<Mensuel> findAll();

    List<Mensuel> findRange(int[] range);

    int count();
    
}
