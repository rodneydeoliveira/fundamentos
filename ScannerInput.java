package fundamentos;

import java.util.Scanner;

public class ScannerInput {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in); /* Aqui n�s definimos
		 o m�todo de entrada (in), que por padr�o ser� o que o usu�rio
		 digitar no teclado */
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt(); /* Ap�s o nextint, precisamos fazer 
		uma quebra de linha, com o comando nextLine */
		
		entrada.nextLine();
		
		System.out.print("Qual seu apelido: ");
		String apelido = entrada.nextLine();
		
		System.out.printf("Nome: %s %nSobrenome: %s %nIdade: %d %nApelido: %s" 
		, nome, sobrenome, idade, apelido);
		
		entrada.close();
		
	}
}
