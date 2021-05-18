package it.contrader.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
 
import it.contrader.dao.UserRepository;
import it.contrader.dto.UserDTO; 
import it.contrader.model.User;

@Service
public class UserService extends AbstractService<User,UserDTO> {
	
	//ALL crud methods in AbstractService
	
	//LOGIN method
	public UserDTO findByUsernameAndPassword(String username, String password) {
		User user = ((UserRepository)myRepository).findByUsernameAndPassword(username, password);
		UserDTO dto = new UserDTO();
		mapper.map(user, dto );
		return dto;
	}

	@Override
	public User insert(UserDTO dto) { 
		User user = new User();
		mapper.map(dto, user);
		return myRepository.save(user);
	}

	@Override
	public Iterable<UserDTO> getAll() {
		Iterable<User> userList = myRepository.findAll();
		Iterable<UserDTO> dtoList = new ArrayList<UserDTO>();
		mapper.map(userList, dtoList);
		return dtoList;
	}
	
	//GETS all entities depending on id of a parameter, see (Entity)Repository
	@Override
	public Iterable<UserDTO> getAllBy(long id) { 
		Iterable<User> userList = myRepository.findAllBy(id);
		Iterable<UserDTO> dtoList = new ArrayList<UserDTO>();
		mapper.map(userList, dtoList);
		return dtoList;
	}

	@Override
	public UserDTO read(long id) {
		User user = myRepository.findById(id).get();
		UserDTO dto = new UserDTO();
		mapper.map(user, dto );
		return dto;
	}

	@Override
	public User update(UserDTO dto) {
		User user = new User();
		mapper.map(dto, user);
		return myRepository.save(user); 
	} 
}
