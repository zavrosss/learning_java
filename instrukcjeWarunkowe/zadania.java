package instrukcjeWarunkowe;

public class zadania {
    public static void main(String[] args) {
        /*
        zad1
        sprawdzenie czy liczba jest parzysta za pomocą zmiennej int
        int parzysta = 6;
        Sprawdź czy wpisana liczba jest parzysta czy nieparzysta.
        Wypisz odpowiedni komunikat na ekran.
        */
        System.out.println("Zadanie 1: ");
        int parzysta = 6;
        if (parzysta % 2 == 0) {
            System.out.println("Parzysta");
        } else {
            System.out.println("Nieparzysta");
        }

        //Sprawdzenie czy liczba jest parzysta za pomocą zmiennej boolean
        boolean parzystaBoolean = true;

        if (parzystaBoolean) {
            System.out.println("Parzysta");
        } else {
            System.out.println("Nieparzysta");
        }


        /*
        zad2
        Twoim zadaniem jest obliczenie podatku od dochodu
        Wzór:
        dla dochodu do 85 528 zł podatek wynosi 17%,
        dla dochodu powyżej 85 528 zł liczy się go następująco:
        - obliczamy podatek 17% z 85 528,
        - dodatkowo obliczamy podatek 32% od nadwyżki ponad 85 528 zł,
         czyli dochód pomniejszony o 85 528 zł i z tego 32%
         */

        System.out.println("Zadanie 2: ");
        double kwota = 1000;
        if(kwota < 0){
            System.out.println("Nie musisz placic podatku!");
        }

        if(kwota<= 85528){
            double podatek = kwota * 0.17;
            System.out.println("Podatek do zapłaty wynosi: " + podatek);
        } else {
            double podatekPonizejProgu = 85528 * 0.17;
            double podatekPowyzejProgu = (kwota - 85528) * 0.32;
            double podatek = podatekPonizejProgu + podatekPowyzejProgu;
            System.out.println("Podatek jest wiekszy do zaplaty wynosi: " + podatek);
        }
        /*
        zad3
        Bardzo prosty kalkulator. Niech potrafi dodawać, odejmować, mnożyć i dzielić.
        Co więcej, niech będzie na tyle prostym kalkulatorem, że po podaniu  dwóch liczb, obliczy wynik i zakończy swoje działanie.
        */
        System.out.println("Zadanie 3: ");
        int zmiennaPierwsza = 20;
        int zmiennaDruga = 10;
        char kalkulator = '-';

        int dodawanie = zmiennaPierwsza + zmiennaDruga;
        int odejmowanie = zmiennaPierwsza - zmiennaDruga;
        int mnozenie = zmiennaPierwsza * zmiennaDruga;
        int dzielenie = zmiennaPierwsza / zmiennaDruga;
        switch (kalkulator) {
            case '+':
                System.out.println("Wynik dodawania wynosi: " + dodawanie);
            case '-':
                System.out.println("Wynik odejmowania wynosi: " + odejmowanie);
            case '*':
                System.out.println("Wynik mnożenia wynosi: " + mnozenie);
            case '/':
                System.out.println("Wynik dzielenia wynosi: " + dzielenie);
                break;
            default:
                System.out.println("Podales blędne dane");
        }

        int dodawanieIf = zmiennaPierwsza + zmiennaDruga;
        int odejmowanieIf = zmiennaPierwsza - zmiennaDruga;
        int mnozenieIf = zmiennaPierwsza * zmiennaDruga;
        int dzielenieIf = zmiennaPierwsza / zmiennaDruga;

        if (kalkulator == '+') {
            System.out.println("Wynik dodawania wynosi: " + dodawanieIf);
            System.out.println("Wynik odejmowania wynosi: " + odejmowanieIf);
            System.out.println("Wynik mnożenia wynosi: " + mnozenieIf);
            System.out.println("Wynik dzielenia wynosi: " + dzielenieIf);

        } else if (kalkulator == '-') {
            System.out.println("Wynik dodawania wynosi: " + dodawanieIf);
            System.out.println("Wynik odejmowania wynosi: " + odejmowanieIf);
            System.out.println("Wynik mnożenia wynosi: " + mnozenieIf);
            System.out.println("Wynik dzielenia wynosi: " + dzielenieIf);

        } else if (kalkulator == '*') {
            System.out.println("Wynik dodawania wynosi: " + dodawanieIf);
            System.out.println("Wynik odejmowania wynosi: " + odejmowanieIf);
            System.out.println("Wynik mnożenia wynosi: " + mnozenieIf);
            System.out.println("Wynik dzielenia wynosi: " + dzielenieIf);

        } else if (kalkulator == '/') {
            System.out.println("Wynik dodawania wynosi: " + dodawanieIf);
            System.out.println("Wynik odejmowania wynosi: " + odejmowanieIf);
            System.out.println("Wynik mnożenia wynosi: " + mnozenieIf);
            System.out.println("Wynik dzielenia wynosi: " + dzielenieIf);

        } else {
            System.out.println("Podales blędne dane");
        }
    }
}

