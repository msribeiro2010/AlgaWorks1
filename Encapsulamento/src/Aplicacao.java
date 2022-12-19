
public class Aplicacao {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Marcelo Ribeiro");
		cliente.setTelefone("02020202020");
		
		System.out.println("Nome do Cliente: " + cliente.getNome());
		System.out.println("Primeiro Nome: " + cliente.getPrimeiroNome());
		System.out.println("Ultimo Nome: " + cliente.getUltimoNome());
		
	}

}
