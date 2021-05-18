package it.contrader.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class ClientDTO {

	private long id;
	
	private String name;
	
	private String surname;
	
	private Date birthdate;
	
	private String telnumber;
	
	private ApartmentDTO apartment;
	
	private TutorDTO tutorDTO;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getTelnumber() {
		return telnumber;
	}

	public void setTelnumber(String telnumber) {
		this.telnumber = telnumber;
	}

	public ApartmentDTO getApartment() {
		return apartment;
	}

	public void setApartment(ApartmentDTO apartment) {
		this.apartment = apartment;
	}

	public TutorDTO getTutorDTO() {
		return tutorDTO;
	}

	public void setTutorDTO(TutorDTO tutorDTO) {
		this.tutorDTO = tutorDTO;
	}
	
//	private List<DiseaseDTO> diseases;	
	
}
