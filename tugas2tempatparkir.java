import java.util.Scanner;

public class tugas2tempatparkir{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis               ;
        int durasi              ;
        int bayar               ;
        int i = 1               ;
        int TARIF_MOBIL = 3000  ;
        int TARIF_MOTOR = 2000  ;
        int totalPembayaran = 0 ;
        int jumlahKendaraan = 0 ;

        System.out.print("Masukkan jumlah kendaraan: ");
        jumlahKendaraan = sc.nextInt();

        System.out.println("1 = Mobil, 2 = Motor, 0 = Selesai");
      
        while (i <= jumlahKendaraan) {
            System.out.print("Masukkan jenis kendaraan ke" + i + ": ");
                jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            }

            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak ada .");
            } else {
                System.out.print("Masukkan lama parkir : ");
                durasi = sc.nextInt();

                if (durasi < 0) {
                    System.out.println(" nompang lewat .");
                } else {
                    if (jenis == 1) {
                        bayar = durasi * TARIF_MOBIL;
                    } else {
                        bayar = durasi * TARIF_MOTOR;
                    }

                    System.out.println("Biaya parkir: Rp." + bayar);
                    totalPembayaran += bayar;
                    i++;
                }
            }

        }

        System.out.println("Jumlah kendaraan : " + jumlahKendaraan);
        System.out.println("Total pembayaran : Rp." + totalPembayaran);

        sc.close();
    
    }
}