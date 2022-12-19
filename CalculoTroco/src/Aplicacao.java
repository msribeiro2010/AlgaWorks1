/* Sua tarefa agora é pegar a classe CalcularValorTroco do 
 * capítulo 2 e utilizar a nossa biblioteca AlgaWorksConsole 
 * ao invés da classe Scanner diretamente.
 * 
 */

public class Aplicacao {

	public static void main(String[] args) {
		
		Iteracao iteracao = new Iteracao();
		Double valorProduto = iteracao.lerDecimal("Digite o valor do produto: ");
		Double valorPassadoPeloCliente = iteracao.lerDecimal("Digite qte passada para o Cliente: ");
		Double resultado = valorPassadoPeloCliente - valorProduto;
		iteracao.imprimir("Imprimir troco: " + resultado);
		iteracao.fechar();
			

	}

}
