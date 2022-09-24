package ExercicoMedio;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class ExerMedio5 {
    public static void main(String[] args) {

//        Exercício 5 - Faça um algoritmo para ler 5
//    números, verificar e exibir, quais dos 5 números digitados, é o menor.

//        int num1, num2, num3, num4, num5, menor;
//        num1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro número"));
//        num2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo número"));
//        num3 = Integer.parseInt(JOptionPane.showInputDialog("Terceiro número"));
//        num4 = Integer.parseInt(JOptionPane.showInputDialog("Quarto número"));
//        num5 = Integer.parseInt(JOptionPane.showInputDialog("Quinto número"));
//        menor = num1;
//       // if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
//        if(menor > num2){
//            menor = num2;
//        }
//        if(menor > num3){
//            menor = num3;
//        }
//        if(menor > num4){
//            menor = num4;
//        }
//        if(menor > num5){
//            menor = num5;
//        }
//        System.out.println(menor);
//
//        ----------------------------------------------------------------

//        if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
//            System.out.println(num2);
//        }
//        if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
//            System.out.println(num3);
//        }
//        if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
//            System.out.println(num4);
//        }
//        if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4) {
//            System.out.println(num5);
//        }
//    }

        int i = 1, num = 0, menor = 0;
        while (i <= 5) {
            num = Integer.parseInt((JOptionPane.showInputDialog("Digite o número: ")));
            if (num < menor || i == 1) {
                menor = num;
            }
        }
        i++;
        System.out.println("O numero menor é: " + menor);
    }
}

