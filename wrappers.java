package fundamentos;

public class wrappers {
	public static void main(String[] args) {
		// Usamos os Wrappers para transformar tipos primitivos
		// em objetos. Assim acessamos as funções reservadas dos objetos
		// ex b.toString....
		
		// byte
		Byte b = 100;
		Short s = 1000;
		// Integer.parseInt - converte string em int
		Integer i = 1000;
		Long l = 10000L; // para acessar o wrapper de Long, temos
		// que colocar a letra L no final
		
		Float f =123.10F;
		System.out.println(f);
		
		Double d = 12345.6789;
		System.out.println(d);

		System.out.println(b.byteValue());
		System.out.println(s.toString()); // valor de s virou uma String
		
		Boolean bo = Boolean.parseBoolean("true");// valor booleano virou str
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c.toString());
	}
}
