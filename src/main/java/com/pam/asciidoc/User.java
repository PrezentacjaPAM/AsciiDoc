package com.pam.asciidoc;

/**
 * = Klasa U¿ytkownika
 * Klasa ta odpowiedzialna jest za reprezentacje danych 
 * *ka¿dego* z _u¿ytkowników_ aplikacji
 */
public class User {
	private String name;
	private String surname;
	private String email;
	
	
	/**
	 * Konstruktor klasy *User*
	 * @param name *Imiê* u¿ytkownika
	 * @param surname *Nazwisko* u¿ytkownika
	 * @param email Adres *e-mail* uytkownika
	 */
	public User(String name, String username, String email){
		this.name = name;
		this.surname = surname;
		this.email = email;
	}
	
};