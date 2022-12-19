	import java.util.Scanner;
	
	public class Aplicacao {
	
		public static void main(String[] args) {
			
	        Scanner scanner = new Scanner(System.in);
			
			imprimirTraco();
			
			String[] cursos = new String[] { "JAVA EE", "ORIENTACAO OBJETO", "FUNDAMENTOS JAVA", "JAVA SCRIPT"};
			
			System.out.println("Escolha o curso abaixo: ");
		    
			metodoIteracao(cursos);
			
			System.out.print("O curso que você escolheu é o: ");
			
			Integer posicaoCursoEscolhido = scanner.nextInt();
			
			Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
			
			if (!posicaoValida) {
				encerrarProgramaPorCausaDePosicaoInvalida();
			}
			imprimirTraco();
			
			
		    String[] formasPagamento = new String[] {"Cartao","Boleto"};
		    System.out.println("Escolha a forma de pagamento: ");
		  
		    metodoIteracao(formasPagamento);
		    
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
			imprimirTraco();
			}
		
		//Criando os métodos para diminuir o algoritmo acima
		
		static void imprimirTraco() {
			System.out.println("================================================================================");
		}
		
		static void encerrarProgramaPorCausaDePosicaoInvalida() {
			System.err.println("Posição inválida!");
			System.exit(1);
		}
		
		static void metodoIteracao(String[] vetor) {
			for (int i = 0; i < vetor.length; i++) {
				System.out.println("[" + i + "]" + vetor[i]);
			}
		}
	}