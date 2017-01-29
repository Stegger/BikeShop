/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.model;

import bikeshop.be.Bike;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Stegger
 */
public class BikeModel
{
    
    private final StringProperty type = new SimpleStringProperty();
    private final StringProperty seller = new SimpleStringProperty();
    private final DoubleProperty price = new SimpleDoubleProperty();
    
    private Bike bike;
    
    public BikeModel(Bike bike)
    {
        this.bike = bike;
        price.set(bike.getPrice());
        seller.set(bike.getSeller());
        type.set(bike.getType());
    }
    
    public double getPrice()
    {
        return price.get();
    }
    
    public void setPrice(double value)
    {
        price.set(value);
        bike.setPrice(value);
    }
    
    public DoubleProperty priceProperty()
    {
        return price;
    }
    
    public String getSeller()
    {
        return seller.get();
    }
    
    public void setSeller(String value)
    {
        seller.set(value);
        bike.setSeller(value);
    }
    
    public StringProperty sellerProperty()
    {
        return seller;
    }
    
    public String getType()
    {
        return type.get();
    }
    
    public void setType(String value)
    {
        type.set(value);
        bike.setType(value);
    }
    
    public StringProperty typeProperty()
    {
        return type;
    }
    
    public Bike getBike()
    {
        return bike;
    }
    
}
