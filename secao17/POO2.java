import java.util.Arrays;

public class POO2 {
    // Sabádo,06/06/2026_D'Tarde
              public static void main(String[] args) {
                System.out.println("1_Niveis de acesso");
               // 1 - Niveis de acesso
        Funcionario funcionario1 = new Funcionario("André Luis Kunert", 200000, "teste123");

        funcionario1.exibirDados();

        funcionario1.nome = "Andre Luis";
        funcionario1.salario = 150000;
      //  funcionario1.senha = "teste7531"; -> obs.: está protegita{protected}
        funcionario1.exibirDados();
        funcionario1.aumentarSalario(10);
           // System.out.println(funcionario1.verificarSenha());

        if(funcionario1.autenticar("teste123")) {
            System.out.println("Usuário entrou no sistema");
        }
        System.out.println("====//======//====");
        System.out.println(" 2_ Classe Imutavel");
         // 2_ Classe Imutavel
     // Sabádo, 06/06/2026_D'Noite
    PessoaImutavel Andre =  new PessoaImutavel("Andre", 44);
    System.out.println(Andre.getNome());
    System.out.println(Andre.getIdade());
    System.out.println("====//======//====");
        System.out.println(" 3 - Encapsulamento de arrays");
         // 3 - Encapsulamento de arrays
     // Sabádo, 06/06/2026_D'Noite

        String[] meusAlunos = {"Matheus", "João", "Maria"};

        Turma novaTurma = new Turma(meusAlunos);

        System.out.println(Arrays.toString(novaTurma.getAlunos()));

        String[] outrosAlunos = {"ALuno 1", "Aluno 2"};

        novaTurma.setAlunos(outrosAlunos);

        System.out.println(Arrays.toString(novaTurma.getAlunos()));

    System.out.println("The End");
        } 
    


}
