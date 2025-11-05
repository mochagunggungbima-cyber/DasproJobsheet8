import java.util.Scanner;

public class RataNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        float nilai, totalNilai, rataNilai;
        totalNilai = 0;
        for (j=1; j<=5; j++) {
            System.out.print("Nilai ke-" + j + " = ");
            nilai = sc.nextFloat();
            totalNilai += nilai;
        }
        rataNilai = totalNilai / 5;
        i=1;
        while (i<=5) {
            System.out.println("Input nilai mahasiswa ke-" + i);
            totalNilai=0;
            for (j=1; j<=5; j++) {
                System.out.print(" Nilai ke-" + j + " = ");
                nilai = sc.nextFloat();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            i++;
            System.out.println(" Rata-rata nilai mahasiswa ke-" + i + " = " + rataNilai);
        }
        sc.close();
    }
}