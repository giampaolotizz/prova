package it.contrader.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.dao.MyRepository;
import it.contrader.dto.ThingDTO; 
import it.contrader.model.Thing;

@Service
public class ThingService extends AbstractService<Thing,ThingDTO> {
	@Override
	public Iterable<ThingDTO> getAll() {
		Iterable<Thing> thingList = myRepository.findAll();
		ArrayList<ThingDTO> dtoList = new ArrayList<ThingDTO>();
		for(Thing object: thingList) {
			ThingDTO dto = new ThingDTO();
			mapper.map(object, dto);
			dtoList.add(dto);}
		return dtoList;
		}
 
	@Override
	public Thing insert(ThingDTO dto) { 
		return myRepository.save(mapper.map(dto, Thing.class));
	}

	
	//GETS all entities depending on id of a parameter, see (Entity)Repository
	@Override
	public Iterable<ThingDTO> getAllBy(long id) { 
		Iterable<Thing> thingList = myRepository.findAllBy(id);
		Iterable<ThingDTO> dtoList = new ArrayList<ThingDTO>();
		mapper.map(thingList, dtoList);
		return dtoList;
	}

	@Override
	public ThingDTO read(long id) {
		return mapper.map(myRepository.findById(id).get(), ThingDTO.class ); 
	}

	@Override
	public Thing update(ThingDTO dto) { 
		return myRepository.save(mapper.map(dto, Thing.class));  
	} 
}
