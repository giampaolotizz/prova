package it.contrader.service;

import java.util.ArrayList;
import java.util.Date;
 
import org.springframework.stereotype.Service;
 
import it.contrader.dao.EventRepository; 
import it.contrader.dto.EventDTO; 
import it.contrader.model.Event;

@Service
public class EventService extends AbstractService<Event,EventDTO> {

	//ALL crud methods in AbstractService
	
	public Iterable<EventDTO> findAllByItemAndDate(Long id, Date date){

		Iterable<Event> eventList = ((EventRepository)myRepository).findAllByItemAndDate(id, date);
		Iterable<EventDTO> dtoList = new ArrayList<EventDTO>();
		mapper.map(eventList, dtoList);
		return dtoList;
	}

	@Override
	public Event insert(EventDTO dto) { 
		Event event = new Event();
		mapper.map(dto, event);
		return myRepository.save(event);
	}

	@Override
	public Iterable<EventDTO> getAll() {
		Iterable<Event> eventList = myRepository.findAll();
		Iterable<EventDTO> dtoList = new ArrayList<EventDTO>();
		mapper.map(eventList, dtoList);
		return dtoList;
	}
	
	//GETS all entities depending on id of a parameter, see (Entity)Repository
	@Override
	public Iterable<EventDTO> getAllBy(long id) { 
		Iterable<Event> eventList = myRepository.findAllBy(id);
		Iterable<EventDTO> dtoList = new ArrayList<EventDTO>();
		mapper.map(eventList, dtoList);
		return dtoList;
	}

	@Override
	public EventDTO read(long id) {
		Event event = myRepository.findById(id).get();
		EventDTO dto = new EventDTO();
		mapper.map(event, dto );
		return dto;
	}

	@Override
	public Event update(EventDTO dto) {
		Event event = new Event();
		mapper.map(dto, event);
		return myRepository.save(event); 
	} 
}
