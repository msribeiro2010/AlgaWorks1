
public class AplicacaoVerifica {

	public static void main(String[] args) {
		Double faturamentoDoDia = 1000.0;
		Double[] faturamentoJaneiro = new Double[] { 1500.0, 2000.0, 3000.0};
		Double[] faturamentoFevereiro = new Double[] { 2500.0, 3000.0, 4000.0};
		Double[][] faturamentoAnual = new Double[][] { faturamentoJaneiro, faturamentoFevereiro};
	    
//		System.out.println("Faturamento de 1o.de Janeiro: " + faturamentoAnual[0][0]);
//		System.out.println("Faturamento de 1o.de Fevereiro : " + faturamentoAnual[1][0]);
		
		for (int i = 0; i < faturamentoAnual.length; i++) {
			
			System.out.println("Mês: " + (i + 1) );
			
		}

	}

}
