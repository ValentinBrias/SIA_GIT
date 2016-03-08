/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_facades;

import java.util.List;
import javax.ejb.Local;
import package_entite.Train;

/**
 *
 * @author 3092790
 */
@Local
public interface TrainFacadeLocal {

    void create(Train train);

    void edit(Train train);

    void remove(Train train);

    Train find(Object id);

    List<Train> findAll();

    List<Train> findRange(int[] range);

    int count();
    
}
