package secao20.Avançando;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.Format.Field;

public class POO2 {
   public static void main(String[] args) {
    System.out.println("1_Classes com Final");
    ContaBancaria conta = new ContaBancaria(500);
    System.out.println("Seu Saldo é " + conta.getSaldo());
       // classe final - nao pode ser herdada
        // metodo final - n pode ser sobreescrito
        System.out.println(" 2 - Reflection API");
               try {
            Class<?> classePessoa = Class.forName("secao20.Avancando.Pessoa");

            Constructor<?> construtor = classePessoa.getConstructor(String.class, int.class);

            Object pessoa = construtor.newInstance("João", 25);
            
            Method metodoDizerOla = classePessoa.getMethod("dizerOla");

            metodoDizerOla.invoke(pessoa);

            java.lang.reflect.Field campoNome = classePessoa.getDeclaredField("nome");

            ((AccessibleObject) campoNome).setAccessible(true);

            campoNome.set(pessoa, "Maria");

            metodoDizerOla.invoke(pessoa);


        } catch (Exception e) {
            e.printStackTrace();
        } 
        System.out.println("    The End  ");

    }

   
   } 

