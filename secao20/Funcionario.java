package secao20;

public class Funcionario {
    //Quinta-feira,11/06/2026_D'noite
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public void exibirDetalhes(){
        System.out.println("Nome do funcionario: " + nome + ";");
    }
    public double CalcularBonus(){
        return salario * 1;
    }
    public double calcularBonus() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularBonus'");
    }
}
