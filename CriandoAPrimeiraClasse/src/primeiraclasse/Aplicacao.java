package primeiraclasse;

public class Aplicacao {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Sabonete";
		produto.precoUnitario = 12.00;
		produto.quantidade = 30;
		
		exibirQuantidadeEmEstoque(produto);

	}
	
	static void exibirQuantidadeEmEstoque(Produto produto) {
		
		System.out.println("Quantidade em estoque: " + produto.nome + " é " + produto.quantidade + " unidades.");
		
		
	}

}
