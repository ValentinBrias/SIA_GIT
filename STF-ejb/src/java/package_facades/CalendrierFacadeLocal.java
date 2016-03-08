/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import java.util.List;
import javax.ejb.Local;
import package_entite.Calendrier;

/**
 *
 * @author 3092790
 */
@Local
public interface CalendrierFacadeLocal {

    void create(Calendrier calendrier);

    void edit(Calendrier calendrier);

    void remove(Calendrier calendrier);

    Calendrier find(Object id);

    List<Calendrier> findAll();

    List<Calendrier> findRange(int[] range);

    int count();
    
}
