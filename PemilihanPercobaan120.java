import java.util.Scanner;

public class PemilihanPercobaan120{
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka20 = input20.nextInt();
        if (angka20 % 2 == 0) {
            System.out.println("Angka " + angka20 + " adalah bilangan genap");
        } else {
            System.out.println("Angka " + angka20 + " adalah bilangan ganjil");
        }
        }
        
}