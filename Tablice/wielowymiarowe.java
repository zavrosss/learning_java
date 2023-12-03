package Tablice;

public class wielowymiarowe {
    public static void main(String[] args){
        int[][] tablicaDwuwymiariowa = new int[10][10];
        tablicaDwuwymiariowa [0][1]= 5;
        tablicaDwuwymiariowa [4] [8] = 10;
            System.out.println (tablicaDwuwymiariowa[4][8]);

            int[][] nowaTablica = {
                    {1, 2, 3, 11, 12, 13},
                    {4, 5, 6, 41, 42, 43}
            };
        System.out.println("[0][0]: " + nowaTablica[0][0]);
        System.out.println("[0][1]: " + nowaTablica[0][1]);
        System.out.println("[1][2]: " + nowaTablica[1][2]);
        System.out.println("[1][5]: " + nowaTablica[1][5]);

        System.out.println("Rozmiar całej tablicy: " + nowaTablica.length);
        System.out.println("Rozmiar kolumny 0: " + nowaTablica[0].length);
        System.out.println("Rozmiar kolumny 1: " + nowaTablica[1].length);

        System.out.println("Rozmiar całej tablicy tablicaDwuwymiariowa: " + tablicaDwuwymiariowa.length);
        System.out.println("Rozmiar kolumny 0: " + tablicaDwuwymiariowa[0].length);
        System.out.println("Rozmiar kolumny 1: " + tablicaDwuwymiariowa[1].length);
        System.out.println("Rozmiar kolumny 2: " + tablicaDwuwymiariowa[2].length);
        System.out.println("Rozmiar kolumny 3: " + tablicaDwuwymiariowa[3].length);
        System.out.println("Rozmiar kolumny 9: " + tablicaDwuwymiariowa[9].length);
        // System.out.println("Rozmiar kolumny 10: " + tablicaDwuwymiariowa[10].length); nie ma takiej tablicy (indeksu)

        int[][][] tablicaTrojwymiarowa = new int[5][6][11];

    }
}

