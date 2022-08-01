package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; // Houve uma convers�o impl�cita de int para double. 
		// na sa�da do programa, o valor gerado ser� 1.0
		System.out.println(a);
		
		float b = (float) 1.12345; // Por menor que seja o valor, o tipo
		// literal ser� double, por padr�o. Para tornar o n�mero em
		// float, precisamos colocar um F mai�sculo no final do n�mero, 
		// ou escrever (float) entre parenteses antes do n�mero - convers�o expl�cita (CAST)
		System.out.println(b);
		
		double c = 1.333;
		int d = (int) c; // Cast de double para int. O valor das casas decimais
		// ser�o perdidos
		System.out.print(d);
		System.out.println(" Perda de casas decimais");
		
	}
	
}
