package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
	
		Integer num1 = 1000;
		System.out.println(num1.toString().length/*len*/()); // conversao int -> str
		
		int num2 = 2000;
		System.out.println(Integer.toString(num2)); // conversao int -> str
		
		System.out.println("" + num2); // ao concatenar o valor de um int
		// com um string vazia, esse int é convertido em string
		
		
		
		
	}
}
