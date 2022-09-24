package ExercicoMedio;

import javax.swing.*;
import java.sql.SQLOutput;

public class ExerMedio1 {
    public static void main(String[] args) {

        //    Exercício 1 - Faça um algoritmo para verificar e exibir de 0 a 100,
//    quais são os números Pares e ímpares. - PÁGINA 23

//        int num;
//
//        num = Integer.parseInt(JOptionPane.showInputDialog("Coloque um número qualquer"));
//        if(num%2 == 0) {
//            System.out.println("Par");
//        } else{
//            System.out.println("Impar");
//        }

        int i = 0;
        while (i<=100) {
            if(i%2 ==0) {
                System.out.println("O número é: " + i + " é par");
            }else{
                System.out.println("O numero é: " + i + " é impar");
            }
            i++;
        }




    }



}
