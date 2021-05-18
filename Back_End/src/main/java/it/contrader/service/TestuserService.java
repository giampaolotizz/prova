package it.contrader.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import it.contrader.dto.TestuserDTO; 
import it.contrader.model.Testuser;

@Service
public class TestuserService extends AbstractService<Testuser,TestuserDTO> {
	

	@Override
	public Testuser insert(TestuserDTO dto) { 
		Testuser testuser = new Testuser();
		mapper.map(dto, testuser);
		return myRepository.save(testuser);
	}

	@Override
	public Iterable<TestuserDTO> getAll() {
		Iterable<Testuser> testuserList = myRepository.findAll();
		Iterable<TestuserDTO> dtoList = new ArrayList<TestuserDTO>();
		mapper.map(testuserList, dtoList);
		return dtoList;
	}
	
	//GETS all entities depending on id of a parameter, see (Entity)Repository
	@Override
	public Iterable<TestuserDTO> getAllBy(long id) { 
		Iterable<Testuser> testuserList = myRepository.findAllBy(id);
		Iterable<TestuserDTO> dtoList = new ArrayList<TestuserDTO>();
		mapper.map(testuserList, dtoList);
		return dtoList;
	}

	@Override
	public TestuserDTO read(long id) {
		Testuser testuser = myRepository.findById(id).get();
		TestuserDTO dto = new TestuserDTO();
		mapper.map(testuser, dto );
		return dto;
	}

	@Override
	public Testuser update(TestuserDTO dto) {
		Testuser testuser = new Testuser();
		mapper.map(dto, testuser);
		return myRepository.save(testuser); 
	} 
}
