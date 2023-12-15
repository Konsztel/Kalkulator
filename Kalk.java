// Version 1.0

import java.util.Scanner;

public class Kalk {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");
        double liczba1 = scan.nextInt();
        scan.nextLine(); //potrzebne, jeśli wczytujemy napis po wczytaniu liczby

        System.out.println("Podaj operator + - * /");
        new Scanner(System.in);
        String operator = scan.nextLine();

        System.out.println("Podaj drugą liczbę");
        new Scanner(System.in);
        double liczba2 = scan.nextInt();
        scan.close();

        if (operator.equals("+")) {                    //Wykonaj dodawanie
            double suma = liczba1 + liczba2;
            System.out.println("Wynik to " + suma);

        }   else if (operator.equals("-")){             //Wykonaj odejmowanie;
            double suma = liczba1 - liczba2;
            System.out.println("Wynik to " + suma);

        }   else if (operator.equals("*")) {            //Wykonaj mnożenie;
            double suma = liczba1 * liczba2;
            System.out.println("Wynik to " + suma);

        }   else if (operator.equals("/")){             //Wykonaj dzielenie
            double suma = liczba1 / liczba2;
            System.out.println("Wynik to " + suma);

        }   else {System.out.println("Podałeś nie dozwolony operator. Podaj poprawy operator: + - * /");

        }

    }
}