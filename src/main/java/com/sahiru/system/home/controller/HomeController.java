package com.sahiru.system.home.controller;

import com.sahiru.system.home.model.Item;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


@SuppressWarnings("unused")
public class HomeController {
	
    @FXML
    private TextField itemName;

    @FXML
    private TextField qty;

    @FXML
    private TableView<Item> itemsTable;

    @FXML
    private TableColumn<Item, String> itemNameColumn;

    @FXML
    private TableColumn<Item, String> itemUnitColumn;
	private final ObservableList<Item> items = FXCollections.observableArrayList(
			new Item(new SimpleStringProperty("Anchor"), new SimpleStringProperty("nos")),
			new Item(new SimpleStringProperty("Onions"), new SimpleStringProperty("kg")),
			new Item(new SimpleStringProperty("Oil"), new SimpleStringProperty("l")),
			new Item(new SimpleStringProperty("Eggs"), new SimpleStringProperty("nos"))
	);
	
	@FXML
	private void initialize() {
		itemNameColumn.setCellValueFactory(cellData -> cellData.getValue().getItemName());
		itemUnitColumn.setCellValueFactory(cellData -> cellData.getValue().getUnit());
	
		itemsTable.setItems(items);
	}
	
	@FXML
	private void addItem() {
		items.add(
				new Item(new SimpleStringProperty("Anchor"), new SimpleStringProperty("nos"))
		);
	}
}
