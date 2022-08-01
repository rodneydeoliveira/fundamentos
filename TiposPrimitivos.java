package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
	// Tipos numéricos
	// byte, short, int, long são inteiros. float, double são decimais. Por padrão, o tipo inteiro é int,
		// e double é o padrão para numeros com ponto flutuante
		
		// Tipos booleanos = true e false. Letra minúscula
		
		// Tipo char = apenas 1 caractere, ex.: 'A'
		
		// String (não é um tipo primitivo) = primeira letra maiúscula, serve para 
		// textos entre aspas duplas. ex.: "Olá Mundo!"t
		
		
		// Notação Ponto exemplo de String.
		
		String s = "Olá Mundo!!!";
		s = s.replace("Olá", "Hello"); // Troca o primeiro valor pelo segundo.
		s = s.toUpperCase(); // a variável s recebeu a propria variável, e a converteu em letras maiúsculas
		s = s.concat(" =D"); // Concatena um valor a variavel
		System.out.println(s);
		
		System.out.println("Rodney".toUpperCase()); // mudei o valor do conteúdo sem precisar armazenar numa variável
	
		
	}
}
