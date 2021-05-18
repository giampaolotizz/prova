package it.contrader.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import it.contrader.dto.TutorDTO; 
import it.contrader.model.Tutor;

@Service
public class TutorService extends AbstractService<Tutor,TutorDTO> {
	

	@Override
	public Tutor insert(TutorDTO dto) { 
		Tutor tutor = new Tutor();
		mapper.map(dto, tutor);
		return myRepository.save(tutor);
	}

	@Override
	public Iterable<TutorDTO> getAll() {
		Iterable<Tutor> tutorList = myRepository.findAll();
		Iterable<TutorDTO> dtoList = new ArrayList<TutorDTO>();
		mapper.map(tutorList, dtoList);
		return dtoList;
	}
	
	//GETS all entities depending on id of a parameter, see (Entity)Repository
	@Override
	public Iterable<TutorDTO> getAllBy(long id) { 
		Iterable<Tutor> tutorList = myRepository.findAllBy(id);
		Iterable<TutorDTO> dtoList = new ArrayList<TutorDTO>();
		mapper.map(tutorList, dtoList);
		return dtoList;
	}

	@Override
	public TutorDTO read(long id) {
		Tutor tutor = myRepository.findById(id).get();
		TutorDTO dto = new TutorDTO();
		mapper.map(tutor, dto );
		return dto;
	}

	@Override
	public Tutor update(TutorDTO dto) {
		Tutor tutor = new Tutor();
		mapper.map(dto, tutor);
		return myRepository.save(tutor); 
	} 
}
