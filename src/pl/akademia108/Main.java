package pl.akademia108;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Wprowadź swoje imie:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        System.out.println("Witaj " + name + " w świecie Java");
        scan.close();
    }
}
