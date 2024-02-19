package in.priya.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passportId;
	
	private String passport;
	private LocalDate passportIssuedDate;
	private LocalDate passportExDate;
	
	@OneToOne
	@JoinColumn(name = "person_id")
	private Person person;

	public Integer getPassportId() {
		return passportId;
	}

	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassportNum(String passport) {
		this.passport = passport;
	}

	public LocalDate getPassportIssuedDate() {
		return passportIssuedDate;
	}

	public void setPassportIssuedDate(LocalDate passportIssuedDate) {
		this.passportIssuedDate = passportIssuedDate;
	}

	public LocalDate getPassportExDate() {
		return passportExDate;
	}

	public void setPassportExDate(LocalDate passportExDate) {
		this.passportExDate = passportExDate;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	
	

}
