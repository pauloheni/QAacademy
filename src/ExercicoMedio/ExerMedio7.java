package ExercicoMedio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ExerMedio7 {
    public static void main(String[] args) {

//        Exercício 7 - Faça um algoritmo para ler todos os meses do ano, armazene em um vetor.

        String[] meses = new String[12];
        meses[0] = "Janeiro";
        meses[1] = "Fevereiro";
        meses[2] = "Março";
        meses[3] = "Abril";
        meses[4] = "Maio";
        meses[5] = "Junho";
        meses[6] = "Julho";
        meses[7] = "Agosto";
        meses[8] = "Setembro";
        meses[9] = "Outubro";
        meses[10] = "Novembro";
        meses[11] = "Dezembro";

                int num1;
//            while (i <= 0) {
//                num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do mês: "));
//                System.out.println(meses[num1 - 1]);

                num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do mês: "));
                if (num1>12){
                    System.out.println("Mês Inválido");
                }
                System.out.println("O mês é: " + meses[num1 - 1]);



//
//
//        System.out.println(meses[0]+" "+meses[1]+" "+meses[2]+" "+meses[3]+" "+meses[4]+" "+meses[5]+" "+meses[6]+
//                " "+meses[7]+" "+meses[8]+" "+meses[9]+" "+meses[10]+" "+meses[11]);

//        int i =0;
//        while (i< meses.length){
//            System.out.println(meses[i]);
//            i++;
//
//        for(int i = 0; i<12; i++){
//            System.out.println(meses[i]);
//
//        for (String mes : meses){
//        System.out.println(mes);
//        }

        }
    }



