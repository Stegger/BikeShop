/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.bll;

import bikeshop.be.Bike;
import bikeshop.dal.BikeDao;
import java.util.List;

/**
 *
 * @author Stegger
 */
public class BikeManager
{

    private BikeDao bikeDao;

    public BikeManager()
    {
        bikeDao = new BikeDao();
    }

    public List<Bike> getAllBikes()
    {
        return bikeDao.getAllBikes();
    }
}
