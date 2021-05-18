package it.contrader.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import it.contrader.dto.OperatorDTO; 
import it.contrader.model.Operator;

@Service
public class OperatorService extends AbstractService<Operator,OperatorDTO> {
	

	@Override
	public Operator insert(OperatorDTO dto) { 
		Operator operator = new Operator();
		mapper.map(dto, operator);
		return myRepository.save(operator);
	}

	@Override
	public Iterable<OperatorDTO> getAll() {
		Iterable<Operator> operatorList = myRepository.findAll();
		Iterable<OperatorDTO> dtoList = new ArrayList<OperatorDTO>();
		mapper.map(operatorList, dtoList);
		return dtoList;
	}
	
	//GETS all entities depending on id of a parameter, see (Entity)Repository
	@Override
	public Iterable<OperatorDTO> getAllBy(long id) { 
		Iterable<Operator> operatorList = myRepository.findAllBy(id);
		Iterable<OperatorDTO> dtoList = new ArrayList<OperatorDTO>();
		mapper.map(operatorList, dtoList);
		return dtoList;
	}

	@Override
	public OperatorDTO read(long id) {
		Operator operator = myRepository.findById(id).get();
		OperatorDTO dto = new OperatorDTO();
		mapper.map(operator, dto );
		return dto;
	}

	@Override
	public Operator update(OperatorDTO dto) {
		Operator operator = new Operator();
		mapper.map(dto, operator);
		return myRepository.save(operator); 
	} 	
}
