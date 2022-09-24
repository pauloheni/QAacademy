package exemplos;

import Exercicio_Easy.Exer2;
import Exercicio_Easy.Exer3;
import Exercicio_Easy.Exer4;
import Exercicio_Easy.Exerc5;

import java.sql.SQLOutput;

//EXERC 2
public class Exercicos_2 {

//    public static void main(String[] args) {
//
//        Exer2 exer2 = new Exer2();
//        System.out.println(exer2.palavra());
//    }
//}

//    //EXERC 3
//    public static void main(String[] args) {
//        Exer3 exer3 = new Exer3();
//        System.out.println(exer3.dificil("Paulo"," Henrique"));
//    }

    ////    //EXERC 4
//    public static void main(String[] args) {
//        Exer4 exer4 = new Exer4();
//        System.out.println("O dobro é :" + exer4.vezesdobro(5) + " é o dobro");
//    }
//}
    public static void main(String[] args) {
        Exerc5 exerc5 = new Exerc5();
        int var1 = 1, var2 = 2, var3 = 3;

        System.out.println(exerc5.soma(var1, var2, var3));;
        System.out.println(exerc5.sub(var1,var2,var3));
        System.out.println(exerc5.mult(var1,var2,var3));
        System.out.println(exerc5.divi(var1,var2,var3));
    }
}
