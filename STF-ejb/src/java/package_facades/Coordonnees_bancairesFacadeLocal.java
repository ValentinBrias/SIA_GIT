/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import java.util.List;
import javax.ejb.Local;
import package_entite.Coordonnees_bancaires;

/**
 *
 * @author 3092790
 */
@Local
public interface Coordonnees_bancairesFacadeLocal {

    void create(Coordonnees_bancaires coordonnees_bancaires);

    void edit(Coordonnees_bancaires coordonnees_bancaires);

    void remove(Coordonnees_bancaires coordonnees_bancaires);

    Coordonnees_bancaires find(Object id);

    List<Coordonnees_bancaires> findAll();

    List<Coordonnees_bancaires> findRange(int[] range);

    int count();
    
}
