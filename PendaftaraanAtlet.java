// existing code
import java.util.Scanner;
public class PendaftaraanAtlet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== PENDAFTARAN ATLET PORSENI 2024 ===");
        System.out.println("Politeknik Negeri Malang\n");
        for (int i = 1; i <= 4; i++) {
            System.out.print("Nama cabang olahraga ke-" + i + ": ");
            String namaCabor = sc.nextLine();
            for (int j = 1; j <= 5; j++) {
                System.out.print("  Nama atlet ke-" + j + ": ");
                String atlet = sc.nextLine();
            }
            System.out.println();
        }
        sc.close();
    }
}