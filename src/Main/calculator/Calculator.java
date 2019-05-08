package Main.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        int numar1 = 0;
        int numar2 = 0;
        char operatie;
        double rezultat = 0.0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Numar 1: ");
        numar1 = scanner.nextInt();
        System.out.println("Numar 2: ");
        numar2 = scanner.nextInt();
        System.out.println("Operatie: ");
        operatie = scanner.next().charAt(0);

        switch (operatie) {
            case '+' : rezultat = numar1 + numar2;
            break;
            case '-' : rezultat = numar1 - numar2;
            break;
            case '/' : rezultat = numar1 / numar2;
            break;
            case '*' : rezultat = numar1 * numar2;
        }

        System.out.println(rezultat);





    }
}
