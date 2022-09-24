package Exercicio_Easy;

import javax.swing.*;

public class Exer6 {
    public static void main(String[] args) {

//▶ Exercício 6 - Faça um algoritmo para ler duas notas, calcular a média. E SE - a média > 5
// Exibir aprovado, SE a média < 5 exibir reprovado, SE media = 5 exibir exame. - PÁGINA 17
//
//        ----Inicio Algoritmo
//        numero nota1, nota2, media;
//        nota1 = Ler();
//        nota2 = Ler();
//        media = (nota1 + nota2)/2;
//        Se(media > 5)
//        Exibir: "Aprovado";
//        Fim Se
//        Se(media < 5)
//        Exibir: "Reprovado";
//        Fim Se
//        Se (media == 5)
//        Exibir: "Exame";
//        Fim Se
//        Fim Algoritmo


        float nota1, nota2, media;

        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque a primeira nota"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque a segunda nota"));
        media = (nota1 + nota2)/2;
            if (media > 5) {
                System.out.println("Aprovado");
            }
            if (media == 5) {
                System.out.println("Exame");
            }
            if (media < 5) {
                System.out.println("Reprovado");
            }


    }

    public static class Exer8 {
        public static void main(String[] args) {


    //        Inicio Algoritmo
    //        numero salario, IR
    //        salario = Ler ();
    //        Se (salario < 0)
    //        Exibir: "Salário Inválido"
    //        Fim Se
    //        Se (salario >= 0 && salario <= 1903.98)
    //        Exibir: "Salário Bruto: " + salario;
    //        Exibir: "Imposto de Renda: Isento";
    //        Exibir: "Salario Líquido" + salario;
    //        Fim Se
    //        Se (salario >= 1093.99 && salario <= 2826.65)
    //        IR = (salario * 0.075) - 142.8;
    //        Fim Se
    //        Se (salario >= 2826.66 && salario <= 3751.O5)
    //        IR = (salario * 0.15) - 354.8;
    //        Fim Se
    //        Se (salario >= 3751.06 && salario <= 4664.68)
    //        IR = (salario * 0.225) - 636.13;
    //        Fim Se
    //        Se (salario > 4664.68)
    //        IR = (salario * 0.275) - 869.36;
    //        Fim Se
    //        Exibir: "Salário Bruto: " + salario;
    //        Exibir: "Imposto de Renda: " + IR;
    //        Exibir: "Salário Líquido: " + salario - IR;
    //        Fim Algoritmo

    //        ▶ Exercício 8 - Faça um algoritmo para ler um valor de salário, calcular e exibir o valor do
    //            salário bruto, valor do salário líquido e o valor do imposto de renda. Respeitando a tabela abaixo: 'IR = (salario * aliquota) - dedução' - PÁGINA 19
    //        Base de cálculo          - Alíquota - Dedução
    //        de 0,00 até 1.903,98     - isento   - 0
    //        de 1.903,99 até 2.826,65 - 7,50%    - 142,8
    //        de 2.826,66 até 3.751,05 - 15,00%   - 354,8
    //        de 3.751,06 até 4.664,68 - 22,50%   - 636,13
    //        a partir de 4.664,68     - 27,50%   - 869,36
        }
    }
}
