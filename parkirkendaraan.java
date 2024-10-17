import java.util.Scanner;
public class parkirkendaraan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int jenis, durasi, total = 0, totalbayar = 0;
        
         do { 
         System.out.println("--- jenis kendaraan ---");
         System.out.println("1. Mobil");
         System.out.println("2. Motor");
         System.out.println("0. berhenti");
         System.out.print("Masukkan kode jenis kendaraan anda (1, 2, atau 0): ");
         jenis = sc.nextInt();
         sc.nextLine();

         if( jenis == 1 || jenis ==2){
            System.out.print("Masukkan durasi parkir: ");
            durasi = sc.nextInt();

            total = 0;
            if(durasi > 5){
                total += 12500;
            }
            else if( jenis == 1){
                total += durasi * 3000;
            }
            else if( jenis == 2){
                total += durasi * 2000;
            }
        } else {
            System.out.println("Jenis kendaraan tidak valid, masukkan ulang!");
            continue;
        }
             totalbayar += total;
             System.out.println("Total pembayaran parkir: Rp." + total);
      }  while (jenis != 0);
         System.out.println("Total pembayaran parkir dari beberapa jenis kendaraan: Rp." + totalbayar); 


    }
}
