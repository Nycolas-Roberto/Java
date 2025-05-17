package poo.java;

public class User {
	 // - Membros: Propriedades e métodos (comportamentos)
	private boolean isLogged;
	
	public String firstName;
	public String lastName;
	public String password;
	private int followers;
	private int following;
	private String fullname;
	public Address address; // Instanciando um outro objeto do tipo Endereço dentro de uma classe
	
	public void setLogged(boolean logged) {
		this.isLogged = logged;
	}
	public void setFullname(String firstname, String lastname) {
		this.fullname = firstname + " " + lastname;
	}
	public String getfullname() {
		return this.fullname;
	}
	public void setAddress(String street, String zipCode, String number) {
		this.address.street = street;
		this.address.zipCode = zipCode;
		this.address.number = number;
	}
}
