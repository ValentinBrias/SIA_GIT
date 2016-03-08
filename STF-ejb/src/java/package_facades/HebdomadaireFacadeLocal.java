/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import java.util.List;
import javax.ejb.Local;
import package_entite.Hebdomadaire;

/**
 *
 * @author 3092790
 */
@Local
public interface HebdomadaireFacadeLocal {

    void create(Hebdomadaire hebdomadaire);

    void edit(Hebdomadaire hebdomadaire);

    void remove(Hebdomadaire hebdomadaire);

    Hebdomadaire find(Object id);

    List<Hebdomadaire> findAll();

    List<Hebdomadaire> findRange(int[] range);

    int count();
    
}
