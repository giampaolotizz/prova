package it.contrader.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import it.contrader.model.User.UserType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class TutorDTO extends UserDTO {
	
	private List<ApartmentDTO> apartments;
	
	public TutorDTO(long id, String username, String password, UserType userType, String name, String surname, String email, String address, String telnumber, Date birthdate, String ccc, boolean paymentStatus, List<ApartmentDTO> apartmentsDTO) {
		super(id, username, password, userType, name, surname, email, address, telnumber, birthdate, ccc, paymentStatus);
		this.setApartments(apartmentsDTO);
	}

	public TutorDTO() {
		// TODO Auto-generated constructor stub
	}

	public List<ApartmentDTO> getApartments() {
		return apartments;
	}

	public void setApartments(List<ApartmentDTO> apartments) {
		this.apartments = apartments;
	}
}
