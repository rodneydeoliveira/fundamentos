package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número: ");
		
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número: ");
		System.out.println(valor1 + valor2); // concatenou os números
	
		double numero1 = Double.parseDouble(valor1); // conversão do valor 1 (str) em double,
		                                 // e guardada em uma nova variável
		double numero2 = Double.parseDouble(valor2); // conersão str -> double
		double soma = (numero1 + numero2);
		double media = (soma / 2);
		
		System.out.println("A soma dos números é " + soma);
		System.out.println("A média dos números é " + media);
	}
}	
