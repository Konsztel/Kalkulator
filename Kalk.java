//Version 1.1

import java.util.Scanner;

public class Kalk {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");
        double liczba1 = scan.nextDouble();
        //potrzebne, jeśli wczytujemy napis po wczytaniu liczby
        scan.nextLine();

        //Pobranie od użytkownika liczby jakie działanie ma zostać wykonane
        System.out.println("1 - Dodawanie \n2 - Odejmowanie \n3 - Mnożenie \n4 - Dzielenie ");
        System.out.println("Wybierz jakie działanie chcesz wykonać:");
        new Scanner(System.in);
        int operator = scan.nextInt();

        //Zabezpieczenie przed wprowadzaniem złej wartości, powyżej 4
        while (operator>4){
            System.out.println("Podałeś zły operator, podaj prawidłowy operator");
            System.out.println("1 - Dodawanie \n2 - Odejmowanie \n3 - Mnożenie \n4 - Dzielenie ");
            new Scanner(System.in);
            operator = scan.nextInt();
        }

        System.out.println("Podaj drugą liczbę");
        new Scanner(System.in);
        double liczba2 = scan.nextDouble();
        scan.close();

        //Przełącznik do wykonywanych obliczeń
        double suma = 0;
        switch (operator) {
            case 1:
                suma = liczba1 + liczba2;
                break;
            case 2:
                suma = liczba1 - liczba2;
                break;
            case 3:
                suma = liczba1 * liczba2;
                break;
            case 4:
                suma = liczba1 / liczba2;
                break;
        }
        System.out.println("Wynik:" + suma);
    }
}