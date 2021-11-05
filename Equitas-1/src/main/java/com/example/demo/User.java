package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "users")
public class User {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
	
	private String Name;
	
	private String PhoneNo;
	
	private String Email;
	
	private String BankName;
	
	private  Long accNo;
	
	private Integer accCvv;
	
	private String BankLink;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public Long getAccNo() {
		return accNo;
	}

	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}

	public Integer getAccCvv() {
		return accCvv;
	}

	public void setAccCvv(Integer accCvv) {
		this.accCvv = accCvv;
	}

	public String getBankLink() {
		return BankLink;
	}

	public void setBankLink(String bankLink) {
		BankLink = bankLink;
	}

	public User(Long id, String name, String phoneNo, String email, String bankName, Long accNo, Integer accCvv,
			String bankLink) {
		super();
		Id = id;
		Name = name;
		PhoneNo = phoneNo;
		Email = email;
		BankName = bankName;
		this.accNo = accNo;
		this.accCvv = accCvv;
		BankLink = bankLink;
	}
	
	
	@Override
	public String toString() {
		return "User [Id=" + Id + ", Name=" + Name + ", PhoneNo=" + PhoneNo + ", Email=" + Email + ", BankName="
				+ BankName + ", accNo=" + accNo + ", accCvv=" + accCvv + ", BankLink=" + BankLink + "]";
	}

	public User() {
		
	}
}
