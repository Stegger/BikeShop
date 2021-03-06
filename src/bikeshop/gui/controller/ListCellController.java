/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.controller;

import bikeshop.gui.model.BikeModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Stegger
 */
public class ListCellController implements Initializable
{

    @FXML
    private Label lblType;
    @FXML
    private Label lblSeller;
    @FXML
    private Label lblPrice;

    private BikeModel model;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

    }

    public void setBikeModel(BikeModel model)
    {
        this.model = model;
        lblType.textProperty().bind(model.typeProperty());
        lblType.requestLayout();
        lblSeller.textProperty().bind(model.sellerProperty());
        lblSeller.requestLayout();
        lblPrice.textProperty().bind(model.priceProperty().asString());
        lblPrice.requestLayout();
    }

}
