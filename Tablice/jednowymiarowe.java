package Tablice;

public class jednowymiarowe {
    public static void main(String[] args) {
        //ang. arrays
        int[] tablica;
        tablica = new int[10];
        tablica[0] = 5;
        tablica[1] = 10;
        tablica[2] = 15;
        tablica[3] = 155;
        //tablica[indeks]
        System.out.println(tablica[5]);

        double[] tablicaDouble = new double[5];
        tablicaDouble[0] = 12.5;
        tablicaDouble[1] = 55.5;
        tablicaDouble[2] = 111.11;
        System.out.println(tablicaDouble[3]);

        System.out.println(tablicaDouble[4]);

        char[] tablicaCharow = new char[100];
        System.out.println(tablicaCharow[0]);

        int[] nowaTablicaIntow = {5, 10, 15, 155};
        System.out.println("nowaTablicaIntow[0]: " + nowaTablicaIntow[0]);
        System.out.println("nowaTablicaIntow[1]: " + nowaTablicaIntow[1]);
        System.out.println("nowaTablicaIntow[2]: " + nowaTablicaIntow[2]);
        System.out.println("nowaTablicaIntow[3]: " + nowaTablicaIntow[3]);
    }
}
