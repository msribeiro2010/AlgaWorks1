import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Liste abaixo os valores gastos com...");

		Double total = 0.0;
		
		System.out.print("Luz: ");
		total += scanner.nextDouble();
		
		System.out.print("Água: ");
		total += scanner.nextDouble();
		
		System.out.print("Telefone: ");
		total += scanner.nextDouble();
		
		System.out.print("filho: ");
		total += scanner.nextDouble();
		
		System.out.print("cartão: ");
		total += scanner.nextDouble();
		
		System.out.print("supermercado: ");
		total += scanner.nextDouble();
		
		System.out.println("O gasto total foi de: " + total);
		
		scanner.close();
	}

}
