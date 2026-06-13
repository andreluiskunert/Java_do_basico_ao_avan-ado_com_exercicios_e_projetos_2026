// // /*public class Funcionario {
// //    // Sabádo,06/06/2026_D'Tarde
// //    public String nome;
// //    protected double salario;
// //    private String senha;

// //    public Funcionario(String nome, double salario, String senha){
// //     this.nome = nome;
// //     this.salario = salario;
// //     this.senha = senha;
// //     }
// //    public void exibirDados(){
// //        System.out.println("Nome: " + nome + ", salario: " + salario + ", senha: " + senha);
// //    }
// //     protected void aumentarSalario(double porcentagem) {
// //         this.salario += ((this.salario * porcentagem) / 100);
// //         System.out.println("O salário agora é de: " + salario);
// //     }

// //     private boolean verificarSenha(String tentativaSenha) {
// //         return this.senha.equals(tentativaSenha);
// //     }

// //     public boolean autenticar(String tentativaSenha) {
// //         // outras logicas
// //         return verificarSenha(tentativaSenha);
// //     }
    
// // }
// //     */
// //    package secao17;

// // /*
// //  * 
// //     > Exercício 1: Criando uma Classe Celular

// //     Crie uma classe Celular que tenha as seguintes propriedades: marca, modelo, bateria. 
// //     Implemente os métodos para ligar e desligar o celular, 
// //     e outro método que simule o consumo da bateria quando o celular é usado. 
// //     Crie a classe principal para instanciar dois objetos Celular 
// //     e testar os métodos criados.

// //     > Exercício 2: Classe Aluno com Encapsulamento e Construtores

// //     Crie uma classe Aluno com as propriedades privadas nome, matricula, notaFinal. 
// //     Adicione um construtor parametrizado para inicializar essas propriedades e 
// //     implemente os setters e getters com validação para garantir
// //     que o nome não esteja vazio e a nota final esteja entre 0 e 100. 
// //     Na classe principal, crie dois objetos da classe Aluno, 
// //     atribua valores e exiba as informações.

// //     > Exercício 3: Classe ContaCorrente com Métodos e Encapsulamento

// //     Implemente uma classe ContaCorrente com as propriedades privadas titular, saldo e limiteSaque. 
// //     Crie os métodos para depositar(), sacar() e exibirSaldo(). 
// //     O método de saque deve verificar se o valor é menor ou igual ao limite de saque 
// //     e se o saldo é suficiente. 
// //     Crie dois objetos da classe ContaCorrente e teste os métodos criados.

// //     > Exercício 4: Classe ProdutoEletronico com Método dentro de Método

// //     Crie uma classe ProdutoEletronico com as propriedades nome, preco, e garantia. 
// //     Implemente um método para aplicar desconto no preço e, dentro desse método, 
// //     chame outro método que calcula o valor do desconto. 
// //     Crie um objeto da classe ProdutoEletronico, aplique o desconto 
// //     e exiba as informações após a alteração do preço.

// //     > Exercício 5: Classe LivroBiblioteca com Lógica em Setters e Getters

// //     Crie uma classe LivroBiblioteca com as propriedades privadas titulo, autor, e disponivel (boolean). 
// //     Adicione métodos para pegar emprestado (definindo disponivel como false) 
// //     e devolver o livro (definindo disponivel como true). 
// //     Nos setters e getters, adicione a lógica para verificar se o livro está disponível 
// //     ou já emprestado antes de permitir a ação. 
// //     Na classe principal, instancie dois livros e simule o processo de empréstimo e devolução.
    
// // */

// // public class Exercicios {
    
// //     public static void main(String[] args) {
        
// //         // Exercício 1
// //         Celular iphone = new Celular();

// //         iphone.marca = "Apple";
// //         iphone.modelo = "Iphone 15";

// //         iphone.ligar();

// //         iphone.desligar();

// //         iphone.usar(10);

// //         Celular s10 = new Celular();

// //         iphone.marca = "Samsung";
// //         iphone.modelo = "S10";

// //         s10.usar(15);

// //         // Exercício 2
// //         Aluno pedro = new Aluno("Pedro", 123, 33.3);

// //         System.out.println(pedro.getNome());

// //         System.out.println(pedro.getNotaFinal());

// //         pedro.setNome("Pedro Alves");

// //         pedro.setNotaFinal(50.0);

// //         pedro.exibirInfo();

// //         Aluno maria = new Aluno("Maria", 1234, 99.9);

// //         maria.exibirInfo();

// //         // Exercício 3
// //         ContaCorrente conta1 = new ContaCorrente("José", 5000.0, 800.0);

// //         conta1.depositar(1100);

// //         conta1.sacar(950);

// //         conta1.sacar(500);

// //         conta1.exibirSaldo();

// //         // Exercicio 4
// //         ProdutoEletronico microondas = new ProdutoEletronico("Microondas", 400, 12);

// //         microondas.aplicarDesconto(15);

// //         microondas.exibirInfo();

// //         // Exercício 5
// //         LivroBiblioteca livro1 = new LivroBiblioteca();

// //         livro1.setTitulo("Java: Como Programar");

// //         livro1.devolver();

// //         livro1.pegarEmprestado();

// //         livro1.pegarEmprestado();

// //         livro1.devolver();

// //     }

// // }
// package secao17;

// public class Funcionario{
    

//     private String nome;
//     private double preco;

//     // REGRA DE NEGOCIOS = CODIGO
//     // é como a empresa define que o software vai funcionar
//     public void setNome(String nome) {

//         if(nome != null && !nome.isEmpty() && nome.length() > 3) {
//             this.nome = nome;
//         } else {
//             System.out.println("O nome enviado não atende os critérios.");
//         }

//     }

//     public String getNome() {
//         return nome.toUpperCase();
//     }

//     public void setPreco(double preco) {
//         if(preco > 0) {
//             this.preco = preco;
//         } else {
//             System.out.println("O preço precisa ser positivo.");
//         }
//     }

//     public String getPreco() {
//         return String.format("R$%.2f", preco);
//     }

//     public String getProdutoInfo() {
//         return "Nome: " + this.getNome() + ", Preço: " + this.getPreco();
//     }

//     public void aplicarDesconto(double porcentagem) {

//         if(porcentagem > 0 && porcentagem <= 100) {

//             double desconto = calcularDesconto(porcentagem);

//             double precoFinal = this.preco - desconto;

//             this.setPreco(precoFinal);

//             System.out.println("Desconto de " + porcentagem + "% aplicado!");

//             System.out.println(this.getProdutoInfo());

//         } else {
//             System.out.println("Porcentagem inválida.");
//         }

//     }

//     private double calcularDesconto(double porcentagem) {
//         return (this.preco * porcentagem) / 100;
//     }

// }
package secao17;

public class Funcionario {

    public String nome;
    public double salario;
    private String senha;

    public Funcionario(String nome, double salario, String senha) {
        this.nome = nome;
        this.salario = salario;
        this.senha = senha;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }

    public void aumentarSalario(double percentual) {
        salario += salario * percentual / 100;
    }

    public boolean autenticar(String senhaDigitada) {
        return senha.equals(senhaDigitada);
    }
}