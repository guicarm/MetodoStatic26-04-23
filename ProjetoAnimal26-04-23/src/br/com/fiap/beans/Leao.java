package br.com.fiap.beans;

public class Leao extends Mamifero {
	
	private double tamanhoJuba;


//===================== CONSTRUTORES ========================
	public Leao() {
		super();
	}

	
	// Construtor com herança
	public Leao(String nome, int idade, double peso, double velocidade, double tamanhoJuba) {
		super(nome, idade, peso, velocidade);
		this.tamanhoJuba = tamanhoJuba;
	}

//===================== SETTERS & GETTERS ========================
	public double getTamanhoJuba() {
		return tamanhoJuba;
	}

	public void setTamanhoJuba(double tamanhoJuba) {
		this.tamanhoJuba = tamanhoJuba;
	}
}
