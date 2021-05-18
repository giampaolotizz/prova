package it.contrader.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import it.contrader.model.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class ApartmentDTO {

	private long id;

	private String address;
	
	private List<RoomDTO> rooms;
	
	private TutorDTO tutor;
	
	private List<ClientDTO> clients;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<RoomDTO> getRooms() {
		return rooms;
	}

	public void setRooms(List<RoomDTO> rooms) {
		this.rooms = rooms;
	}

	public TutorDTO getTutor() {
		return tutor;
	}

	public void setTutor(TutorDTO tutor) {
		this.tutor = tutor;
	}

	public List<ClientDTO> getClients() {
		return clients;
	}

	public void setClients(List<ClientDTO> clients) {
		this.clients = clients;
	}

}
