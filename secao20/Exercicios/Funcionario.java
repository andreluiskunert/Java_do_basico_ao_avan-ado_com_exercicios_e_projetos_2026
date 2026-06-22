package secao20.Exercicios;
// Domingo_D'noite 21/06/2026

abstract class Funcionario {
    protected String nome;
    public  Funcionario(String nome){
        this.nome = nome;
    }
    public abstract double calcularSalario();

}
