package secao20;

public class TransferenciaBancaria implements Pagamento {
     @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento de R$:" + valor + ", via transferencia bancária");
    }
}
