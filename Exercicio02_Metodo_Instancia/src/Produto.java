
public class Produto {
	
	static final Integer QTE_MINIMA_ESTOQUE = 10; // definindo uma constante;

	String nome;
	Integer quantidadeEmEstoque;
	
    Boolean necessitaReposicaoEmEstoque() {
	   if(quantidadeEmEstoque < QTE_MINIMA_ESTOQUE) {
		  return true;
		  }
		  
		  return false;
	}

} 


