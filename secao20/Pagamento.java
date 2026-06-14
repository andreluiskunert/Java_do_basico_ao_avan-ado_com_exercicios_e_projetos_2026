package secao20;

interface Pagamento {
    // Abstrato
  void processarPagamento(double valor);
 //  Default 
 default void exibirRecibo(double valor) {
        System.out.println("Recibo do pagamento, com valor de R$" + valor);
    }
    
} 