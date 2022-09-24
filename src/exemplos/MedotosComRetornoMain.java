package exemplos;

public class MedotosComRetornoMain {
    public static void main(String[] args) {
        System.out.println(brasilia());
        System.out.println(manaus());
        System.out.println(recife());
        System.out.println(curitiba());
        System.out.println(saoPaulo());
        System.out.println(saoPaulo());
        System.out.println(recife());
        System.out.println(brasilia() + " " + manaus());

        String teste = saoPaulo();
        System.out.println(teste);

        String testex = saoPaulo();
        System.out.println(testex);

        int teste1 = brasilia();
        System.out.println(8);
    }
    public static String saoPaulo(){
        return "São Paulo";
    }
    public static String curitiba(){
        return "Curitiba";
    }
    public static String manaus(){
        return "manaus";
    }
    public static int brasilia(){
        return 5;
    }
    public static double recife(){
        return 5.6;
    }

}

