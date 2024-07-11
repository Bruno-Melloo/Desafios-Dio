package desafio_Dio_Banco;

public interface IConta {

	// Interface é uma classe abstrata com todos os métodos abstratos
	// Métodos
	void sacar(double valor);

	void depositar(double valor);

	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();

}
