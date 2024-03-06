import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = scan.nextInt();
        if (liczba > 0){
            System.out.println("Liczba jest dodatnia :) ");}
        else
            if (liczba < 0){
                System.out.println("Liczba jest ujemna");
            } else {
                System.out.println("Liczba = 0");
        }
    }
}