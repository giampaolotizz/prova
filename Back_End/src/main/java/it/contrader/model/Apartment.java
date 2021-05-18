package it.contrader.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@OnDelete(action = OnDeleteAction.CASCADE)
public class Apartment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String address;

	@OneToMany (mappedBy = "apartment")
	private List<Room> rooms;

	@ManyToOne
	@JoinColumn
	private Tutor tutor;

	@OneToMany (mappedBy = "apartment")
	private List <Client> clients;

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

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	public List <Client> getClients() {
		return clients;
	}

	public void setClients(List <Client> clients) {
		this.clients = clients;
	}
	
}
