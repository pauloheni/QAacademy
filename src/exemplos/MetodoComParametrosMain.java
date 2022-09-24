package exemplos;

public class MetodoComParametrosMain {
    public static void main(String[] args) {

        //=================================================================================================================================
        void1("Computador","quebrado");
        void2("deve",900);
        void3("Eu tinha",40,"reais, gastei tudo e fiquei com",25.09);
        void4(5,2);
        void5(5,2);
//=================================================================================================================================

        String return111 = return10("Jardim","Botânico");
        System.out.println(return111);

        String return222 = return20("abre a mente","faz dormir");
        System.out.println(return222);

        String return333 = return30(20,30);
        System.out.println(return333);

        String return444 = return40(20,30);
        System.out.println(return444);

        System.out.println(return50("Eu tinha ",25.09," agora eu tenho ",40));

    }
    //=================================================================================================================================
//    INÍCIO DOS MÉTODOS QUE COMEÇAM COM VOID
    public static void void1(String ex10, String ex11) {
        System.out.println("O texto é: " + ex10 +" "+ ex11);
    }
    public static void void2(String ex20, int ex22){
        System.out.println("Acho que você me " + ex20 + " " + ex22 + " reais");
    }
    public static void void3(String ex30, int ex31, String ex32, double ex33){
        System.out.println(ex30 + " " + ex31 + " " + ex32 + " " + ex33 + " reais");
    }
    public static void void4(int ex40, int ex41){
        System.out.println("A soma dos valores é de " + (ex40 + ex41) + ". A subtração dos valores é de " + (ex40 - ex41));
    }
    public static void void5(double ex50, double ex51){
        System.out.println("A multiplicação dos valores é de " + (ex50 * ex51) + ". A divisão dos valores é de " + (ex50 / ex51));
    }
    //    FIM DOS MÉTODOS QUE COMEÇAM COM VOID
//=================================================================================================================================
    //    INÍCIO DOS MÉTODOS QUE COMEÇAM COM RETURN

    public static String return10(String re10, String re11){
        return "O texto é: " + re10 +" "+ re11;
    }
    public static String return20(String re21, String re22){
        return "Leitura de Livros " + re21 + " e " + re22;
    }
    public static String return30(int re31, int re32){
        return "A soma é de " + (re31+re32) + " e a subtração é de " + (re31-re32);
    }
    public static String return40(double re41, double re42){
        return "A multiplicação é de " + (re41*re42) + " e a divisão é de " + (re41/re42);
    }
    public static String return50(String re51, double re52, String re53, int re54){
        return re51 + re52 + re53 + re54;
    }


}