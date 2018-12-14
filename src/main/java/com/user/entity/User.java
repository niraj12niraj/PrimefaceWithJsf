package com.user.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="USER")
@Entity
public class User {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO.SEQUENCE, generator="uid")
	@SequenceGenerator(sequenceName="uidSequence", name = "uid")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="NUMBER")
    private int number;
	@Column(name="ADDRESS")
	private String address;
    @Column(name="BANK")
	private Bank bank;
    @OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
    @JoinColumn(name="BANK")
    private List<Bank>listOfBank=new ArrayList<>();
    
    public User(){
    	System.out.println("default User..");
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public List<Bank> getListOfBank() {
		return listOfBank;
	}
	public void setListOfBank(List<Bank> listOfBank) {
		this.listOfBank = listOfBank;
	}
    
    

}
