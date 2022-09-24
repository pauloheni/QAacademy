package Exercicio_Easy;
//▶ Exercício 4 - Faça um algoritmo para ler um número inteiro,
// armazenar em uma variável, calcular o dobro, e exibir. - PÁGINA 16
//        ----Inicio Algoritmo
//        numero calcular;
//        calcular = Ler ();
//        Exibir: "O dobro do número digitado é: " + calcular*2;
//        ----Fim Algoritmo
//
//        ----Inicio Algoritmo
//        numero calcular, result;
//        calcular = Ler ();
//        result = calcular*2
//        Exibir: "O dobro do número digitado é: " + result;
//        ----Fim Algoritmo

import javax.swing.*;

public class Exer4 {
    public static void main(String[] args) {
        int calcular, result;
        calcular = Integer.parseInt(JOptionPane.showInputDialog("Digite qualquer número"));
        result = calcular * 2;
        System.out.println("O dobro é: " + result);
    }

    public static class Exer7 {
        public static void main(String[] args) {

    //                Inicio Algoritmo
    //        numero salario, inss
    //        salario = Ler ();
    //        Se (salario <= 1045,00)
    //        inss = salario * 0,075;
    //        Exibir: "O valor do INSS a ser pago será de: " + inss;
    //        Fim Se
    //        Se (salario >= 1045,00 && salario <= 2089,60)
    //        inss = salario * 0,09;
    //        Exibir: "O valor do INSS a ser pago será de: " + inss;
    //        Fim Se
    //        Se (salario >= 2089,61 && salario <= 3134,40)
    //        inss = salario * 0,12;
    //        Exibir: "O valor do INSS a ser pago será de: " + inss;
    //        Fim Se
    //        Se (salario >= 3134,41 && salario <= 6101,06)
    //        inss = salario * 0,14;
    //        Exibir: "O valor do INSS a ser pago será de: " + inss;
    //        Fim Se
    //        Se (salario > 6101,07)
    //        inss = salario * 0,15;
    //        Exibir: "O valor do INSS a ser pago será de: " + inss;
    //        Fim Se
    //        Fim Algoritmo

    //     ▶ Exercício 7 - Faça um algoritmo para ler um valor de salário, calcular e exibir o valor do INSS a
    //     ser pago. Respeitando a tabela abaixo: - PÁGINA 18
    //        Salário de Contribuição (R$) -- Alíquota
    //        Até R$ 1.045,00 -- 7,50%
    //                De R$ 1.045,01 a R$ 2.089,60 -- 9%
    //                De R$ 2.089,61 até R$ 3.134,40 -- 12%
    //                De R$ 3.134,41 até R$ 6.101,06 -- 14%


            double salario, inss;
            salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário"));
            if (salario <= 1045.00) {
                inss = salario * 0.075;
                System.out.printf("O valor do INSS (7,5%) a ser pago será de: .%2f",inss);
            }
            if (salario >= 1045.01 && salario <= 2089.60) {
                inss = salario * 0.09;
                System.out.println("O valor do INSS (9%) a ser pago será de: " + inss);
            }
            if (salario >= 2089.61 && salario <= 3134.40) {
                inss = salario * 0.12;
                System.out.println("O valor do INSS (12%) a ser pago será de: " + inss);
            }
            if (salario >= 3134.41 && salario <= 6101.06) {
                inss = salario * 0.15;
                System.out.println("O valor do INSS (15%) a ser pago será de: " + inss);
            }
            if (salario > 6101.07) {
                inss = salario * 0.20;
                System.out.println("O valor do INSS (20%) a ser pago será de: " + inss);
            }

        }
    }

    public static class Exer_3 {
        public static void main(String[] args) {
    //        ▶ Exercício 3 - Faça um algoritmo para ler dois valores, armazenar em variáveis, e exibir os
    //        valores das variáveis, trocados. - PÁGINA 15
    //
    //        ----Inicio Algoritmo
    //        texto varNome, varSobrenome, auxiliar
    //        varNome = Ler("Paulo");
    //        varSobrenome = Ler("Henrique");
    //        auxiliar = varSobrenome
    //        varSobrenome = varNome
    //        varNome = auxiliar
    //        Exibir: "Seu nome é: " + varNome + varSobrenome
    //        ----Fim Algoritmo

          String varNome, varSobrenome, auxiliar;
          varNome = "Paulo";
          varSobrenome = "Henrique";
          auxiliar = varSobrenome;
          varSobrenome = varNome;
          varNome = auxiliar;
            System.out.println("Seu nome é: " + varNome + " " + varSobrenome);
        }
    }
}
