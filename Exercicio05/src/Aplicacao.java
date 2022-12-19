import java.util.Scanner;

public class Aplicacao {
	static final Double notaDesclassificatoriaGeral = 150.0;
	static final Double notaMinima = 60.0;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nota de Português: ");
		Double notaDePortugues = scanner.nextDouble();
		
		System.out.print("Nota de Matemática: ");
		Double notaDeMatematica = scanner.nextDouble();
		
	   Boolean estaAcimaDoMinimoEmPortugues = notaDePortugues >= notaMinima;
	   Boolean estaAcimaDoMinimoEmMatematica = notaDeMatematica >= notaMinima;
	   
	   Double notaTotal = notaDePortugues + notaDeMatematica;
	   Boolean temNotaParaPassar = notaTotal >= notaDesclassificatoriaGeral;
	   Boolean passou = temNotaParaPassar && estaAcimaDoMinimoEmMatematica && estaAcimaDoMinimoEmPortugues;
	   
	   if(passou) {
		   System.out.println("Parabéns passou no concurso!");
	   }else {
		   System.out.println("Nota insuficiente para aprovação!");
	   }
	}
	
}
