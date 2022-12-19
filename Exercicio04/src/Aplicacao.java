import java.util.Scanner;

public class Aplicacao {
	
	static final Integer idadeMinimaParaAposentar = 55;
	static final Integer tempoMinimoDeContribuicao = 25;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Idade: ");
		Integer idade = scanner.nextInt();
		
		System.out.print("Tempo de Contribuição: ");
		Integer contribuicao = scanner.nextInt();
		
		Boolean temIdadeParaAposentar = idade >= idadeMinimaParaAposentar;
		Boolean temTempoDeContribuicaoSuficiente = contribuicao >= tempoMinimoDeContribuicao;
		Boolean podeAposentar = temIdadeParaAposentar && temTempoDeContribuicaoSuficiente;
		
		if (podeAposentar) {
			System.out.println("Pode aposentar!");
		} else {
			System.out.println("Não atingiu o período de aposentadoria exigido por lei!");
		}
		
		scanner.close();
	

	}

}
