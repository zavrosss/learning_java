package ZadaniaZmienneOrazOperatory;

public class zadanie4 {
    public static void main(String[] args){
        int liczba = 12;
        int wynik;
        int wynikZReszty;

        wynik = liczba / 2;
        wynikZReszty = liczba % 2;
        System.out.println(liczba + " / 2 = " + wynik);
        System.out.println(liczba + " % 2 = " + wynikZReszty);

        wynik = liczba / 3;
        wynikZReszty = liczba % 3;
        System.out.println(liczba + " / 3 = " + wynik);
        System.out.println(liczba + " % 3 = " + wynikZReszty);

        wynik = liczba / 11;
        wynikZReszty = liczba % 11;
        System.out.println(liczba + " / 11 = " + wynik);
        System.out.println(liczba + " % 11 = " + wynikZReszty);
    }
}
