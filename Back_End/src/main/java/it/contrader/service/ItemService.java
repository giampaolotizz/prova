package it.contrader.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import it.contrader.dto.ItemDTO; 
import it.contrader.model.Item;

@Service
public class ItemService extends AbstractService<Item,ItemDTO> {


	@Override
	public Item insert(ItemDTO dto) { 
		Item item = new Item();
		mapper.map(dto, item);
		return myRepository.save(item);
	}

	@Override
	public Iterable<ItemDTO> getAll() {
		Iterable<Item> itemList = myRepository.findAll();
		Iterable<ItemDTO> dtoList = new ArrayList<ItemDTO>();
		mapper.map(itemList, dtoList);
		return dtoList;
	}
	
	//GETS all entities depending on id of a parameter, see (Entity)Repository
	@Override
	public Iterable<ItemDTO> getAllBy(long id) { 
		Iterable<Item> itemList = myRepository.findAllBy(id);
		Iterable<ItemDTO> dtoList = new ArrayList<ItemDTO>();
		mapper.map(itemList, dtoList);
		return dtoList;
	}

	@Override
	public ItemDTO read(long id) {
		Item item = myRepository.findById(id).get();
		ItemDTO dto = new ItemDTO();
		mapper.map(item, dto );
		return dto;
	}

	@Override
	public Item update(ItemDTO dto) {
		Item item = new Item();
		mapper.map(dto, item);
		return myRepository.save(item); 
	} 
}
