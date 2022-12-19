
public class Aluno {
	
	String nome;
	
	boolean VemDepoisDe(Aluno aluno) {
		 if (aluno == null) {
			 return false;
		 }
		 return nome.compareTo(aluno.nome) > 0;
	}

}
