package instrukcjeWarunkowe;

public class instrukcjaWarunkowaIf {
    public static void main(String[] args){
        //ang. conditional statements
        int wiek = 15;
        boolean przyszedlTata = false;
        boolean przyszedlZMama = true;

        if (wiek >= 18){
            System.out.println("Pozwol na zakupy!");
        } else if (przyszedlTata){
            System.out.println("Od razu podaj!");
        } else if (wiek < 18 && przyszedlZMama){
            System.out.println("Pozwol na zakup!");
        } else {
            System.out.println("Wyproś ze sklepu!");
        }
    }
}
