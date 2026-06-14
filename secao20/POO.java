package secao20;
// Terça-feira, 09/06/2026_D'Noite

public class POO {
    public static void main(String[] args) {
            // 1 - Object Composition
            System.out.println("1 - Object Composition");
        Motor motor1 = new Motor("V8", 450);

        Carro carro1 = new Carro("Ford", "Mustang", motor1);

        carro1.exibirInfo();

        carro1.motor.exibirInfo();
        System.out.println("+++-----=====///====///=====");
        //
         // Quarta-feira,10/06/2026_D'noite
          // 2 - Herança
          System.out.println(" 2 - Herança");
        Cachorro Monstro = new Cachorro("Monstro");

            Monstro.latir();

            Monstro.emitirSom();

        Animal leao = new Animal("Shark");

        leao.emitirSom();
        System.out.println();
        System.out.println("+++-----=====///====///=====");
        System.out.println("3 - Classe Object");
        Pessoa matheus = new Pessoa("Andre Luis", 44);
        Pessoa pedro = new Pessoa("Ana Paula", 22);

        System.out.println(matheus.toString());

        System.out.println(matheus.equals(pedro));

        System.out.println(matheus.hashCode());
        System.out.println();
        System.out.println("+++-----=====///====///=====");
        System.out.println("4 - Override");
        Quadrado q1 = new Quadrado(4);
        Circulo c1 = new Circulo(3.2);
        System.out.println("O quadrado tem o valor de : " + q1.calcularArea());
        System.out.println("O circulo tem o valor de : " + c1.calcularArea());
         System.out.println();
        System.out.println("+++-----=====///====///=====");
        System.out.println("5 - super");
          Funcionario funcionario = new Funcionario("Carlos", 3000);

        Gerente gerente = new Gerente("Marcos", 5000, 1000);

        funcionario.exibirDetalhes();

        gerente.exibirDetalhes();

        System.out.println(funcionario.calcularBonus());

        System.out.println(gerente.calcularBonus());
        System.out.println("+++-----=====///====///=====");
        System.out.println("6  - Classe abstrata");
        // Sabádo,13/06/2026_D'Tarde
           InstrumentoMusical violao = new Violao("violão");
        InstrumentoMusical bateria = new Bateria("bateria");

        violao.exibirDetalhes();
        bateria.exibirDetalhes();
         System.out.println("+++-----=====///====///=====");
        System.out.println("7 - Interfaces");
        // Domingo,14/06/2026_D'madrugada
        Pagamento cartao = new CartaoCredito();
        Pagamento transf = new TransferenciaBancaria();

        cartao.processarPagamento(100);
        cartao.exibirRecibo(100);

        transf.processarPagamento(250);
        transf.exibirRecibo(250);
          System.out.println("+++-----=====///====///=====");
        System.out.println("8 - Multiplas interface");
        System.out.println("proxima aula....");

        System.out.println();



        System.out.println("The End");
    }
}
