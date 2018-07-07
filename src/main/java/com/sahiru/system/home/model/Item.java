package com.sahiru.system.home.model;

import javafx.beans.property.StringProperty;

public class Item {
	private StringProperty itemName;
	private StringProperty unit;
	
	public Item() {
		
	}
	
	public Item(StringProperty itemName, StringProperty unit) {
		super();
		this.itemName = itemName;
		this.unit = unit;
	}

	public StringProperty getItemName() {
		return itemName;
	}

	public void setItemName(StringProperty itemName) {
		this.itemName = itemName;
	}

	public StringProperty getUnit() {
		return unit;
	}

	public void setUnit(StringProperty unit) {
		this.unit = unit;
	}	
	
}
