package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; // Houve uma conversão implícita de int para double. 
		// na saída do programa, o valor gerado será 1.0
		System.out.println(a);
		
		float b = (float) 1.12345; // Por menor que seja o valor, o tipo
		// literal será double, por padrão. Para tornar o número em
		// float, precisamos colocar um F maiúsculo no final do número, 
		// ou escrever (float) entre parenteses antes do número - conversão explícita (CAST)
		System.out.println(b);
		
		double c = 1.333;
		int d = (int) c; // Cast de double para int. O valor das casas decimais
		// serão perdidos
		System.out.print(d);
		System.out.println(" Perda de casas decimais");
		
	}
	
}
