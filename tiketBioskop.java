import java.util.Scanner;
public class tiketBioskop {
    public static void main(String[] args) {
        Scanner TB = new Scanner (System.in);
        
        int jumlahTiket, hargaTiket = 50000, totaltiketTerjual = 0;
        double hargaDiskon, totalbayar, totalPendapatan = 0;
        String namaPelanggan;
        
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'Batal' untuk keluar): ");
            namaPelanggan = TB.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Masukkan jumlah tiket: ");
            jumlahTiket = TB.nextInt();
            TB.nextLine();
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan jumlah yang valid!");
                continue;
            }
            if (jumlahTiket >= 4 && jumlahTiket <= 10) {
                System.out.println("Diskon 10%");
                hargaDiskon = (jumlahTiket * hargaTiket) * 10/100;
                totalbayar = (jumlahTiket * hargaTiket) - hargaDiskon;
                System.out.println("Total yang harus dibayar : Rp." + totalbayar);
            } else if (jumlahTiket > 10) {
                System.out.println("Diskon 15%");
                hargaDiskon = (jumlahTiket * hargaTiket) * 15/100;
                totalbayar = (jumlahTiket * hargaTiket) - hargaDiskon;
                System.out.println("Total yang harus dibayar : Rp." + totalbayar);
            } else {
                System.out.println("Tidak ada diskon");
                totalbayar = (jumlahTiket * hargaTiket);
                System.out.println("Total yang harus dibayar : Rp." + totalbayar);
            }

            totaltiketTerjual += jumlahTiket;
            totalPendapatan += totalbayar;
            
        } while (true);

          System.out.println("Transaksi selesai");
          System.out.println("\n--- Rekap Penjualan Hari Ini ---");
          System.out.println("Total tiket terjual: " + totaltiketTerjual);
          System.out.println("Total pendapatan: Rp" + totalPendapatan);

    }
}
