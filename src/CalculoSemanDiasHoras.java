import java.util.Scanner;

public class CalculoSemanDiasHoras {
	
	public static void main(String[] args) {
		
		//Programa que dado un numero total de horas, 
		//devuelve el numero de semanas, dias y horas equivalentes.
		
		Scanner entrada = new Scanner(System.in);
		int horasTotal, semanas, dias, horas;
		
		System.out.println("ingrese la cantidad de horas:");
		horasTotal = entrada.nextInt();
		
		semanas = horasTotal/168;
		dias = horasTotal%168 /24;
		horas = horasTotal%24;
		
		System.out.println("Ingrese la cantidad de horas deseada:");
		System.out.println("Semanas:"+semanas);
		System.out.println("Dias:"+dias);
		System.out.println("Horas:" +horas);
		
	}

}
