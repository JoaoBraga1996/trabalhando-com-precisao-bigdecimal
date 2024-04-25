package numeros;

import java.math.BigDecimal;

public class Principal3 {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(new BigDecimal(1.0));

        conta.sacar(new BigDecimal(0.10));
        conta.sacar(new BigDecimal(0.20));
        conta.sacar(new BigDecimal(0.30));
        conta.sacar(new BigDecimal(0.40));

        System.out.println(conta.getSaldo());
    }

}


// instanciar um bigdecimal, mas usando a sobrecarga usando double, ele vai dar um erro de precisão também
// Saque: 0.40000000000000002220446049250313080847263336181640625, Saldo: 0.3999999999999999944488848768742172978818416595458984375