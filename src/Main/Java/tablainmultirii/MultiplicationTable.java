package Main.Java.tablainmultirii;

public class MultiplicationTable {

    public static void main(String[] args) {

        displayMultiplicationTable(8);

    }

    static void displayMultiplicationTable(int numar) {

        for(int i = 0; i < 10; i++)

        System.out.println(numar + " x " + (i + 1) + " = " + (numar * (i + 1)));
    }
}
