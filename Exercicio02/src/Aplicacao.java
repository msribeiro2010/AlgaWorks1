import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Valor do Produto: ");
		Double valorProduto = scanner.nextDouble();
		
		Boolean precisaCobrarFrete = valorProduto < 100;
		
		Double valorFinal = valorProduto;
		
		if(precisaCobrarFrete) {
			valorFinal += 15.0;
		}
			
		System.out.println("Valor final: " + valorFinal);
		
		scanner.close();
	}

}
