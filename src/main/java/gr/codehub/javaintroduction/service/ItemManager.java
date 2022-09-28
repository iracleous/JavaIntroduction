package gr.codehub.javaintroduction.service;

import gr.codehub.javaintroduction.domain.Item;
import gr.codehub.javaintroduction.exception.ItemException;

public interface ItemManager {
	void addItem(Item item) throws ItemException;
}
