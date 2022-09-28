package gr.codehub.javaintroduction.service.impl;

import gr.codehub.javaintroduction.domain.Item;
import gr.codehub.javaintroduction.exception.ItemException;
import gr.codehub.javaintroduction.repository.ItemRepository;
import gr.codehub.javaintroduction.service.ItemManager;

public class ItemManagerImpl implements ItemManager{
	private final ItemRepository itemRepository;
	public  ItemManagerImpl (ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}
	@Override
	public void addItem(Item item) throws ItemException {
		// TODO Auto-generated method stub
		
	}
	
	 
}
