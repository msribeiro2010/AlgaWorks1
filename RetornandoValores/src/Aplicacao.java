import java.util.Scanner;

public class Aplicacao {
	
		public static void main(String[] args) {
			
	      	Scanner scanner = new Scanner(System.in);
			
			imprimirTraco();
			
			String[] cursos = new String[] { "JAVA EE", "ORIENTACAO OBJETO", "FUNDAMENTOS JAVA", "JAVA SCRIPT"};
			
			imprimir("Escolha o curso abaixo: ");
		    metodoIteracao(cursos);
			
			 Integer posicaoCursoEscolhido = receberNumeroInteiro( "O curso escolhido foi:  ", scanner);
			
			Boolean posicaoValida = verificaEscolhaUsuario(posicaoCursoEscolhido, cursos);
					//posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
			
			if (!posicaoValida) {
				encerrarProgramaPorCausaDePosicaoInvalida();
			}
			imprimirTraco();
			
			
		    String[] formasPagamento = new String[] {"Cartao","Boleto"};
		    System.out.println("Escolha a forma de pagamento: ");
		  
		    metodoIteracao(formasPagamento);
		    
		    Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiro("Sua forma de pagamento escolhida: ", scanner);
		    
		    posicaoValida = verificaEscolhaUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);
		    		//posicaoFormaPagamentoEscolhida >= 0 
		    		//        && posicaoFormaPagamentoEscolhida < formasPagamento.length;
		    
		    if (!posicaoValida) {
		    	encerrarProgramaPorCausaDePosicaoInvalida();
		    }
		    String cursoEscolhido = cursos[posicaoCursoEscolhido];
		    String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
	        
		    imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
			
			scanner.close();
			imprimirTraco();
			}
		
		//Criando os métodos para diminuir o algoritmo acima
		
		static Integer receberNumeroInteiro(String texto, Scanner scanner) {
			imprimirEContinuarNaMesmaLinha(texto);
			Integer numero = scanner.nextInt();
			return numero; 
		}
		
		
		
		static Boolean verificaEscolhaUsuario (Integer posicao, String[] vetor) {
			Boolean valida = posicao >= 0  && posicao < vetor.length;
			return valida;
		}
		
		
		static void imprimir(String texto) {
			System.out.println(texto);
			
		}
		
		static void imprimirEContinuarNaMesmaLinha(String texto) {
			System.out.print(texto);
			
		}
		
		static void imprimirTraco() {
			imprimir("================================================================================");
		}
		
		static void encerrarProgramaPorCausaDePosicaoInvalida() {
			System.err.println("Posição inválida!");
			System.exit(1);
		}
		 
		static void metodoIteracao(String[] vetor) {
			for (int i = 0; i < vetor.length; i++) {
				imprimir("[" + i + "]" + vetor[i]);
			}
		}
}
