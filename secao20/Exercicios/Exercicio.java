package secao20.Exercicios;
/**
    > Exercício 1: Composição de Objetos (Object Composition)
    
    Enunciado: Crie uma classe Endereco que tenha os atributos rua, numero e cidade. 
    Agora, crie uma classe Pessoa que tenha atributos como nome, idade 
    e um atributo de composição endereco, que será do tipo Endereco. 
    Implemente um método exibirInformacoes() em Pessoa que exiba os dados da pessoa e 
    seu endereço completo.

    > Exercício 2: Herança e Sobrescrita de Métodos (Overriding)
    
    Enunciado: Crie uma classe Veiculo com o método acelerar() que exibe a mensagem "O veículo está acelerando". 
    Crie duas subclasses, Carro e Moto, que herdem de Veiculo. 
    Na subclasse Carro, sobrescreva o método acelerar() para exibir "O carro está acelerando". 
    Na subclasse Moto, sobrescreva o método para exibir "A moto está acelerando". 
    Crie uma classe principal e teste o polimorfismo com os diferentes tipos de veículos.

    > Exercício 3: Uso do Método super
    
    Enunciado: Crie uma classe base Animal com atributos como nome e som, 
    além de um construtor que inicialize esses atributos. 
    Crie uma subclasse Cachorro que, além de herdar de Animal, tenha um atributo raca. 
    No construtor de Cachorro, use a palavra-chave super para chamar o construtor da classe Animal e 
    inicializar nome e som. Crie um método exibirDetalhes() que exibe o nome, o som e a raça do cachorro.

    > Exercício 4: Classe Abstrata e Interface

    Enunciado: Crie uma classe abstrata Funcionario com um atributo nome e um método abstrato calcularSalario(). 
    Crie duas subclasses, FuncionarioTempoIntegral e FuncionarioMeioPeriodo, 
    que implementam o método calcularSalario(). 
    Além disso, crie uma interface Beneficios com um método adicionarBeneficio(). 
    As duas subclasses devem implementar essa interface, adicionando diferentes benefícios a cada tipo de funcionário.

    // extends CLASSE_A implements CLASSE_B

    > Exercício 5: Implementação de Múltiplas Interfaces e Polimorfismo

    Enunciado: Crie duas interfaces: Pilotavel com o método pilotar(), e Navegavel com o método navegar(). 
    Crie uma classe Barco que implementa a interface Navegavel 
    e uma classe Aviao que implementa a interface Pilotavel. 
    Agora, crie uma classe Hidroaviao que herda de Barco e implementa tanto Pilotavel quanto Navegavel.
    Na classe principal, use polimorfismo para criar uma função operarVeiculo() 
    que aceite tanto Navegavel quanto Pilotavel e execute os métodos corretos com base no tipo de objeto passado.

 */

public class Exercicio {
    public static void main(String[] args) {
        
    System.out.println("===Exercicio===");
    System.out.println(" Exercício 1");
    Endereco endereco = new Endereco("Rua teste", 123, "São Paulo");
    Endereco endereco1 = new Endereco("Street For", 123, "Vancouver_Canada");
    
        Pessoa pessoa = new Pessoa("Matheus", 33, endereco);
        Pessoa pessoa1 = new Pessoa("Andre Luis", 49, endereco);
    pessoa.exibirInfo();
        System.out.println("===//===///=====////=====///===///======");
    System.out.println("Exercício 2 ");
       Carro carro = new Carro();
       Moto moto = new Moto();
       moto.acelerar();
        
        System.out.println("===//===///=====////=====///===///======");
    System.out.println("Exercício 3 ");
    // System.out.println("Próximo....");
    //  Cachorro bob = new Cachorro("Bob", "latido", "Poodle");

    //     bob.exibirDetalhes();
     Cachorro Alfa = new Cachorro("Alfa", "latido", "Cane Goso");

        Alfa.exibirDetalhes();
 System.out.println("===//===///=====////=====///===///======");
    System.out.println("Exercício 4");
    // System.out.println("Próximo....");
       FuncionarioTempoIntegral fti = new FuncionarioTempoIntegral("Ana", 4000);
        FuncionarioMeioPeriodo fmp = new FuncionarioMeioPeriodo("Pedro", 50, 120);

        System.out.println("Salario Ana " + fti.calcularSalario());

        System.out.println("Salário Pedro " + fmp.calcularSalario());

        fti.adicionarBeneficio("Plano de saúde e VA");

        fmp.adicionarBeneficio("VA");
        System.out.println("===//===///=====////=====///===///======");
    System.out.println("Exercício 5");
    System.out.println("Próximo....");
System.out.println();
    System.out.println("The End....");
    }
}
