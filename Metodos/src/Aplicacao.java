import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		imprimirtraco();
		
		String[] cursos = new String[] { "JAVA EE", "ORIENTACAO OBJETO", "FUNDAMENTOS JAVA", "JAVA SCRIPT"};

		System.out.println("Escolha o curso abaixo: ");
						
		for (int i = 0; i < cursos.length; i++) {
			System.out.println("[" + i + "]" + cursos[i]);
		}
		
		System.out.print("O curso que você escolheu é o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
	
		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}
		
		imprimirtraco();
		
	    String[] formasPagamento = new String[] {"Cartao","Boleto"};
	    
	    System.out.println("Escolha a forma de pagamento: ");
	  
	    for (int i = 0; i < formasPagamento.length; i++) {
	    	System.out.println("[" + i + "]" + formasPagamento[i]);
		}
	    System.out.print("Sua forma de pagamento escolhida: ");
	    Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
	    
	    posicaoValida = posicaoFormaPagamentoEscolhida >= 0 
	    		        && posicaoFormaPagamentoEscolhida < formasPagamento.length;
	    
	    if (!posicaoValida) {
	    	encerrarProgramaPorCausaDePosicaoInvalida();
	    }
	    String cursoEscolhido = cursos[posicaoCursoEscolhido];
	    String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
        
	    System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
		scanner.close();
		imprimirtraco();
		}
	static void imprimirtraco() {
		System.out.println("================================================================================");
	}
	
	static void encerrarProgramaPorCausaDePosicaoInvalida() {
		System.err.println("Posição inválida!");
		System.exit(1);
	}
}