package Operatory;

public class operatoryArtmetyczne {
    public static void main(String[] args){
        System.out.println(3 + 5);
        System.out.println(53);
        System.out.println(2 * 4);
        System.out.println(4 / 2);
        System.out.println(10 % 2);

        double a = 9;
        double b = 2;
        double dodawanie = a + b;
        System.out.println("Dodawanie: " + dodawanie);
        double odejmowanie = a - b;
        System.out.println("Odejmowanie: " + odejmowanie);
        double mnozenie = a * b;
        System.out.println("Mnożenie: " + mnozenie);
        double dzielenie =  a / b;
        System.out.println("Dzielenie: " + dzielenie);
        double resztaZDzielenia = a % b;
        System.out.println("Reszta z dzielenia: " + resztaZDzielenia);

        a += b; //inaczej: a = a + b;
        System.out.println("a = a + b: " + a);

        a -= b; //inaczej: a = a - b;
        System.out.println("a = a - b: " + a);

        a *= b; //inaczej: a = a * b;
        System.out.println("a = a * b: " + a);

        a /= b; //inaczej: a = a / b;
        System.out.println("a = a / b: " + a);

        a %= b; //inaczej: a = a % b;
        System.out.println("a = a % b: " + a);

        System.out.println("a: " + a + " " + "b: " + b);

        b -= a; // inaczej: b = b - a;
        System.out.println("b = b - a: " + b);

        a = a + 1;
        System.out.println("a = a + 1: " + a);
        a += 1;
        System.out.println("a += 1: " + a);

        // inkrementacja
        a++;
        System.out.println("a++: " + a);

        // dekrementacja
        a--;
        System.out.println("a--: " + a);

        /*
        jednoargumentowe:
        - zmiana znaku liczby (liczba przeciwna)
        ++ inkrementacja
        np. i++ to inaczej i = i + 1;
        -- dekrementacja
        np. i-- to inaczej i = i - 1;
        dwuargumentowe:
        + dodawanie
        - odejmowanie
        * mnożenie
        / dzielenie
        % reszta z dzielenia(modulo)
        złożone:
        += tj. wynik = wynik + liczba;
        -= tj. wynik = wynik – liczba;
        *= tj. wynik = wynik * liczba;
        /= tj. wynik = wynik / liczba;
         */
    }
}
