package ExercicoMedio;

import javax.swing.*;

public class ExerMedio6 {
    public static void main(String[] args) {

        int fatorial=10, i;

        i = fatorial;
        while (i > 1){
            fatorial = fatorial*(i-1);
            i--;
        }
        System.out.println(fatorial);
    }
}


//    Exercício 6 - Faça um algoritmo para ler um número inteiro, calcular e exibir o Fatorial do número
//    digitado. Ex.: Digitou 10. 10*(10-1)*(10-2)*(10-3).. *(10-1) = 3.628.800








