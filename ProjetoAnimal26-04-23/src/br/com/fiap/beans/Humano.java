package br.com.fiap.beans;

public class Humano extends Mamifero {

	private String rg;

	
//===================== CONSTRUTORES ========================
	public Humano() {
		super();
	}

	// Construtor com herança
	public Humano(String nome, int idade, double peso, double velocidade, String rg) {
		super();
		this.rg = rg;
	}

//===================== SETTERS & GETTERS ========================
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
}
