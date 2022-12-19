import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
				
		ArrayList<String> linhas = new ArrayList<String>();
		
		for (int i = 0; i < 10; i++) {
			
			 System.out.print("Digite os participante " + i + ": ");
			
			String nome = scanner.nextLine();
			 
			 linhas.add(nome);
		}
				
		Path arquivo = Paths.get("/Users/marceloribeiro/Desktop/CURSOS_ONLINE/ALGAWORKS/ARQUIVO.TXT"); 
		Files.write(arquivo, linhas);
		
		scanner.close();
		System.out.println("Fim...");
	}
}
