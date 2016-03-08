/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import java.util.List;
import javax.ejb.Local;
import package_entite.Porte_Monnaie;

/**
 *
 * @author 3092790
 */
@Local
public interface Porte_MonnaieFacadeLocal {

    void create(Porte_Monnaie porte_Monnaie);

    void edit(Porte_Monnaie porte_Monnaie);

    void remove(Porte_Monnaie porte_Monnaie);

    Porte_Monnaie find(Object id);

    List<Porte_Monnaie> findAll();

    List<Porte_Monnaie> findRange(int[] range);

    int count();
    
}
