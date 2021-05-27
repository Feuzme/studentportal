package com.studentPortal.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class StudentPortalEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, unique = true)
	private Integer id;

	@Column(name="login", nullable = false)
	private String login;
	@Column(name="password", nullable = false)
	private String password;
	@Column(name = "lastname")
	private String lastname;	
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "sex")
	private Boolean sex;
	@Column(name = "lastConnection")
	private Timestamp lastConnection;
	@Column(name = "birthDate")
	private Date birthDate;
	@Column(name = "adress")
	private String adress;
	@Column(name = "postal")
	private Integer postal;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private String ephone;

	
	public StudentPortalEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		if (this.getId() != null) {
			return (this.getClass().getName() + "-" + this.getId()).hashCode();
		}
		return super.hashCode();
	}

	@Override
	public boolean equals(Object pObj) {
		if (pObj == null) {
			return false;
		}
		if (pObj == this) {
			return true;
		}
		if (pObj instanceof StudentPortalEntity) {
			return ((StudentPortalEntity) pObj).getId() == this.getId()
					|| ((StudentPortalEntity) pObj).getId().equals(this.getId());
		}
		return false;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Boolean getSex() {
		return sex;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	public Timestamp getLastConnection() {
		return lastConnection;
	}
	public void setLastConnection(Timestamp lastConnection) {
		this.lastConnection = lastConnection;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Integer getPostal() {
		return postal;
	}
	public void setPostal(Integer postal) {
		this.postal = postal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEphone() {
		return ephone;
	}
	public void setEphone(String ephone) {
		this.ephone = ephone;
	}

	@Override
	public String toString() {
		return "StudentPortalEntity [id=" + id + ", login=" + login + ", password=" + password + ", lastname="
				+ lastname + ", firstname=" + firstname + ", sex=" + sex + ", lastConnection=" + lastConnection
				+ ", birthDate=" + birthDate + ", adress=" + adress + ", postal=" + postal + ", email=" + email
				+ ", ephone=" + ephone + "]";
	}
	
	
	
}
