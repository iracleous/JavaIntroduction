package gr.codehub.javaintroduction.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private Date creationDate;
	 
	@ManyToOne
	private Customer customer;

}
