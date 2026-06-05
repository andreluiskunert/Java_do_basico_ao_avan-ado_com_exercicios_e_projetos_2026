public class ContaCorrente {
   
  private String titular;
  private double saldo;
  private double limiteSaque;

  public ContaCorrente(String titular, double saldo, double limiteSaque) {
    this.titular = titular;
    this.saldo = saldo;
    this.limiteSaque = limiteSaque;
  }

  public void depositar(double valor) {
    saldo += valor;
    System.out.println("Depósito de: " + valor + ", o saldo agora é: " + saldo);
  }

  public void sacar(double valor) {
    if(valor <= saldo && valor <= limiteSaque) {
      saldo -= valor;
      System.out.println("Saque de: " + valor + ", o saldo agora é: " + saldo);
    } else {
      System.out.println("Saque inválido.");
    }
  }

  public void exibirSaldo() {
    System.out.println("Titular: " + titular + ". Tem na conta o total de: " + saldo);
  }

}

/* 
ContaBancaria.java


package secao17;

public class ContaBancaria {
   
  private String titular;
  private double saldo;

  public void setTitular(String titular) {

    // lógica para validar ou manipular
    if(titular != null && !titular.isEmpty()) {
      this.titular = titular;
    } else {
      System.out.println("Nome do titular invalido");
    }

  }

  public void setSaldo(double saldo) {

    if(saldo >= 0) {
      this.saldo = saldo;
    } else {
      System.out.println("O valor precisa ser positivo");
    }

  }

  public void exibirInfo() {
    System.out.println("Titular: " + titular + ", saldo: R$" + saldo);
  }


  public String getTitular() {
    return titular;
  }

  public String getSaldo() {
    return "R$ " + saldo;
  }

}
 */