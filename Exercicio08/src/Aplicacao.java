import java.util.Scanner;

/*
 * Crie um programa que vai receber 
 * um número que será referente ao dia da semana (de 1 até 7). 
 * Dependendo do número informado você deve imprimir o nome desse dia.
 * Se o número 1 for informado, então deverá ser impresso "domingo", se 2,
 * então "segunda-feira" e por ai vai.
 */


public class Aplicacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite número da semana: ");
		Integer numeroSemana = scanner.nextInt();
		
		String dia;
		
		switch (numeroSemana) {
		case 1: dia = "Domingo";
		break;
		case 2: dia = "Segunda-feira";
		break;
		case 3: dia = "Terça-feira";
		break;
		case 4: dia = "Quarta-feira";
		break;
		case 5: dia = "Quinta-feira";
		break;
		case 6: dia = "Sexta-feira";
		break;
		case 7: dia = "Sábado";
		break;
		default:dia = "Inválido";
		}
		System.out.println("O dia escolhido foi: " + dia);
				scanner.close();
			
	}

}
