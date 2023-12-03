package ZadaniaZmienneOrazOperatory;

public class zadanie3 {
    public static void main(String[] args){
        float wzrost = 1.9f;
        int waga = 100;

        float bmi = waga / (wzrost*wzrost); //inaczej Math.pow(wzrost, 2)
        System.out.println("Twoje BMI wynosi: " + bmi);
        int wynikSkonwertowany = (int) bmi;
        System.out.println("Wynik skonwertowany na int to: " + wynikSkonwertowany);
    }
}
