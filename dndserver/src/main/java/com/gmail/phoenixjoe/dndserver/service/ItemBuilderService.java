package com.gmail.phoenixjoe.dndserver.service;

import java.util.List;

import com.gmail.phoenixjoe.dndserver.model.Item;

public interface ItemBuilderService {

	void testItem();

	void addproptotest1();

	Item createNewItem(Item item);


	Item loadItem(long id);

	List<Item> LoadItemList();

	Item ModifyItem(Item modifiedItem);

}