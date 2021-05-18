package it.contrader.service;

import java.util.ArrayList;
 
import org.springframework.stereotype.Service;
  
import it.contrader.dto.ApartmentDTO;
import it.contrader.model.Apartment;


@Service
public class ApartmentService extends AbstractService<Apartment, ApartmentDTO> {
	
	@Override
	public Apartment insert(ApartmentDTO dto) { 
		Apartment apartment = new Apartment();
		mapper.map(dto, apartment);
		return myRepository.save(apartment);
	}

	@Override
	public Iterable<ApartmentDTO> getAll() {
		Iterable<Apartment> apartmentList = myRepository.findAll();
		Iterable<ApartmentDTO> dtoList = new ArrayList<ApartmentDTO>();
		mapper.map(apartmentList, dtoList);
		return dtoList;
	}
	
	//GETS all entities depending on id of a parameter, see (Entity)Repository
	@Override
	public Iterable<ApartmentDTO> getAllBy(long id) { 
		Iterable<Apartment> apartmentList = myRepository.findAllBy(id);
		Iterable<ApartmentDTO> dtoList = new ArrayList<ApartmentDTO>();
		mapper.map(apartmentList, dtoList);
		return dtoList;
	}

	@Override
	public ApartmentDTO read(long id) {
		Apartment apartment = myRepository.findById(id).get();
		ApartmentDTO dto = new ApartmentDTO();
		mapper.map(apartment, dto );
		return dto;
	}

	@Override
	public Apartment update(ApartmentDTO dto) {
		Apartment apartment = new Apartment();
		mapper.map(dto, apartment);
		return myRepository.save(apartment); 
	} 
}
