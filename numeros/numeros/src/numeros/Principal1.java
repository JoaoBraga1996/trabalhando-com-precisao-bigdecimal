package numeros;

public class Principal1 {

	public static void main(String[] args) {
		double valorTotal = 2.05;
		double valorPago = 1.05;

		double valorDevido = valorTotal - valorPago;

		System.out.println(valorDevido);  // 0.9999999999999998
	}

}



/*devido à representação de números de ponto flutuante em computadores, especialmente em linguagens de
programação como Java, que usam o padrão IEEE 754., esse padrao usa representacao binaria
Quando você realiza operações aritméticas com números de ponto flutuante,
como subtração, pode ocorrer uma pequena imprecisão nos resultados devido à forma como os números são armazenados na memória do computador.*/