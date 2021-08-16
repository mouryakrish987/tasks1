package com.app.model;

public class Players {
	private int id,age;
	private String name,city,gender,sportsName;
	private long contact;
	public Players(int id, String name, int age, String city, String gender, String sportsName, long contact) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.city = city;
		this.gender = gender;
		this.sportsName = sportsName;
		this.contact = contact;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	@Override
	public String toString() {
		return "Players [id=" + id + ", age=" + age + ", name=" + name + ", city=" + city + ", gender=" + gender
				+ ", sportsName=" + sportsName + ", contact=" + contact + "]";
	}
	
	public Players() {
		super();
	}
	

}
