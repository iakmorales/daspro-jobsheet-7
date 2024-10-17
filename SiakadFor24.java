import java.util.Scanner;
/**
 * SiakadFor24
 */
public class SiakadFor24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double nilai, tertinggi = 0, terendah = 100, batas = 60;
        int lulus = 0, tidaklulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan  nilai mahasiswa ke- " + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= batas) {
                lulus++;
            }
            if (nilai <= batas) {
                tidaklulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Mahasiswa lulus " + lulus);
        System.out.println("Mahasiswa tidak lulus " + tidaklulus);
    }
}