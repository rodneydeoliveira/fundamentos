package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
	// Tipos num�ricos
	// byte, short, int, long s�o inteiros. float, double s�o decimais. Por padr�o, o tipo inteiro � int,
		// e double � o padr�o para numeros com ponto flutuante
		
		// Tipos booleanos = true e false. Letra min�scula
		
		// Tipo char = apenas 1 caractere, ex.: 'A'
		
		// String (n�o � um tipo primitivo) = primeira letra mai�scula, serve para 
		// textos entre aspas duplas. ex.: "Ol� Mundo!"t
		
		
		// Nota��o Ponto exemplo de String.
		
		String s = "Ol� Mundo!!!";
		s = s.replace("Ol�", "Hello"); // Troca o primeiro valor pelo segundo.
		s = s.toUpperCase(); // a vari�vel s recebeu a propria vari�vel, e a converteu em letras mai�sculas
		s = s.concat(" =D"); // Concatena um valor a variavel
		System.out.println(s);
		
		System.out.println("Rodney".toUpperCase()); // mudei o valor do conte�do sem precisar armazenar numa vari�vel
	
		
	}
}
