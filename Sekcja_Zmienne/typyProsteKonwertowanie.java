package Sekcja_Zmienne;

public class typyProsteKonwertowanie {
    public static void main (String[] args){
        int i = 6;
        double d = 2.2;

        double d2 = i;

        byte by = 100;
        int i2 = by;

        float f = 123.22f;
        d2 = f;

        long zmiennaLong = 123;
        int zmiennaInt = (int) zmiennaLong;

        // Konwertowanie niejawne - nie musieliśmy pisać tego w nawiasie
        zmiennaLong = zmiennaInt;
        // Konwertowanie jawne (rzutowanie)
        zmiennaInt = (int) zmiennaLong;

        zmiennaLong = 1253;
        byte bajt = 102;
        short shor = 10022;
        int in = 1234234;
        in = bajt;
        in = shor;

        shor = bajt;
        bajt = (byte) in;
        System.out.println("Bajt: " + bajt);

        int intObliczenia = 6;
        double doubleObliczenia = 2.2;
        int wynik = intObliczenia / (int) doubleObliczenia;
        System.out.println("Wynik: " + wynik);

        double doublePierwszy = 1.2;
        double doubleDrugi = 12.4;
        double wynikDouble = doubleDrugi / doublePierwszy;
        System.out.println("Wynik double: " + wynikDouble);

        int wynikInt = (int) doubleDrugi / (int) doublePierwszy;
        System.out.println("Wynik int: " + wynikInt);

        int wynikInt2 = (int) (doubleDrugi / doublePierwszy);
        System.out.println("Wynik int2: " + wynikInt2);

        char c = 'C';
        int czyMogeInta = c;
        System.out.println("Char jako int: " + czyMogeInta);
        // ASCII Codes
    }
}
