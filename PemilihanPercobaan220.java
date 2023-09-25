import java.util.Scanner;

public class PemilihanPercobaan220 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner (System.in);
        System.out.print("Nilai UAS: ");
        float uas = input20.nextFloat();
        System.out.print("Nilai UTS: ");
        float uts = input20.nextFloat();
        System.out.print("Nilai kuis: ");
        float kuis = input20.nextFloat();
        System.out.print("Nilai Tugas: ");
        float tugas = input20.nextFloat();
        float total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);

        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai akhir: " + total + " sehingga " + message);
    }
}