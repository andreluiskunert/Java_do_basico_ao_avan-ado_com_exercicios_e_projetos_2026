package secao20;

public class Gerente extends Funcionario {
        //Quinta-feira,11/06/2026_D'noite
         private double bonusAdicional;

    public Gerente(String nome, double salario, double bonusAdicional) {
        super(nome, salario);

        this.bonusAdicional = bonusAdicional;
    }

    @Override
    public double calcularBonus() {
        return super.calcularBonus() + bonusAdicional;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Bonus adicional de: " + bonusAdicional);
    }


}
