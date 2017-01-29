/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.controls;

import bikeshop.gui.controller.ListCellController;
import javafx.scene.Node;
import javafx.scene.control.ListCell;

/**
 *
 * @author Stegger
 * @param <BikeModel>
 */
public class BikeListCell<BikeModel> extends ListCell<BikeModel>
{

    /**
     * The controller for the view we are displaying in the cell.
     */
    private ListCellController controller;

    /**
     * The View we display inside the Lsit Cell
     */
    private Node view;

    /**
     * Constructs a new BikeListCell that is a specialization of a normal List
     * Cell.
     */
    public BikeListCell()
    {
    }

    /**
     * Updates the list cell to its newly set item. This is where the magic
     * happens.
     *
     * @param item The item to display
     * @param empty Wether or not the cell is empty.
     */
    @Override
    protected void updateItem(BikeModel item, boolean empty)
    {
        super.updateItem(item, empty);
        if (empty)
        {
            setGraphic(null); //If this ListCell should be displayed as an ampty one.
        }
        else
        {
            controller.setBikeModel((bikeshop.gui.model.BikeModel) item); //We assign a new BikeModel to display in this cell.
            setGraphic(view); // Update the graphics.
        }
    }

    /**
     * Set the controller for this ListCell.
     *
     * @param controller
     */
    public void setController(ListCellController controller)
    {
        this.controller = controller;
    }

    /**
     * Set's the view to display inside this ListCell.
     *
     * @param view
     */
    public void setView(Node view)
    {
        this.view = view;
    }

}
