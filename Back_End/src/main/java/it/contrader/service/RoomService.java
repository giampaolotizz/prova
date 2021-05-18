package it.contrader.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import it.contrader.dto.RoomDTO; 
import it.contrader.model.Room;

@Service
public class RoomService extends AbstractService<Room, RoomDTO> {


	@Override
	public Room insert(RoomDTO dto) { 
		Room room = new Room();
		mapper.map(dto, room);
		return myRepository.save(room);
	}

	@Override
	public Iterable<RoomDTO> getAll() {
		Iterable<Room> roomList = myRepository.findAll();
		Iterable<RoomDTO> dtoList = new ArrayList<RoomDTO>();
		mapper.map(roomList, dtoList);
		return dtoList;
	}
	
	//GETS all entities depending on id of a parameter, see (Entity)Repository
	@Override
	public Iterable<RoomDTO> getAllBy(long id) { 
		Iterable<Room> roomList = myRepository.findAllBy(id);
		Iterable<RoomDTO> dtoList = new ArrayList<RoomDTO>();
		mapper.map(roomList, dtoList);
		return dtoList;
	}

	@Override
	public RoomDTO read(long id) {
		Room room = myRepository.findById(id).get();
		RoomDTO dto = new RoomDTO();
		mapper.map(room, dto );
		return dto;
	}

	@Override
	public Room update(RoomDTO dto) {
		Room room = new Room();
		mapper.map(dto, room);
		return myRepository.save(room); 
	} 
}
