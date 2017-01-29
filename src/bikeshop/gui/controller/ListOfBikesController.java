/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.controller;

import bikeshop.gui.controls.BikeListCell;
import bikeshop.gui.model.BikeBoardModel;
import bikeshop.gui.model.BikeModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author Stegger
 */
public class ListOfBikesController implements Initializable
{
    
    @FXML
    private ListView<BikeModel> listBikes;
    
    private BikeBoardModel model;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        listBikes.setCellFactory(new Callback<ListView<BikeModel>, ListCell<BikeModel>>()
        {
            
            @Override
            public ListCell<BikeModel> call(ListView<BikeModel> param)
            {
                BikeListCell<BikeModel> cell = new BikeListCell<>();
                try
                {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/bikeshop/gui/view/ListCellBike.fxml"));
                    Node node = loader.load();
                    ListCellController controller = loader.getController();
                    cell.setController(controller);
                    cell.setView(node);
                    cell.setGraphic(node);
                    return cell;
                } catch (IOException ex)
                {
                    Logger.getLogger(ListOfBikesController.class.getName()).log(Level.SEVERE, null, ex);
                }
                return cell;
            }
        });
    }
    
    public void setBikeBoardModel(BikeBoardModel model)
    {
        this.model = model;
        listBikes.setItems(model.getBikesForSale());
    }
    
}
