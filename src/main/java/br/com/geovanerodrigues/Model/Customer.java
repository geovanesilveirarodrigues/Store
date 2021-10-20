package br.com.geovanerodrigues.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getCPF() {
		return CPF;
	}
	public void setCPF(long cPF) {
		CPF = cPF;
	}
	public String getCelPhone() {
		return celPhone;
	}
	public void setCelPhone(String celPhone) {
		this.celPhone = celPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Customer() {
	}
	public Customer(int id, long cPF, String celPhone, String email, String name) {
		this.id = id;
		CPF = cPF;
		this.celPhone = celPhone;
		this.email = email;
		this.name = name;
	}
	private long CPF;
	private String celPhone;
	private String email;
	private String name;
	}

