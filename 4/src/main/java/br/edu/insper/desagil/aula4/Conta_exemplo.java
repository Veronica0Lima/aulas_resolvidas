package br.edu.insper.desagil.aula4;

// área de import

public class Conta_exemplo {

    /* Especificação de como são os dados internos de um objeto do tipo Conta. */

    /* Especificação de como são os métodos de um objeto do tipo Conta. */
}

/*Conta conta; // variável com o nome de conta

 conta = new Conta(); // o new controi um novo objeto do tipo conta --> para funcionar, isso teria de estar em um método*/

public class Conta { // para funcionar, teria de estar num aqrquivo separado de come Conta

    private double saldo;

    public boolean saca(double valor) {
        if (valor > saldo) {
            return false;
        } else {
            saldo -= valor;
            return true;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
Conta conta = new Conta();

conta.setSaldo(100);

boolean sucesso = conta.saca(25);

System.out.println(sucesso);
System.out.println(conta.getSaldo());