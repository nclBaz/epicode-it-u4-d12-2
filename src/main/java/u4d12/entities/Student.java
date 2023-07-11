package u4d12.entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "students", uniqueConstraints = {@UniqueConstraint(columnNames = {"firstName", "lastName"})}) // Serve per definire un nome custom per la nostra tabella
@Table(name = "students")
public class Student {
	@Id // Serve per definire chi sarà la chiave primaria
	@GeneratedValue // Obbligatorio usarlo se si vuol fare gestire gli id al db
	private UUID id; // oppure long

	private String firstName;
	private String lastName;


	public Student() {
	}

	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public UUID getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
