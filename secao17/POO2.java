public class POO2 {
    // Sabádo,06/06/2026_D'Tarde
              public static void main(String[] args) {
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
        } 
     
}
