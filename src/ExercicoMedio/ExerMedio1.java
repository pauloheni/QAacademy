package ExercicoMedio;

import javax.swing.*;
import java.sql.SQLOutput;

public class ExerMedio1 {
    public void exibirParImpar() {

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

        int num=0;
        while (num<=100) {
            if(num%2 ==0) {
                System.out.println("O número é: " + num + " é par");
            }else{
                System.out.println("O numero é: " + num + " é impar");
            }
            num++;
        }




    }



}
