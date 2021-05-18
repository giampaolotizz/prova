package it.contrader.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import it.contrader.model.Category;
import it.contrader.model.User.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class OperatorDTO extends UserDTO {
	 
	private Category category;
	
	private boolean availability;
	
	public OperatorDTO(long id, String username, String password, UserType userType, String name, String surname, String email, String address, String telnumber, Date birthdate, String ccc, boolean paymentStatus, Category category, boolean availability) {
		super(id, username, password, userType, name, surname, email, address, telnumber, birthdate, ccc, paymentStatus);
		this.setCategory(category);
		this.setAvailability(availability);
	}
	public OperatorDTO() {
		
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
}
