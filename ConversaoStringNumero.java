package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro n�mero: ");
		
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo n�mero: ");
		System.out.println(valor1 + valor2); // concatenou os n�meros
	
		double numero1 = Double.parseDouble(valor1); // convers�o do valor 1 (str) em double,
		                                 // e guardada em uma nova vari�vel
		double numero2 = Double.parseDouble(valor2); // coners�o str -> double
		double soma = (numero1 + numero2);
		double media = (soma / 2);
		
		System.out.println("A soma dos n�meros � " + soma);
		System.out.println("A m�dia dos n�meros � " + media);
	}
}	
