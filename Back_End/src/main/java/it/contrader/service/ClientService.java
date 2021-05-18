package it.contrader.service;

import java.util.ArrayList;
 
import org.springframework.stereotype.Service;
 
import it.contrader.dto.ClientDTO; 
import it.contrader.model.Client; 

@Service
public class ClientService extends AbstractService<Client, ClientDTO> {


	@Override
	public Client insert(ClientDTO dto) { 
		Client client = new Client();
		mapper.map(dto, client);
		return myRepository.save(client);
	}

	@Override
	public Iterable<ClientDTO> getAll() {
		Iterable<Client> clientList = myRepository.findAll();
		Iterable<ClientDTO> dtoList = new ArrayList<ClientDTO>();
		mapper.map(clientList, dtoList);
		return dtoList;
	}
	
	//GETS all entities depending on id of a parameter, see (Entity)Repository
	@Override
	public Iterable<ClientDTO> getAllBy(long id) { 
		Iterable<Client> clientList = myRepository.findAllBy(id);
		Iterable<ClientDTO> dtoList = new ArrayList<ClientDTO>();
		mapper.map(clientList, dtoList);
		return dtoList;
	}

	@Override
	public ClientDTO read(long id) {
		Client client = myRepository.findById(id).get();
		ClientDTO dto = new ClientDTO();
		mapper.map(client, dto );
		return dto;
	}

	@Override
	public Client update(ClientDTO dto) {
		Client client = new Client();
		mapper.map(dto, client);
		return myRepository.save(client); 
	} 
}
