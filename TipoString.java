package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		String nome = "Rodney Lucas";
		System.out.println(nome.charAt(9)); // exibe o índice 9 da String
		System.out.println(nome + "!!!");
		System.out.println(nome.toUpperCase());
		
		var empregado = "Rodney";
		var idade = 28;
		var salario = 3000.00;
		
System.out.printf("O senhor %s tem %d anos e ganha %.2f "+ "\n", empregado, idade, salario);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6, 11));
	
	}
}

	
	