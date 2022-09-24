package main;

import exemplos.MetodosSemMain;

public class Execucao {
    public static void main(String[] args) {
//        um void / com return / com parametro

//        INICIO DO METODO COM VOID

        MetodosSemMain metodo = new MetodosSemMain();

        metodo.metodoComVoid();
        System.out.println(metodo.metodoComReturn());
        System.out.println(metodo.metodoComParametro("eu vou", 10, 10.5));

    }


}
