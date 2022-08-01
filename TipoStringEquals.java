package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2"); // true
		
		String s1 = new String ("2");
		// embora os valores sejam os mesmos, o resultado retornará false, pois
		// a forma como eles foram especificados foi diferente.
		// Para analisarmos o CONTEÚDO  da str, devemos comparar com o método .equals
		System.out.println("2"== s1); 
		System.out.println("2".equals(s1)); // true
		
		Scanner entrada = new Scanner (System.in);
		String s2 = entrada.nextLine();
		
		System.out.println("2" == s2);
		System.out.println("2".equals(s2));
		System.out.println("2".equals(s2.trim())); // método .trim apaga os espaços em branco
		
		entrada.close();

	}

}
