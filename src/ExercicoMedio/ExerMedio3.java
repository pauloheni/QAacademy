package ExercicoMedio;

import javax.swing.*;

public class ExerMedio3 {
    public static void main(String[] args) {
//
//    //        Exercício 3 - Faça um algoritmo para calcular
//    //        e exibir a soma de todos os números de 0 a 1000. E parar se caso a soma atingir 1500(ou mais
//
//        int soma =0, i=0;
//        while (i<= 1000) {
//            soma=soma+1;
//            if (soma >= 1500){
//                break;
//            }
//            System.out.println(soma);
//            i++;
//        }
//
//
//    }
//
//}
//
//        numero num1, i=1;
//        Exibir: "Digite um número qualquer ";
//        num1 = Ler (90);
//        Enquanto (i <= 100)
//        num1 = num1 + 2
//        Exibir: "Número " + num1;
//        i=i+1;

//        Exercício 3 - Faça um algoritmo para calcular
//        e exibir a soma de todos os números de 0 a 1000. E parar se caso a soma atingir 1500(ou mais).

        int soma = 0, i;
        soma = Integer.parseInt(JOptionPane.showInputDialog("Digite qualquer número:"));
        for (i = 0; i <= 1000; i++) {
            soma += i;
            if (soma >= 1500)
            break;{
                System.out.println(soma);
            }
        }
    }}
