
public class Aplicacao {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.nome = "iMac";
		produto.quantidadeEmEstoque = 9;
	
 System.out.println("Necessário repor estoque do produto " + 
 produto.nome + "? " + produto.necessitaReposicaoEmEstoque());
		
	
	}
	   

}
