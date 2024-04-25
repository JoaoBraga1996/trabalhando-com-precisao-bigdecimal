package numeros;

public class Principal2 {
	
	 public static void main(String[] args) {
	        ContaCorrente conta = new ContaCorrente();
	        conta.depositar(1.0);

	        conta.sacar(0.10);
	        conta.sacar(0.20);
	        conta.sacar(0.30);
	        conta.sacar(0.40);  // não vai conseguir sacar os 40 centavos, por o saldo vai estar 0.39 devido estar usando double

	        System.out.println(conta.getSaldo());
	    }


}
