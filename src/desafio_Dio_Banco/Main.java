package desafio_Dio_Banco;

public class Main {

	public static void main(String[] args) {
		Cliente bruno = new Cliente();
		bruno.setNome("Bruno");
		
		
		IConta cc = new ContaCorrente(bruno);
		cc.depositar(1720);
		
		IConta poupança = new ContaPoupanca(bruno);
		cc.transferir(500, poupança);
		
		cc.imprimirExtrato();
		poupança.imprimirExtrato();
	}
}
