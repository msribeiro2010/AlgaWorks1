import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 Crie um programa que vai receber, através do console, uma lista de atividades 
 que vai ajudar o usuário a planejar suas tarefas para o dia seguinte.
Depois que o usuário informar, uma a uma, suas tarefas, as mesmas serão 
salvas em um arquivo de texto - cada tarefa vai ocupar uma linha desse arquivo.
Para receber cada tarefa do usuário, use o laço while. Enquanto o usuário 
não digitar um "x" no console, continue pedindo que ele informe as atividades.
Elaboradas com o curso de Lógica de Programação.....
 */
public class Aplicacao {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		String tarefa;
		int i = 0;
		while(true) {
			System.out.print("[Tarefa] - " + i + ": " );
		    
		tarefa = scanner.nextLine();
		    
		 if ("x".equals(tarefa))  {
			 System.out.println("Saiu das Tarefas...");
			 break;
					 
		 }
		 
		 linhas.add(tarefa);
		 i++; 
		}
		 escrevaNoArquivo("/Users/marceloribeiro/Desktop/CURSOS_ONLINE/ALGAWORKS/ARQUIVO.TXT", linhas); 
      
	}

	static void escrevaNoArquivo(String arquivo, ArrayList<String> linhas) throws IOException {
		Path path = Paths.get(arquivo);
		Files.write(path, linhas);
			
	}

}
