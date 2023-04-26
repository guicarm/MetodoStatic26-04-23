package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Humano;
import br.com.fiap.beans.Leao;

public class TesteHeranca {

//===================== MÉTODOS STATIC (ESTÁTICOS) ========================
	
	// String (somente JOptionPane)
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	// int (Integer.parseInt com JOptionPane)
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	
	// double (Double.parseDouble com JOptionPane)
	static double decimal (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
//===================== JOPTIONPANE & SAÍDAS ========================
	public static void main(String[] args) {
	
		Humano objHumano = new Humano(texto("Digite o nome do humano: "),
									inteiro("Digite a idade do humano: "),
									decimal("Digite o peso do humano: "),
									decimal("Digite a velocidade do humano: "),
									texto("Informe o RG do humano: "));
		
	
		Leao objLeao = new Leao(texto("Digite o nome do leão: "),
								inteiro("Digite a idade do leão: "),
								decimal("Digite o peso do leão: "),
								decimal("Digite a velocidade do leão: "),
								decimal("Digite o tamanho da juba do leão: "));
		
		System.out.println("Nome do humano: " + objHumano.getNome() + 
				"\nIdade do humano: " + objHumano.getIdade() + 
				"\nPeso do humano: " + objHumano.getPeso() + 
				"\nVelocidade do humano: " + objHumano.getVelocidade() + 
				"\nRG do humano: " + objHumano.getRg() + 
				"\n=============== LEÃO ================" + 
				"\nNome do leão: " + objLeao.getNome() + 
				"\nIdade do leão: " + objLeao.getIdade() + 
				"\nPeso do leão: " + objLeao.getPeso() + 
				"\nVelocidade do leão: " + objLeao.getVelocidade());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
