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
        System.out.println("+++-----=====///====///=====");
        System.out.println("3 - Classe Object");
        Pessoa matheus = new Pessoa("Andre Luis", 44);
        Pessoa pedro = new Pessoa("Ana Paula", 22);

        System.out.println(matheus.toString());

        System.out.println(matheus.equals(pedro));

        System.out.println(matheus.hashCode());
        System.out.println();
        System.out.println("The End");
    }
}
