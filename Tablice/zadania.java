package Tablice;

public class zadania {
    public static void main(String[] args) {
        //zad1
        /*
        int[] tablica = new int[5];
        tablica[0] = 2;
        tablica[1] = 5;
        tablica[2] = 3;
        tablica[3] = 10;
        tablica[4] = 15;
        int suma = tablica[0] + tablica[1] + tablica[2] + tablica[3] + tablica[4];
        System.out.println("Suma wynosi: " + suma);
        int[] tab = {2, 5, 3, 10, 15};
        int suma = tab[0] + tab[1] + tab[2] + tab[3] + tab[4];
        //System.out.println("Zsumowana tablica wynosi: " + suma); */

        //zad2

        double[][] tablicaDouble = new double[3][5];
        tablicaDouble [0][0] = 1.5;
        tablicaDouble [0][1] = 2.5;
        tablicaDouble [0][2] = 3.5;
        tablicaDouble [0][3] = 4.5;
        tablicaDouble [0][4] = 5.5;

        tablicaDouble [1][0] = 2.5;
        tablicaDouble [1][1] = 3.5;
        tablicaDouble [1][2] = 4.5;
        tablicaDouble [1][3] = 5.5;
        tablicaDouble [1][4] = 6.5;

        tablicaDouble [2][0] = 7.5;
        tablicaDouble [2][1] = 8.5;
        tablicaDouble [2][2] = 9.5;
        tablicaDouble [2][3] = 10.5;
        tablicaDouble [2][4] = 11.5;


        /*double[][] tablicaDouble = {
                {1.5, 2.5, 3.5, 4.5, 5.5},
                {2.5, 3.5, 4.5, 5.5, 6.5},
                {7.5, 8.5, 9.5, 10.5, 11.5}
        }; */
        double sumaPierwsza = tablicaDouble[0][0] + tablicaDouble [0][1] + tablicaDouble [0][2] + tablicaDouble [0][3] + tablicaDouble [0][4];
        System.out.println("Suma pierwszej tablicy wynosi: " + sumaPierwsza);

        double sumaDruga = tablicaDouble[1][0] + tablicaDouble [1][1] + tablicaDouble [1][2] + tablicaDouble [1][3] + tablicaDouble [1][4];
        System.out.println("Suma drugiej tablicy wynosi: " + sumaDruga);

        double sumaTrzecia = tablicaDouble[2][0] + tablicaDouble [2][1] + tablicaDouble [2][2] + tablicaDouble [2][3] + tablicaDouble [2][4];
        System.out.println("Suma trzeciej tablicy wynosi: " + sumaTrzecia);

        double sumaWszystko = sumaPierwsza + sumaDruga + sumaTrzecia;
        System.out.println("Suma wszyskich tablic wynosi: " + sumaWszystko);
    }
}
