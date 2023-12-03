package ZadaniaZmienneOrazOperatory;

public class zadanie2 {
    public static void main(String[] args){
        float wzrost = 1.9f;
        int waga = 100;

        float bmi = waga / (wzrost*wzrost); //inaczej Math.pow(wzrost, 2)waga / (wzrost*wzrost);
        System.out.println("Twoje BMI wynosi: " + bmi);
    }
}
