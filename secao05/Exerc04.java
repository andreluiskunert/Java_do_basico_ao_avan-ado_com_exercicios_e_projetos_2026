package secao05;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);


        System.out.println("Dia da semana: 1 - Domingo");

        System.out.println("Dia da semana: 2 - Segunda-feira");

        System.out.println("Dia da semana: 3 - Terça-feira");

        System.out.println("Dia da semana: 4 - Quarta-feira");

        System.out.println("Dia da semana: 5 - Quinta-feira");

        System.out.println("Dia da semana: 6 - Sexta-feira");

        System.out.println("Dia da semana: 7 - Sábado");


        System.out.println(" ");


        String diaDaSemana;


        System.out.println("Informe o dia da semana (1 a 7): ");

        diaDaSemana = scanner.nextLine();


        switch (diaDaSemana) {

            case "1":

                System.out.println("Domingo");                

                break;

            case "2":

                System.out.println("Segunda-feira");

                break;

            case "3":

                System.out.println("Terça-feira");

                break;

            case "4":

                System.out.println("Quarta-feira");

                break;

            case "5":

                System.out.println("Quinta-feira");

                break;

            case "6":

                System.out.println("Sexta-feira");

                break;

            case "7":

                System.out.println("Sábado");

                break;

            default:

                System.out.println("Esse dia não existe!");

                break;

        }


        scanner.close();  
 System.out.println("Obs.: esse peguei de colega do curso de Java na plataforma Hora de Codar..");
    }

}
