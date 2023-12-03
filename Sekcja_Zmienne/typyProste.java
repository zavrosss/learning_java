package Sekcja_Zmienne;

public class typyProste {
    public static void main(String[] args) {
        // ang. primitive types

        // info: 1bajt = 8bitów

        // Liczby całkowite
        byte zmiennaByte = 10;
        System.out.println("Byte: " + zmiennaByte);
        System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);

        short zmiennaShort = 200;
        System.out.println("Short: " + zmiennaByte);
        System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);

        int zmiennaInt = 1000000;
        System.out.println("Int: " + zmiennaByte);
        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

        long zmiennaLong = 10000000000000L; // Dodanie litery "L" sprawia, że liczba jest typem Long
        System.out.println("Long: " + zmiennaLong);
        System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);

        // Liczby zmiennoprzecinkowe
        float zmiennaFloat = 12.34123456789f;
        System.out.println("Float: " + zmiennaFloat);

        //zmienna double jest w stanie przechowywać wiecej liczb po przecinku
        // float precyzja do 6-7 miejsc po przecinku
        // double precyzja do 15-16 miejsc po przecinku

        double zmiennaDouble = 12.34123456789;
        System.out.println("Double: " + zmiennaDouble);

        // Pojedyncze znaki
        char zmiennaChar = 'A';
        System.out.println("Char: " + zmiennaChar);

        // Wartosci logiczne
        boolean zmiennaBooleanTrue = true;
        boolean zmiennaBooleanFalse = false;
        System.out.println("Boolean: " + zmiennaBooleanTrue + " " + "albo" + " " + zmiennaBooleanFalse);
    }
}
