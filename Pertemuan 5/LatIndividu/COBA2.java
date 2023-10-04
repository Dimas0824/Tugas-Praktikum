import java.util.Scanner;

public class COBA2 {
    public static void main(String[] args) {
        // Mengambil input username dan password dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();
        
        // Memeriksa apakah username dan password sesuai dengan yang dimasukkan oleh pengguna
        if (validateLogin(username, password)) {
            System.out.println("Login berhasil! Selamat datang, " + username + "!");
        } else {
            System.out.println("Username dan password salah. Login gagal.");
        }
    }

    // Fungsi untuk memvalidasi login berdasarkan username dan password yang diberikan
    public static boolean validateLogin(String username, String password) {
        // Ganti dengan logika validasi yang sesuai dengan sistem Anda
        String validUsername = "admin";
        String validPassword = "password123";
        
        return username.equals(validUsername) && password.equals(validPassword);
    }
}