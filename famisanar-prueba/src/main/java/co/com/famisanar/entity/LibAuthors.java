package co.com.famisanar.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LIB_AUTHORS")
public class LibAuthors {

	@Id
	@Column(name = "AUT_ID")
	private Integer autId;

	@Column(name = "AUT_FIRST_NAME")
	private String autFirstName;

	@Column(name = "AUT_LAST_NAME")
	private String autLastName;

	@Column(name = "AUT_DATE_DOB")
	private LocalDate autDateDob;

	@Column(name = "AUT_GENDER")
	private String autGender;

	@Column(name = "AUT_CONTACT")
	private String autContact;

	@Column(name = "AUT_OTHER_DETAILS")
	private String autOtherDetails;

	public Integer getAutId() {
		return autId;
	}

	public void setAutId(Integer autId) {
		this.autId = autId;
	}

	public String getAutFirstName() {
		return autFirstName;
	}

	public void setAutFirstName(String autFirstName) {
		this.autFirstName = autFirstName;
	}

	public String getAutLastName() {
		return autLastName;
	}

	public void setAutLastName(String autLastName) {
		this.autLastName = autLastName;
	}

	public LocalDate getAutDateDob() {
		return autDateDob;
	}

	public void setAutDateDob(LocalDate autDateDob) {
		this.autDateDob = autDateDob;
	}

	public String getAutGender() {
		return autGender;
	}

	public void setAutGender(String autGender) {
		this.autGender = autGender;
	}

	public String getAutContact() {
		return autContact;
	}

	public void setAutContact(String autContact) {
		this.autContact = autContact;
	}

	public String getAutOtherDetails() {
		return autOtherDetails;
	}

	public void setAutOtherDetails(String autOtherDetails) {
		this.autOtherDetails = autOtherDetails;
	}

}
