package it.contrader.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import it.contrader.dto.SuperuserDTO; 
import it.contrader.model.Superuser;

@Service
public class SuperuserService extends AbstractService<Superuser,SuperuserDTO> {
	

	@Override
	public Superuser insert(SuperuserDTO dto) { 
		Superuser superuser = new Superuser();
		mapper.map(dto, superuser);
		return myRepository.save(superuser);
	}

	@Override
	public Iterable<SuperuserDTO> getAll() {
		Iterable<Superuser> superuserList = myRepository.findAll();
		Iterable<SuperuserDTO> dtoList = new ArrayList<SuperuserDTO>();
		mapper.map(superuserList, dtoList);
		return dtoList;
	}
	
	//GETS all entities depending on id of a parameter, see (Entity)Repository
	@Override
	public Iterable<SuperuserDTO> getAllBy(long id) { 
		Iterable<Superuser> superuserList = myRepository.findAllBy(id);
		Iterable<SuperuserDTO> dtoList = new ArrayList<SuperuserDTO>();
		mapper.map(superuserList, dtoList);
		return dtoList;
	}

	@Override
	public SuperuserDTO read(long id) {
		Superuser superuser = myRepository.findById(id).get();
		SuperuserDTO dto = new SuperuserDTO();
		mapper.map(superuser, dto );
		return dto;
	}

	@Override
	public Superuser update(SuperuserDTO dto) {
		Superuser superuser = new Superuser();
		mapper.map(dto, superuser);
		return myRepository.save(superuser); 
	} 
}
