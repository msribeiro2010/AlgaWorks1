import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		String[] cardapio  = new String[] {"Calabresa;", "Atum;", "Queijo;", "Mussarela;"};
		
		System.out.println("Escolha um sabor: ");
		
		for (int i = 0; i < cardapio.length; i++) {
			System.out.println("[" + i + "]  " + cardapio[i]);
			
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o número referente ao sabor: ");
		Integer saborEscolhido = scanner.nextInt(); 
		
		System.out.println("O sabor escolhido do pedido foi: " + cardapio[saborEscolhido] );
		
		scanner.close();
	}

}
